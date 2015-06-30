package com.blaiso.excelxml.serializer;

import java.util.ArrayList;

public class Manifeste {
	
	private static final long serialVersionUID = 1L;
	
	private General_segment General_segment;
	ArrayList<Bol_segment> Bol_segment_list;
	
	public Manifeste(){
		General_segment = new General_segment();
		Bol_segment_list = new ArrayList<Bol_segment>();
	}
	
	public General_segment getGeneral_segment() {
		return General_segment;
	}
	public void setGeneral_segment(General_segment general_segment) {
		General_segment = general_segment;
	}
	public ArrayList<Bol_segment> getBol_segment() {
		return Bol_segment_list;
	}
	public void setBol_segment(ArrayList<Bol_segment> bol_segment) {
		Bol_segment_list = bol_segment;
	}
	
	public void addElement(General_segment General_segment){
		if (this.General_segment == null) this.General_segment = new General_segment();
		this.General_segment = General_segment;
	}
	
	public void addElement(Bol_segment Bol_segment){
		if (this.Bol_segment_list == null) this.Bol_segment_list = new ArrayList<Bol_segment>();
		this.Bol_segment_list.add(Bol_segment);
	}

}
