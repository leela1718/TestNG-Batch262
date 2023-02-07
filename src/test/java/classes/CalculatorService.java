package classes;

public class CalculatorService {
	public double calculateRateOfIntrest(double principleAmount, int time, double rateOfIntrest) {
		double result = (principleAmount* time* rateOfIntrest)/100;
		return result;
	}
}
