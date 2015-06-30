package com.blaiso.excelxml.serializer;

public class BolID {

	private static final long serialVersionUID = 1L;
	
	private String Bol_reference;
	private String Bol_nature;
//	private String Line_number;
	private String Bol_type_code;
	
	public BolID(){
		
	}

	public String getBol_reference() {
		return Bol_reference;
	}

	public void setBol_reference(String bol_reference) {
		Bol_reference = bol_reference;
	}

	public String getBol_nature() {
		return Bol_nature;
	}

	public void setBol_nature(String bol_nature) {
		Bol_nature = bol_nature;
	}

	public String getBol_type_code() {
		return Bol_type_code;
	}

	public void setBol_type_code(String bol_type_code) {
		Bol_type_code = bol_type_code;
	}

//	public void setLine_number(String line_number) {
//		Line_number = line_number;
//	}
//
//	public String getLine_number() {
//		return Line_number;
//	}
}
