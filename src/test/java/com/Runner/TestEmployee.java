package com.Runner;

import com.Classes.Employee1;
import com.Classes.EmployeeService;

public class TestEmployee {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Employee1 emp = employeeService.getEmployeeDetails();
		System.out.println("Employee AAdharName:"+emp.getAadharnumber());
		System.out.println("Employee Address:"+emp.getAddress());
		System.out.println("Employee CompanyName:"+emp.getCompanyName());
		System.out.println("Employee Designation:"+emp.getDesignation());

	}

}
