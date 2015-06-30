package com.blaiso.excelxml.serializer;

public class CtnSegment {
	
	private static final long serialVersionUID = 1L;
	
	private String Ctn_reference;
	private String Type_of_container;
	private String Empty_Full;
	private String Marks1;
	private String Marks2;
	private String Marks3;
	private String Sealing_Party;
	
	public CtnSegment(){
		
	}
	
	public String getCtn_reference() {
		return Ctn_reference;
	}
	public void setCtn_reference(String ctn_reference) {
		Ctn_reference = ctn_reference;
	}
	public String getType_of_container() {
		return Type_of_container;
	}
	public void setType_of_container(String type_of_container) {
		Type_of_container = type_of_container;
	}
	public String getEmpty_Full() {
		return Empty_Full;
	}
	public void setEmpty_Full(String empty_Full) {
		Empty_Full = empty_Full;
	}
	public String getMarks1() {
		return Marks1;
	}
	public void setMarks1(String marks1) {
		Marks1 = marks1;
	}
	public String getMarks2() {
		return Marks2;
	}
	public void setMarks2(String marks2) {
		Marks2 = marks2;
	}
	public String getMarks3() {
		return Marks3;
	}
	public void setMarks3(String marks3) {
		Marks3 = marks3;
	}
	public String getSealing_Party() {
		return Sealing_Party;
	}
	public void setSealing_Party(String sealing_Party) {
		Sealing_Party = sealing_Party;
	}

}
