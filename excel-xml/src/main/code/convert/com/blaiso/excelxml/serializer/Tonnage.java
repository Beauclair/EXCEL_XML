package com.blaiso.excelxml.serializer;

public class Tonnage {

	private static final long serialVersionUID = 1L;
	
	private String Tonnage_net_weight;
	private String Tonnage_gross_weight;
	
	public Tonnage(){
		
	}
	
	public String getTonnage_net_weight() {
		return Tonnage_net_weight;
	}

	public void setTonnage_net_weight(String tonnage_net_weight) {
		Tonnage_net_weight = tonnage_net_weight;
	}

	public String getTonnage_gross_weight() {
		return Tonnage_gross_weight;
	}

	public void setTonnage_gross_weight(String tonnage_gross_weight) {
		Tonnage_gross_weight = tonnage_gross_weight;
	}
}
