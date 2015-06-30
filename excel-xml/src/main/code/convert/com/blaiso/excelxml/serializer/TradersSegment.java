package com.blaiso.excelxml.serializer;

public class TradersSegment {
	
	private static final long serialVersionUID = 1L;
	
	private static String UNKNOW_VALUE = "";
	
	private Exporter Exporter;
	private Notify Notify;
	private Consignee Consignee;
	
	public TradersSegment(){
		Exporter = new Exporter();
		Notify = new Notify();
		Consignee = new Consignee();
		
	}

	public Exporter getExporter() {
		return Exporter;
	}

	public void setExporter(Exporter exporter) {
		Exporter = exporter;
	}

	public Notify getNotify() {
		return Notify;
	}

	public void setNotify(Notify notify) {
		Notify = notify;
	}

	public Consignee getConsignee() {
		return Consignee;
	}

	public void setConsignee(Consignee consignee) {
		Consignee = consignee;
	}
	
	
	public void addExporter(String exportName, String add1/*,String add2*/){
		try{Exporter.setExporter_name(exportName);}catch(Exception e){Exporter.setExporter_name(UNKNOW_VALUE);}
		try{Exporter.setExporter_address1(add1);}catch(Exception e){Exporter.setExporter_address1(UNKNOW_VALUE);}
//		try{Exporter.setExporter_address2(add2);}catch(Exception e){Exporter.setExporter_address2(UNKNOW_VALUE);}
	}
	
	public void addNotify(String code,String name/*, String add1,String add2,String add3,String add4*/){
		try{Notify.setNotify_code(code);}catch(Exception e){Notify.setNotify_code(UNKNOW_VALUE);}
		try{Notify.setNotify_name(name);}catch(Exception e){Notify.setNotify_name(UNKNOW_VALUE);}
//		try{Notify.setNotify_address1(add1);}catch(Exception e){Notify.setNotify_address1(UNKNOW_VALUE);}
//		try{Notify.setNotify_address2(add2);}catch(Exception e){Notify.setNotify_address2(UNKNOW_VALUE);}
//		try{Notify.setNotify_address3(add2);}catch(Exception e){Notify.setNotify_address3(UNKNOW_VALUE);}
//		try{Notify.setNotify_address4(add2);}catch(Exception e){Notify.setNotify_address4(UNKNOW_VALUE);}
	}
	
	public void addConsignee(String conCode, String conName){
		try{Consignee.setConsignee_code(conCode);}catch(Exception e){Consignee.setConsignee_code(UNKNOW_VALUE);}
		try{Consignee.setConsignee_name(conName);}catch(Exception e){Consignee.setConsignee_name(UNKNOW_VALUE);}
	}
	
	public TradersSegment initData(String expName, String expadd1/*,String expadd2*/,String notcode,String notname, /*String notadd1
			,String notadd2,String notadd3,String notadd4,*/String conCode, String conName){
		this.addExporter(expName, expadd1);
		this.addNotify(notcode, notname/*, notadd1, notadd2, notadd3, notadd4*/);
		this.addConsignee(conCode, conName);
		return this;
	}

}
