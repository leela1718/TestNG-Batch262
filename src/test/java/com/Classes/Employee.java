package com.Classes;

public class Employee extends Person {
	                //-----------------------4 Methods are inhirited
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
