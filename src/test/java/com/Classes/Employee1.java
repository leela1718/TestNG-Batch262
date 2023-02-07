package com.Classes;

public class Employee1 extends Person {
	private String designation;
	public String getCompanyName() {
		return "Cognizant";
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
