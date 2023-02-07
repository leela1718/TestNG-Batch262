package runner;

public class WhileDemo {
	public static void main(String[] args) {
		int x = 2;
			while(x < 5) { // loop Start
				// loop body
				System.out.println("The value is :"+x);
				++x;
			} // loop Ends
		System.out.println("After loop..");
	}
}
