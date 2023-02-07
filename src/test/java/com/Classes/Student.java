package com.Classes;

public class Student extends Person {
	                //---------------------4 methods are inherited
	private String branchName;
	public String getCollageName() {
		return "CBIT";
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}
