package runner;

public class NestedForLoop {

	public static void main(String[] args) {
		// Outer For Loop
		for(int i=0; i<5; i++) {
			// inner for loop
			for(int j=0; j<=i; j++) {
				System.out.print("*"+" " );
			}
			System.out.println();
		}

	}

}
