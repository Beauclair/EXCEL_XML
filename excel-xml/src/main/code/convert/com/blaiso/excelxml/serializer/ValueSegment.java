package com.blaiso.excelxml.serializer;

public class ValueSegment {

	private static final long serialVersionUID = 1L;
	private static String UNKNOW_VALUE = "";
	
	private FreightSegment Freight_segment;
	private String Customs_segment;
	private String Insurance_segment;
	private String Transport_segment;
	
	public FreightSegment getFreight_segment() {
		return Freight_segment;
	}

	public void setFreight_segment(FreightSegment freight_segment) {
		Freight_segment = freight_segment;
	}

	public String getCustoms_segment() {
		return Customs_segment;
	}

	public void setCustoms_segment(String customs_segment) {
		Customs_segment = customs_segment;
	}

	public String getInsurance_segment() {
		return Insurance_segment;
	}

	public void setInsurance_segment(String insurance_segment) {
		Insurance_segment = insurance_segment;
	}

	public String getTransport_segment() {
		return Transport_segment;
	}

	public void setTransport_segment(String transport_segment) {
		Transport_segment = transport_segment;
	}

	public ValueSegment() {
		Freight_segment = new FreightSegment();
	}
	
	public void addFreightSegment(String pcInd){
		try{Freight_segment.setPC_indicator(pcInd);}catch(Exception e){Freight_segment.setPC_indicator(UNKNOW_VALUE);}
	}
	
	public ValueSegment initData(String pcInd, String Customs_segment, String Insurance_segment, String Transport_segment){
		this.addFreightSegment(pcInd);
		setCustoms_segment(Customs_segment);
		setInsurance_segment(Insurance_segment);
		setTransport_segment(Transport_segment);
		return this;
	}

}
