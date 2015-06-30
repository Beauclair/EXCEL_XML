package com.blaiso.excelxml.serializer;

public class TotalsSegment {
	
	private static final long serialVersionUID = 1L;
	
	private String Total_number_of_bols;
	private String Total_number_of_packages;
	private String Total_number_of_containers;
	private String Total_gross_mass;
	
	public TotalsSegment(){
		
	}

	public String getTotal_number_of_bols() {
		return Total_number_of_bols;
	}

	public void setTotal_number_of_bols(String total_number_of_bols) {
		Total_number_of_bols = total_number_of_bols;
	}

	public String getTotal_number_of_packages() {
		return Total_number_of_packages;
	}

	public void setTotal_number_of_packages(String total_number_of_packages) {
		Total_number_of_packages = total_number_of_packages;
	}

	public String getTotal_number_of_containers() {
		return Total_number_of_containers;
	}

	public void setTotal_number_of_containers(String total_number_of_containers) {
		Total_number_of_containers = total_number_of_containers;
	}

	public String getTotal_gross_mass() {
		return Total_gross_mass;
	}

	public void setTotal_gross_mass(String total_gross_mass) {
		Total_gross_mass = total_gross_mass;
	}

}
