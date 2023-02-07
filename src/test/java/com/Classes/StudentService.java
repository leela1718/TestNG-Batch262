package com.Classes;

public class StudentService {
public Student1 getStudentDetails() {
	  // Here we need to write DB logic to retrieve student details and construct the student object
	Student1 st1= new Student1();
	// By using child class object we can access parent class properties and methods.
	st1.setAadharnumber(519823583003l);
	st1.setAddress("HYD");
	//child specific properties
	st1.setBranchName("MECH");
	return st1;
}
}

// if a method return type is class type then we have to create the object and return it.