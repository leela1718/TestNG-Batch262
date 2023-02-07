package runner;

import classes.Customer;

public class TestCustmore {

	public static void main(String[] args) {
		// accessing instance variable by using object
		 Customer cust = new Customer();
		 System.out.println(cust.custID); // 1001
		 System.out.println(cust.custName); // gowtham
		 //Accessing static variables using Class name
		 System.out.println( Customer.countryCode); // IND
		 System.out.println( Customer.x); // 100

	}

}
