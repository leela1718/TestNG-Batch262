package runner;

public class BreakLoop {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {   // Loop Start
			System.out.println(i);
			if(i==5) {
				break;
			}
		}     // loop ends
		System.out.println("After loop......");
	}
	}