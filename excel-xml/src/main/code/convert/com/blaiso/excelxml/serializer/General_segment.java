package com.blaiso.excelxml.serializer;

import jxl.Sheet;

public class General_segment {
	
	private static final long serialVersionUID = 1L;
	private static String UNKNOW_VALUE = "";
	
	private General_segment generalSegment;
	
	private GeneralSegmentId General_segment_id;
	private TotalsSegment Totals_segment;
	private TransportInformation Transport_information;
	private LoadUnloadPlace Load_unload_place;
	private Tonnage Tonnage;
	
	public General_segment(){
		General_segment_id = new GeneralSegmentId();
		Totals_segment = new TotalsSegment();
		Transport_information = new TransportInformation();
		Load_unload_place = new LoadUnloadPlace();
		Tonnage = new Tonnage();
	}

	public General_segment getGeneralSegment() {
		return generalSegment;
	}

	public void setGeneralSegment(General_segment generalSegment) {
		this.generalSegment = generalSegment;
	}

	public GeneralSegmentId getGeneral_segment_id() {
		return General_segment_id;
	}

	public void setGeneral_segment_id(GeneralSegmentId General_segment_id) {
		this.General_segment_id = General_segment_id;
	}

	public TotalsSegment getTotals_segment() {
		return Totals_segment;
	}

	public void setTotals_segment(TotalsSegment Totals_segment) {
		this.Totals_segment = Totals_segment;
	}

	public TransportInformation getTransport_information() {
		return Transport_information;
	}

	public void setTransport_information(TransportInformation Transport_information) {
		this.Transport_information = Transport_information;
	}

	public LoadUnloadPlace getLoad_unload_place() {
		return Load_unload_place;
	}

	public void setLoad_unload_place(LoadUnloadPlace Load_unload_place) {
		this.Load_unload_place = Load_unload_place;
	}

	public Tonnage getTonnage() {
		return Tonnage;
	}

	public void setTonnage(Tonnage Tonnage) {
		this.Tonnage = Tonnage;
	}
	
	public void addElement(General_segment p$elt) {

		if (generalSegment == null)
			generalSegment = new General_segment();
			generalSegment = p$elt;
	}
	
	public void addGeneralSegmentId(Sheet sheet){
		
		try{General_segment_id.setCustoms_office_code(sheet.getCell("A2").getContents());}catch(Exception e){General_segment_id.setCustoms_office_code(UNKNOW_VALUE);}
		try{General_segment_id.setVoyage_number(sheet.getCell("B2").getContents());}catch(Exception e){General_segment_id.setVoyage_number(UNKNOW_VALUE);}
		try{General_segment_id.setDate_of_departure(sheet.getCell("C2").getContents());}catch(Exception e){General_segment_id.setDate_of_departure(UNKNOW_VALUE);}
		try{General_segment_id.setDate_of_arrival(sheet.getCell("D2").getContents());}catch(Exception e){General_segment_id.setDate_of_arrival(UNKNOW_VALUE);}
		try{General_segment_id.setTime_of_arrival(sheet.getCell("E2").getContents());}catch(Exception e){General_segment_id.setTime_of_arrival(UNKNOW_VALUE);}
		
	}
	
	public void addTotalsSegment(Sheet sheet){
		
		try{Totals_segment.setTotal_number_of_bols(sheet.getCell("F2").getContents());}catch(Exception e){Totals_segment.setTotal_number_of_bols(UNKNOW_VALUE);}
		try{Totals_segment.setTotal_number_of_packages(sheet.getCell("G2").getContents());}catch(Exception e){Totals_segment.setTotal_number_of_packages(UNKNOW_VALUE);}
		try{Totals_segment.setTotal_number_of_containers(sheet.getCell("H2").getContents());}catch(Exception e){Totals_segment.setTotal_number_of_containers(UNKNOW_VALUE);}
		try{Totals_segment.setTotal_gross_mass(sheet.getCell("I2").getContents());}catch(Exception e){Totals_segment.setTotal_gross_mass(UNKNOW_VALUE);}
		
	}
	
	public void addTransportInformation(Sheet sheet){
		Transport_information.initData(sheet.getCell("J2").getContents(), sheet.getCell("K2").getContents(), sheet.getCell("L2").getContents(), 
						sheet.getCell("M2").getContents(), sheet.getCell("N2").getContents(), sheet.getCell("O2").getContents(), 
						sheet.getCell("P2").getContents(), sheet.getCell("Q2").getContents(), sheet.getCell("R2").getContents(), 
						sheet.getCell("S2").getContents(), sheet.getCell("T2").getContents(), sheet.getCell("U2").getContents(), 
						sheet.getCell("V2").getContents(), sheet.getCell("W2").getContents());
	}
	
	public void addLoadUnloadPlace(Sheet sheet){
		
		try{Load_unload_place.setPlace_of_departure_code(sheet.getCell("X2").getContents());}catch(Exception e){Load_unload_place.setPlace_of_departure_code(UNKNOW_VALUE);}
		try{Load_unload_place.setPlace_of_destination_code(sheet.getCell("Y2").getContents());}catch(Exception e){Load_unload_place.setPlace_of_destination_code(UNKNOW_VALUE);}
	}
	
	public void addTonnage(Sheet sheet){
		
		try{Tonnage.setTonnage_net_weight(sheet.getCell("Z2").getContents());}catch(Exception e){Tonnage.setTonnage_net_weight(UNKNOW_VALUE);}
		try{Tonnage.setTonnage_gross_weight(sheet.getCell("AA2").getContents());}catch(Exception e){Tonnage.setTonnage_gross_weight(UNKNOW_VALUE);}
		
	}
	
	public General_segment initData(Sheet sheet){
		addGeneralSegmentId(sheet);
		addTotalsSegment(sheet);
		addTransportInformation(sheet);
		addLoadUnloadPlace(sheet);
		addTonnage(sheet);
		return this;
	}

}
