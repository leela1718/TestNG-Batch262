package runner;

import classes.StrArryDemo;

public class TestStrArrayDemo {

	public static void main(String[] args) {
		StrArryDemo sademo = new StrArryDemo(); // Demo Creation
		
		String[] snameArr =new String[4]; // string Array creation
		snameArr[0]="raja"; //Array initialization
		snameArr[1]="Mannepalli";
		snameArr[2]="Leela";
		snameArr[3]="Gowtham";
		sademo.printStringElements(snameArr); // Method callinh/Invoking/accessing
		System.out.println(snameArr.length);
	}

}
