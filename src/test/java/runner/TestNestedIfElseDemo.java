package runner;

import classes.NestedIfElseService;

public class TestNestedIfElseDemo {

	public static void main(String[] args) {
		NestedIfElseService nes = new NestedIfElseService();
		//String stResult = nes.getStudentDistincationByTotalMarks(380); // "FirstClass"
		//String stResult = nes.getStudentDistincationByTotalMarks(250); // "Second Class"
		//String stResult = nes.getStudentDistincationByTotalMarks(220); // "Third Class"
		String stResult = nes.getStudentDistincationByTotalMarks(160); // "Failed"
		System.out.println(stResult);
	}
}
