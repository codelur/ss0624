package com.cardinal.tools;


public abstract class Tool {
	private final ToolCode toolCode;
	private final String toolType;
	private final String brand;
	private double dailyCharge;
	private boolean weekdayCharge;
	private boolean weekendCharge;
	private boolean holidayCharge;
	
	//the constructor only needs the toolCode 
	//to retrieve the values of all the other attributes
	public Tool(ToolCode toolCode) {		
		this.toolCode = toolCode;
		this.toolType = toolCode.getToolType();
		this.brand = toolCode.getBrand();
		
		try {
			ToolCharges toolCharges = ToolCharges.valueOf(toolCode.getToolType());
			this.dailyCharge = toolCharges.getDailyCharge();
			this.weekdayCharge = toolCharges.isWeekdayCharge();
			this.weekendCharge = toolCharges.isWeekendCharge();
			this.holidayCharge = toolCharges.isHolidayCharge();
		}catch (IllegalArgumentException e) {
			System.out.println("ERROR: Tool type: "+ toolCode.getToolType()+" not found on Tool Charges enum.\n");
			
		}
	}

	public ToolCode getToolCode() {
		return toolCode;
	}


	public String getToolType() {
		return toolType;
	}


	public String getBrand() {
		return brand;
	}

	public double getDailyCharge() {
		return dailyCharge;
	}

	public boolean isWeekdayCharge() {
		return weekdayCharge;
	}

	public boolean isWeekendCharge() {
		return weekendCharge;
	}

	public boolean isHolidayCharge() {
		return holidayCharge;
	}

	
	
	
}
