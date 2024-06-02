package com.cardinal.tools;

public class Chainsaw extends Tool{

	private static final String TYPE = "Chainsaw";
	
	public Chainsaw(ToolCode toolCode) {	
		super(toolCode);
		if(!toolCode.getToolType().equals(TYPE)) {
			throw new IllegalArgumentException("Invalid tool code for "+ TYPE);
		}
	}
	
}
