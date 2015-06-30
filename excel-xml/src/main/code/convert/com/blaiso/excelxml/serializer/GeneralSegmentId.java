package com.blaiso.excelxml.serializer;

public class GeneralSegmentId {
	
	private static final long serialVersionUID = 1L;
	
	private String Customs_office_code;
	private String Voyage_number;
	private String Date_of_departure;
	private String Date_of_arrival;
	private String Time_of_arrival;
	
	public GeneralSegmentId(){
		
	}
	
	
	public String getCustoms_office_code() {
		return Customs_office_code;
	}
	public void setCustoms_office_code(String customs_office_code) {
		Customs_office_code = customs_office_code;
	}
	public String getVoyage_number() {
		return Voyage_number;
	}
	public void setVoyage_number(String voyage_number) {
		Voyage_number = voyage_number;
	}
	public String getDate_of_departure() {
		return Date_of_departure;
	}
	public void setDate_of_departure(String date_of_departure) {
		Date_of_departure = date_of_departure;
	}
	public String getDate_of_arrival() {
		return Date_of_arrival;
	}
	public void setDate_of_arrival(String date_of_arrival) {
		Date_of_arrival = date_of_arrival;
	}
	public String getTime_of_arrival() {
		return Time_of_arrival;
	}
	public void setTime_of_arrival(String time_of_arrival) {
		Time_of_arrival = time_of_arrival;
	}
	
	

}
