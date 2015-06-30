package com.blaiso.excelxml.serializer;


public class GoodsSegment {
	
	private static final long serialVersionUID = 1L;
	private static String UNKNOW_VALUE = "";

	private String Number_of_packages;
	private String Gross_mass;
	private String Volume_in_cubic_meters;
	private String Num_of_ctn_for_this_bol;
	
	GoodsDetailSegment Goods_detail_segment;
//	List<GoodsDetailSegment> List_Goods_detail_segment;

	
	public GoodsSegment(){
		Goods_detail_segment = new GoodsDetailSegment();
//		List_Goods_detail_segment = new ArrayList<GoodsDetailSegment>();
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

	public GoodsDetailSegment getGoods_detail_segment() {
		return Goods_detail_segment;
	}

	public void setGoods_detail_segment(GoodsDetailSegment goods_detail_segment) {
		Goods_detail_segment = goods_detail_segment;
	}
	
	public void setVolume_in_cubic_meters(String volume_in_cubic_meters) {
		Volume_in_cubic_meters = volume_in_cubic_meters;
	}

	public String getVolume_in_cubic_meters() {
		return Volume_in_cubic_meters;
	}
	
	public GoodsSegment initData(String Number_of_packages, String Gross_mass, String Volume_in_cubic_meters, String Num_of_ctn_for_this_bol, 
			String Packtypcode, String Godescr, String Shipmarks, String Grosmass, String Numpack, String volincubic, String Marks_of_seals){
		
		setNumber_of_packages(Number_of_packages);
		setGross_mass(Gross_mass);
		setVolume_in_cubic_meters(Volume_in_cubic_meters);
		setNum_of_ctn_for_this_bol(Num_of_ctn_for_this_bol);
		this.Goods_detail_segment.initData(Packtypcode, Godescr, Shipmarks, Grosmass, Numpack, volincubic, Marks_of_seals);
		return this;
		
	}
	
//	public GoodsSegment initDataBoucle(Sheet sheet, int i, List<Integer> pas){
//		
//		setNumber_of_packages(sheet.getCell("AM"+i).getContents());
//		setGross_mass(sheet.getCell("AN"+i).getContents());
//		setVolume_in_cubic_meters(sheet.getCell("AO"+i).getContents());
//		setNum_of_ctn_for_this_bol(sheet.getCell("AP"+i).getContents());
//		
//		for(int j = 0; j< pas.size(); j++){
//			int k = pas.get(j);
//			this.addElement(new GoodsDetailSegment().initData(sheet.getCell("AQ"+k).getContents(), sheet.getCell("AR"+k).getContents()
//					, sheet.getCell("AS"+k).getContents(), sheet.getCell("AT"+k).getContents()
//					, sheet.getCell("AU"+k).getContents(), sheet.getCell("AV"+k).getContents(), sheet.getCell("AW"+k).getContents()));
//		}
//		return this;
//		
//	}
//	
//	public void addElement(GoodsDetailSegment elt){
//		if(List_Goods_detail_segment == null) List_Goods_detail_segment = new ArrayList<GoodsDetailSegment>();
//		List_Goods_detail_segment.add(elt);
//	}

}
