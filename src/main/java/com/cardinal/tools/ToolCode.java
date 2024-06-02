package com.cardinal.tools;

//Enum for the tool available for rental
//each code corresponds to a Tool Type and a Brand
public enum ToolCode {
	CHNS("Chainsaw","Stihl"),
	LADW("Ladder","Werner"),
	JAKD("Jackhammer","DeWalt"),
	JAKR("Jackhammer","Ridgid");
	
	public final String toolType;
	public final String brand;
	
	
	ToolCode(String toolType, String toolBrand){
		this.toolType = toolType;
		this.brand = toolBrand;
	}
	
	public String getToolType() {
		return this.toolType;
	}
	
	public String getBrand() {
		return this.brand;
	}
}
