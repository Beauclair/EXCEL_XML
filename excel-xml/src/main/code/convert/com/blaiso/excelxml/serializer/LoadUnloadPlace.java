package com.blaiso.excelxml.serializer;

public class LoadUnloadPlace {
	
	private static final long serialVersionUID = 1L;
	
	private String Place_of_departure_code;
	private String Place_of_destination_code;
	
	public LoadUnloadPlace(){
		
	}

	public String getPlace_of_departure_code() {
		return Place_of_departure_code;
	}

	public void setPlace_of_departure_code(String place_of_departure_code) {
		Place_of_departure_code = place_of_departure_code;
	}

	public String getPlace_of_destination_code() {
		return Place_of_destination_code;
	}

	public void setPlace_of_destination_code(String place_of_destination_code) {
		Place_of_destination_code = place_of_destination_code;
	}

}
