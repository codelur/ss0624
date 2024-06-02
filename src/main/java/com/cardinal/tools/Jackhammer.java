package com.cardinal.tools;

public class Jackhammer extends Tool{

	private static final String TYPE = "Jackhammer";
	
	public Jackhammer(ToolCode toolCode) {	
		super(toolCode);
		if(!toolCode.getToolType().equals(TYPE)) {
			throw new IllegalArgumentException("Invalid tool code for "+ TYPE);
		}
	}
	
}
