package runner;

import classes.CalculatorService;

public class Testservice {

	public static void main(String[] args) {
		CalculatorService calserv = new CalculatorService();
		double result = calserv.calculateRateOfIntrest(20000.350, 2, 1.5);
		System.out.println(result);

	}

}
