package com.blaiso.excelxml.serializer;

public class Consignee {

	private static final long serialVersionUID = 1L;
	
	private String Consignee_code;
	private String Consignee_name;
	
	public Consignee(){
		
	}

	public String getConsignee_code() {
		return Consignee_code;
	}

	public void setConsignee_code(String Consignee_code) {
		this.Consignee_code = Consignee_code;
	}

	public String getConsignee_name() {
		return Consignee_name;
	}

	public void setConsignee_name(String Consignee_name) {
		this.Consignee_name = Consignee_name;
	}
}