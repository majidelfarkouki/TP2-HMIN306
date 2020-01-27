package com.tp2.spoon.originalcode;

public class Motorcycle {

	protected String brand;
	protected boolean engineState = false;
	
	
	public Motorcycle(String brand, boolean engineState) {
		super();
		this.brand = brand;
		this.engineState = engineState;
	}
	
	
	public String showAtts() {
		
	    return "Motorcycle : " + System.getProperty("line.separator") + 
				"Brand : " + brand + System.getProperty("line.separator")
				+ "EngineState : " + engineState + System.getProperty("line.separator");
	}
	
}
