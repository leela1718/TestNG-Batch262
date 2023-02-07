package runner;

import classes.Product;
import classes.Student;
import classes.StudentRegistration;

public class TestStudent {

	public static void main(String[] args) {
		StudentRegistration srs = new StudentRegistration(); // object creation
		srs.foo(10); // method calling
		             // if a method is taking one primitive type as argument then we have to call
		              // that method by passing corresponding primitive value.
		// How to call if a method is talking Reference(Class type) type as argument
		// Step 1: Create the Object of that argument
		Student student = new Student();
		student.setStudentId(101);
		student.setStudentName("leela");
		srs.register(student); // method calling
		
		// Step 1: create the object to product
		Product product = new Product();
		product.setPid(90001);
		product.setpName("gowtham");
		srs.save(product); // method Calling
	}
}
