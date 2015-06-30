package com.blaiso.excelxml.source;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jxl.Sheet;
import jxl.Workbook;
import jxl.demo.XML;

import com.blaiso.excelxml.serializer.Bol_segment;
import com.blaiso.excelxml.serializer.General_segment;
import com.blaiso.excelxml.serializer.GoodsDetailSegment;
import com.blaiso.excelxml.serializer.GoodsSegment;
import com.blaiso.excelxml.serializer.GoodsSegmentBoucle;
import com.blaiso.excelxml.util.MapEntryConverter;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class ConvertExcelXml {
	
	@SuppressWarnings("unused")
	private XML xml;
	private Workbook workbook;
	public static final String XML_ENCODING = "ISO-8859-1"; //"UTF-8"; 
	
	public ConvertExcelXml(){
		
	}
	private static XStream serializer = null;
		
	static{
		serializer = new XStream(new DomDriver(XML_ENCODING));
		serializer.registerConverter(new MapEntryConverter());
		serializer.alias("General_segment", General_segment.class);
		serializer.alias("Bol_segment", Bol_segment.class);
		serializer.alias("Goods_detail_segment", GoodsDetailSegment.class);
		serializer.aliasField("Goods_segment", Bol_segment.class,"Goods_segment_Boucle");
		serializer.aliasField("null", GoodsSegmentBoucle.class,"List_Goods_detail_segment");
	}
		
	private static String getXmlStream(Object entity) {
			String v$xmlString = "";			
			v$xmlString = serializer.toXML(entity);
			return v$xmlString;
	}
	
	private General_segment getGeneralSegment(Sheet sheet){
		System.out.println("ConvertExcelXml.getGeneralSegment : Serialisation....");
		General_segment genSeg = new General_segment();
		genSeg.initData(sheet);
		return genSeg;
	}
	
	private Bol_segment getBolSegment(Sheet sheet, int i){
		System.out.println("ConvertExcelXml.getBolSegment : Serialisation....");
		Bol_segment bolSeg = new Bol_segment();
		bolSeg.initData(sheet,i);
		return bolSeg;
	}
	
	private Bol_segment getBolSegmentBoucle(Sheet sheet, int i, List<Integer> elts){
		System.out.println("ConvertExcelXml.getBolSegmentBoucle : Serialisation....");
		Bol_segment bolSeg = new Bol_segment();
		bolSeg.initDataBoucle(sheet,i,elts);
		return bolSeg;
	}
	
	public void genererFichierXml(String cheminExcel, String chemeinXml){
		try {
			System.out.println("[genererFichierXml] generation de la source XML");
			/* Récupération du classeur Excel (en lecture) */
			workbook = Workbook.getWorkbook(new File(cheminExcel));
			/* Un fichier excel est composé de plusieurs feuilles, on y accède à la premiére*/
			Sheet sheet = workbook.getSheet(0);
			int rows = sheet.getRows();
			// generer la source xml
			String xmlString = getXmlStream(getGeneralSegment(sheet));
//			List<Integer> elt = new ArrayList<Integer>();
//			int k=2;
//			for(int i = 2; i<=rows;){
//				k=i+1;
//				System.out.println("rows == " + rows);
//				System.out.println("i == " + i);
//				System.out.println("i+1 == " + k);
//				if(i+1<rows && sheet.getCell("AB"+i).getContents().equals(sheet.getCell("AB"+k).getContents())){
//					System.out.println("J'y suis");
//					elt.add(i);
//					k=i+1;
//					int tmp = k-1;
//					while(k<=rows && sheet.getCell("AB"+k).getContents().equals(sheet.getCell("AB"+tmp).getContents())){
//						elt.add(k);
//						k++;
//						tmp = k-1;
//					}
//					xmlString = xmlString + "\n"+getXmlStream(getBolSegmentBoucle(sheet, i,elt));
//					i=k;
//				}else{
//					xmlString = xmlString + "\n"+getXmlStream(getBolSegment(sheet, i));
//					i++;
//				}
//			}
			// New - l'ancien commenté marche
			Map<String,ArrayList<Integer>> map= new HashMap<String,ArrayList<Integer>>();
			ArrayList<String> list= new ArrayList<String>();
			for(int i=2;i<=rows;i++){
				if(map.containsKey(sheet.getCell("AB"+i).getContents())){
					map.get(sheet.getCell("AB"+i).getContents()).add(i);
					
				}
				else{
					ArrayList<Integer > mylist=new ArrayList<Integer>();
					list.add(sheet.getCell("AB"+i).getContents());
					mylist.add(i);
					map.put(sheet.getCell("AB"+i).getContents(),mylist );
				}
			}
			
			for(String key:list){
					if((map.get(key).size()==1)){
						xmlString = xmlString + "\n"+getXmlStream(getBolSegment(sheet, map.get(key).get(0)));
					}
					else if((map.get(key).size()>1)){
						xmlString = xmlString + "\n"+getXmlStream(getBolSegmentBoucle(sheet, map.get(key).get(0),map.get(key)));
						
					}
				}
			xmlString = xmlString.replaceAll("__", "_");
			xmlString = xmlString.replaceAll("<null>", "");
			xmlString = xmlString.replaceAll("</null>", "");
			String versionXml = "<?xml version=\"1.0\" encoding=\"" + XML_ENCODING + "\"?>\n";
			versionXml = versionXml +"<Manifeste xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" +"\n";
			// produire le fichier Xml		
			File xmlFile = new File(chemeinXml);
			// Enrégistrement du résultat dans un fichier
			FileWriter fw = new FileWriter(xmlFile);
			fw.write(versionXml);		
			//Ecriture du contenu XML
			fw.write(xmlString);
			fw.write("\n</Manifeste>");
			fw.close();
			System.out.println("[genererFichierXml] Fin de generation de la source XML");
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	
//	public static void main(String [] arg0){
//		ConvertExcelXml con = new ConvertExcelXml();
//		con.genererFichierXml();
//	}

}
