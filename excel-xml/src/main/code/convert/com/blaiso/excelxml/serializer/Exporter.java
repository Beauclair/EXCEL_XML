package com.blaiso.excelxml.serializer;

public class Exporter {
	
	private static final long serialVersionUID = 1L;

	private String Exporter_name;
	private String Exporter_address1;
//	private String Exporter_address2;
	
	public Exporter(){
		
	}

	public String getExporter_name() {
		return Exporter_name;
	}

	public void setExporter_name(String exporter_name) {
		Exporter_name = exporter_name;
	}

	public String getExporter_address1() {
		return Exporter_address1;
	}

	public void setExporter_address1(String exporter_address1) {
		Exporter_address1 = exporter_address1;
	}

//	public void setExporter_address2(String exporter_address2) {
//		Exporter_address2 = exporter_address2;
//	}
//
//	public String getExporter_address2() {
//		return Exporter_address2;
//	}
}
