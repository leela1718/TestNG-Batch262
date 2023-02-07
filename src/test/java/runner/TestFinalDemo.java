package runner;

public class TestFinalDemo {
	final int x = 100;   // x is a instance variable
	public static void main(String[] args) {
		TestFinalDemo tfd = new TestFinalDemo();
		System.out.println(tfd.x);
		// tfd.x = 101; // CE: re-assignment 
	}
}
