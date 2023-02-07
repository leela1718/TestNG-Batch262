package runner;
import classes.EnhancedForLoop;
public class TestEnhancedForLoop {
	public static void main(String[] args) {
		EnhancedForLoop efl = new EnhancedForLoop();
		int[] empIds = {10,20,30,40};
		efl.retrivePremitiveArrayElements(empIds);
		String[] stNamesArr = {"Leela", "Gowtham","Mannepalli"};
		efl.retriveReferenceArrayElements(stNamesArr);
	}	
}

