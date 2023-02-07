package runner;

public class TestDecrementOperatorDemo {

	public static void main(String[] args) {
		// Pre decrement
		int x = 10; //(9)
		int y = --x; // First decrement the value of "x" and the assign to "y"(9)
		System.out.println(x);
		System.out.println(y);
		// Post Decrement
		int v = 10; //(9)
		int w = v--; //first asign the 'v' value to 'w' variable and then decrement the value of 'v' //(10)
		System.out.println(v);
		System.out.println(w);
	}

}
