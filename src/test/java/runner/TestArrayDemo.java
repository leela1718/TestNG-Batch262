package runner;

import classes.ArrayDemo;

public class TestArrayDemo {

	public static void main(String[] args) {
		// creating oject
		ArrayDemo ad = new ArrayDemo();
		ad.printNumber(10); // method calling/invoking/accessing
		
		int[] empIdsArr =new int[5]; // Array Creation
		empIdsArr[0]=101; // Array Initillization
		empIdsArr[1]=102;
		empIdsArr[2]=103;
		empIdsArr[3]=104;
		empIdsArr[4]=105;
		
		ad.printArrayElement(empIdsArr); //method calling /invoking/accessing
	}
}
