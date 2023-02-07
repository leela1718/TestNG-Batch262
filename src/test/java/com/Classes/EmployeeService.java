package com.Classes;

public class EmployeeService {
public Employee1 getEmployeeDetails() {
	// Here we need to write DB logic to retrieve employee details and construct the employee object
	Employee1 employee1= new Employee1();
	// Employee is reference variable name
	// Employee is a Class name
	// accsessing parent class properties by using child class reference/object 
	employee1.setAadharnumber(519823583003l);
	employee1.setAddress("Vijayaawada");
	//child specific properties
	employee1.setDesignation("QA Lead");
	
	return employee1;
}
}
