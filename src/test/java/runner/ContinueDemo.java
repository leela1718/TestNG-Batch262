package runner;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) { // loop Starts
			if(i%2==0) { // If Block Starts
			continue;
			}
			System.out.println("i value is :"+ i);
		} // Loop ends
		System.out.println("Main Method Ends......");
	}
}

//ans
   //i value is :1
  //i value is :3
  //i value is :5
  //Main Method Ends......
