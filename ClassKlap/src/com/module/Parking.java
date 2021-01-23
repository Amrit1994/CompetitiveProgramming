package com.module;

public class Parking {

	private int slotNo;
	private String registrationNo;
	private String colour;
	
	public Parking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Parking(String registrationNo, String colour) {
		super();
		//this.slotNo = slotNo;
		this.registrationNo = registrationNo;
		this.colour = colour;
	}
	
	public int getSlotNo() {
		return slotNo;
	}
	public void setSlotNo(int slotNo) {
		this.slotNo = slotNo;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
}
