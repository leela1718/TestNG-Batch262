package classes;
public class EnhancedForLoop {
	public void retrivePremitiveArrayElements(int[] empIdsArr) {
		for(int empIds:empIdsArr) {
			System.out.println(empIds);
		}
	}
	public void retriveReferenceArrayElements(String[] stNamesArr) {
		for(String stNames:stNamesArr) {
			System.out.println(stNames);	
		}
	}
}

