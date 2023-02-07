 package runner;

import classes.StudentDetailServices;

public class TestStudentDetails {

	public static void main(String[] args) {
		// Create object
		StudentDetailServices sdserv = new StudentDetailServices();
		// call/invoke/access instance variables by using object
		System.out.println(sdserv.sId); //101
		System.out.println(sdserv.sName); //leela
		System.out.println(sdserv.sBranch); // mech
			}

}
