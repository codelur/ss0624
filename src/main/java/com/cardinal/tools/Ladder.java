package com.cardinal.tools;


public class Ladder extends Tool {

	private static final String TYPE = "Ladder";
	
	public Ladder(ToolCode toolCode) {	
		super(toolCode);
		if(!toolCode.getToolType().equals(TYPE)) {
			throw new IllegalArgumentException("Invalid tool code for "+ TYPE);
		}
	}
	

}
