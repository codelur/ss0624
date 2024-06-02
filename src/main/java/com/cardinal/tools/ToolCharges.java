package com.cardinal.tools;

//emun created to save the values for the charges of each tool
public enum ToolCharges {
	Ladder(1.99,true,true,false),
	Chainsaw(1.49,true,false,true),
	Jackhammer(2.99,true,false,false);
	
	public final double dailyCharge;
	public final boolean weekdayCharge;
	public final boolean weekendCharge;
	public final boolean holidayCharge;

	ToolCharges(double dailyCharge, boolean weekdayCharge, boolean weekendCharge, boolean holidayCharge) {	
		this.dailyCharge = dailyCharge;
		this.weekdayCharge = weekdayCharge;
		this.weekendCharge = weekendCharge;
		this.holidayCharge = holidayCharge;
	}
	
	public double getDailyCharge() {
		return this.dailyCharge;
	}
	
	public boolean isWeekdayCharge() {
		return this.weekdayCharge;
	}
	
	public boolean isWeekendCharge() {
		return this.weekendCharge;
	}
	
	public boolean isHolidayCharge() {
		return this.holidayCharge;
	}
}
