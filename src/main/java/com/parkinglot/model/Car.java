package com.parkinglot.model;

public class Car {
	private String registrationNo;
	
	private String colour;

	public Car(String registrationNo, String colour) {
		this.registrationNo = registrationNo;
		this.colour = colour;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public String getColour() {
		return colour;
	}
}
