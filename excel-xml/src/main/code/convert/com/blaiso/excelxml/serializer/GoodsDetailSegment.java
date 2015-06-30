package com.blaiso.excelxml.serializer;

public class GoodsDetailSegment {

	private static final long serialVersionUID = 1L;
	private static String UNKNOW_VALUE = "";
	
	private String Package_type_code;
	private String Goods_description;
	private String Shipping_marks;
	private String Gross_mass;
	private String Number_of_packages;
	private String Volume_in_cubic_meters;
	private SealsSegment Seals_segment;
	
	public GoodsDetailSegment(){
		Seals_segment = new SealsSegment();
	}
	
	public String getPackage_type_code() {
		return Package_type_code;
	}
	public void setPackage_type_code(String package_type_code) {
		Package_type_code = package_type_code;
	}
	public String getGoods_description() {
		return Goods_description;
	}
	public void setGoods_description(String goods_description) {
		Goods_description = goods_description;
	}
	public String getShipping_marks() {
		return Shipping_marks;
	}
	public void setShipping_marks(String shipping_marks) {
		Shipping_marks = shipping_marks;
	}
	public String getGross_mass() {
		return Gross_mass;
	}
	public void setGross_mass(String gross_mass) {
		Gross_mass = gross_mass;
	}
	public String getNumber_of_packages() {
		return Number_of_packages;
	}
	public void setNumber_of_packages(String number_of_packages) {
		Number_of_packages = number_of_packages;
	}
	
	public void setVolume_in_cubic_meters(String volume_in_cubic_meters) {
		Volume_in_cubic_meters = volume_in_cubic_meters;
	}

	public String getVolume_in_cubic_meters() {
		return Volume_in_cubic_meters;
	}

	public void setSeals_segment(SealsSegment seals_segment) {
		Seals_segment = seals_segment;
	}

	public SealsSegment getSeals_segment() {
		return Seals_segment;
	}
	
	public void addSealsSegment(String markSeals){
		try{Seals_segment.setMarks_of_seals(markSeals);}catch(Exception e){Seals_segment.setMarks_of_seals(UNKNOW_VALUE);}
	}
	
	public GoodsDetailSegment initData(String Package_type_code,String Goods_description,String Shipping_marks,String Gross_mass,
			String Number_of_packages, String Volume_in_cubic_meters, String Marks_of_seals	){
		setPackage_type_code(Package_type_code);
		setGoods_description(Goods_description);
		setShipping_marks(Shipping_marks);
		setGross_mass(Gross_mass);
		setNumber_of_packages(Number_of_packages);
		setVolume_in_cubic_meters(Volume_in_cubic_meters);
		this.addSealsSegment(Marks_of_seals);
		
		return this;
	}
}
