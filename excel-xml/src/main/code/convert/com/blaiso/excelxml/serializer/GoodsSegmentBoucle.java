package com.blaiso.excelxml.serializer;

import java.util.ArrayList;
import java.util.List;

import jxl.Sheet;

public class GoodsSegmentBoucle {
	
	private static final long serialVersionUID = 1L;
	private static String UNKNOW_VALUE = "";

	private String Number_of_packages;
	private String Gross_mass;
	private String Volume_in_cubic_meters;
	private String Num_of_ctn_for_this_bol;
	
	List<GoodsDetailSegment> List_Goods_detail_segment;

	
	public GoodsSegmentBoucle(){
		List_Goods_detail_segment = new ArrayList<GoodsDetailSegment>();
	}

	public String getNumber_of_packages() {
		return Number_of_packages;
	}

	public void setNumber_of_packages(String number_of_packages) {
		Number_of_packages = number_of_packages;
	}

	public String getGross_mass() {
		return Gross_mass;
	}

	public void setGross_mass(String gross_mass) {
		Gross_mass = gross_mass;
	}

	public String getNum_of_ctn_for_this_bol() {
		return Num_of_ctn_for_this_bol;
	}

	public void setNum_of_ctn_for_this_bol(String num_of_ctn_for_this_bol) {
		Num_of_ctn_for_this_bol = num_of_ctn_for_this_bol;
	}

	public void setVolume_in_cubic_meters(String volume_in_cubic_meters) {
		Volume_in_cubic_meters = volume_in_cubic_meters;
	}

	public String getVolume_in_cubic_meters() {
		return Volume_in_cubic_meters;
	}
	
	public GoodsSegmentBoucle initDataBoucle(Sheet sheet, int i, List<Integer> pas){
		
		setNumber_of_packages(sheet.getCell("AM"+i).getContents());
		setGross_mass(sheet.getCell("AN"+i).getContents());
		setVolume_in_cubic_meters(sheet.getCell("AO"+i).getContents());
		setNum_of_ctn_for_this_bol(sheet.getCell("AP"+i).getContents());
		
		for(int j = 0; j< pas.size(); j++){
			int k = pas.get(j);
			this.addElement(new GoodsDetailSegment().initData(sheet.getCell("AQ"+k).getContents(), sheet.getCell("AR"+k).getContents()
					, sheet.getCell("AS"+k).getContents(), sheet.getCell("AT"+k).getContents()
					, sheet.getCell("AU"+k).getContents(), sheet.getCell("AV"+k).getContents(), sheet.getCell("AW"+k).getContents()));
		}
		return this;
		
	}
	
	public void addElement(GoodsDetailSegment elt){
		if(List_Goods_detail_segment == null) List_Goods_detail_segment = new ArrayList<GoodsDetailSegment>();
		List_Goods_detail_segment.add(elt);
	}

}
