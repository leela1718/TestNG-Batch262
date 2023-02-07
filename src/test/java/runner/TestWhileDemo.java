package runner;

import classes.WhileService;
public class TestWhileDemo {
	public static void main(String[] args) {
		WhileService ws = new WhileService();
		int result = ws.findTotalSumOf1to10Numbers();
		System.out.println("sum of 1 to 10 numbers is :"+result);
		              // result is sum of 1 to 19 numbers is : 55
	}
}
