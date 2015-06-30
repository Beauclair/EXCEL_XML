package com.blaiso.excelxml.serializer;

public class TransportInformation {
	
	private static final long serialVersionUID = 1L;
	
	private static String UNKNOW_VALUE = "";
	
	private Carrier Carrier;
	
	private String Mode_of_transport_code;
	private String Identity_of_transporter;
	private String Nationality_of_transporter_code;
	private String Place_of_transporter;
	private String Registration_number_of_transport_code;
	private String Date_of_registration;
	private String Master_information;
	private String Date_of_last_discharge;
	
	public TransportInformation(){
		Carrier = new Carrier();
	}

	public Carrier getCarrier() {
		return Carrier;
	}

	public void setCarrier(Carrier carrier) {
		this.Carrier = carrier;
	}

	public String getMode_of_transport_code() {
		return Mode_of_transport_code;
	}

	public void setMode_of_transport_code(String mode_of_transport_code) {
		Mode_of_transport_code = mode_of_transport_code;
	}

	public String getIdentity_of_transporter() {
		return Identity_of_transporter;
	}

	public void setIdentity_of_transporter(String identity_of_transporter) {
		Identity_of_transporter = identity_of_transporter;
	}

	public String getNationality_of_transporter_code() {
		return Nationality_of_transporter_code;
	}

	public void setNationality_of_transporter_code(
			String nationality_of_transporter_code) {
		Nationality_of_transporter_code = nationality_of_transporter_code;
	}

	public String getPlace_of_transporter() {
		return Place_of_transporter;
	}

	public void setPlace_of_transporter(String place_of_transporter) {
		Place_of_transporter = place_of_transporter;
	}

	public String getRegistration_number_of_transport_code() {
		return Registration_number_of_transport_code;
	}

	public void setRegistration_number_of_transport_code(
			String registration_number_of_transport_code) {
		Registration_number_of_transport_code = registration_number_of_transport_code;
	}

	public String getDate_of_registration() {
		return Date_of_registration;
	}

	public void setDate_of_registration(String date_of_registration) {
		Date_of_registration = date_of_registration;
	}

	public String getMaster_information() {
		return Master_information;
	}

	public void setMaster_information(String master_information) {
		Master_information = master_information;
	}

	public String getDate_of_last_discharge() {
		return Date_of_last_discharge;
	}

	public void setDate_of_last_discharge(String date_of_last_discharge) {
		Date_of_last_discharge = date_of_last_discharge;
	}
	
	public void addCarrier(String cod, String name, String add1, String add2
			, String add3, String add4){
		
		try{Carrier.setCarrier_code(cod);}catch(Exception e){Carrier.setCarrier_code(UNKNOW_VALUE);}
		try{Carrier.setCarrier_name(name);}catch(Exception e){Carrier.setCarrier_name(UNKNOW_VALUE);}
		try{Carrier.setCarrier_address1(add1);}catch(Exception e){Carrier.setCarrier_address1(UNKNOW_VALUE);}
		try{Carrier.setCarrier_address2(add2);}catch(Exception e){Carrier.setCarrier_address2(UNKNOW_VALUE);}
		try{Carrier.setCarrier_address3(add3);}catch(Exception e){Carrier.setCarrier_address3(UNKNOW_VALUE);}
		try{Carrier.setCarrier_address4(add4);}catch(Exception e){Carrier.setCarrier_address4(UNKNOW_VALUE);}
	}
	
	public TransportInformation initData(String cod, String name, String add1, String add2
			, String add3, String add4,String mode_of_transport_code, String identity_of_transporter, String nationality_of_transporter_code
			, String place_of_transporter, String registration_number_of_transport_code, String date_of_registration
			, String master_information, String date_of_last_discharge){
		
		this.addCarrier(cod, name, add1, add2, add3, add4);
		setMode_of_transport_code(mode_of_transport_code);
		setIdentity_of_transporter(identity_of_transporter);
		setNationality_of_transporter_code(nationality_of_transporter_code);
		setPlace_of_transporter(place_of_transporter);
		setRegistration_number_of_transport_code(registration_number_of_transport_code);
		setDate_of_registration(date_of_registration);
		setMaster_information(master_information);
		setDate_of_last_discharge(date_of_last_discharge);
		return this;
		
	}
	

}
