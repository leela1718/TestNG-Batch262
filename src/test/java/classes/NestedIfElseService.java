package classes;
public class NestedIfElseService {
	public String getStudentDistincationByTotalMarks(int totalMarks) {
		String result = null;
		if(totalMarks >= 360) {
			result = "FirstClass";
		} else if(totalMarks < 360 && totalMarks >= 240) {
			result = "SecondClass";
		} else if(totalMarks < 240 && totalMarks >= 200) {
			result = "ThirdClass";
		} else {
			result ="Failed";
		}
		return result;
	}
}
