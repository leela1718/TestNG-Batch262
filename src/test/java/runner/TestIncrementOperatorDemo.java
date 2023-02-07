package runner;

public class TestIncrementOperatorDemo {

	public static void main(String[] args) {
		// pre increment
		int x = 10; // 11
		int y = ++x; // first increment the value of "x" and them assign to "y" // 11
		System.out.println(x);
		System.out.println(y); 
		// Post increment
		int v = 10; // 11
		int w = v++; // first assign the "v" value to "W" and then increment "v"(// 10)
		System.out.println(v);
		System.out.println(w);
	}
}
