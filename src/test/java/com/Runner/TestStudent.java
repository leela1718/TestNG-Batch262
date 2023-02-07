package com.Runner;

import com.Classes.Student1;
import com.Classes.StudentService;

public class TestStudent {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		Student1 st = studentService.getStudentDetails();
		System.out.println("Student AAdharName:"+st.getAadharnumber());
		System.out.println("Student Adderss:"+st.getAddress());
		System.out.println("Student CollageName:"+st.getcollageName());
		System.out.println("Student BrnchName:"+st.getBranchName());

	}

}
