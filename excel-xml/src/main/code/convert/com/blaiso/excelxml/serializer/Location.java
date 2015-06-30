package com.blaiso.excelxml.serializer;

public class Location {
	
	private static final long serialVersionUID = 1L;
	
	private String Location_code;
	private String Location_info;
	
	public Location(){
		
	}

	public String getLocation_code() {
		return Location_code;
	}

	public void setLocation_code(String location_code) {
		Location_code = location_code;
	}

	public String getLocation_info() {
		return Location_info;
	}

	public void setLocation_info(String location_info) {
		Location_info = location_info;
	}
}
