package runner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		int x = 10; int y = 20;
		int result = (x < y) ? (x + y) : (x * y); // here (x < y) --- 1
		System.out.println(result);
		
		int result1 = (x > y) ? (x + y) : (x * y); // here (x > y) ---- 2
		System.out.println(result1);
	}
}
