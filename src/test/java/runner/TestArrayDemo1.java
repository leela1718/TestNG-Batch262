package runner;
import classes.ArrayRetrival;
public class TestArrayDemo1 {
	public static void main(String[] args) {
		ArrayRetrival ar = new ArrayRetrival(); // object creation
		int[] empids = {10,20,30,40}; // array creation
		ar.getElementsFromArray(empids);
	}
}
