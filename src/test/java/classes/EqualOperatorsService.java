package classes;

public class EqualOperatorsService {
	public void equalOperators(int x,int y) {
		System.out.println(x==y); //false
		System.out.println(x != y); //true
	}
	public void equalsOperatorsForBoolean(boolean b1,boolean b2) {
		System.out.println(b1==b2); // false
		System.out.println(b1 != b2); //true
		//System.out.println(b1 <= b2); // CE
	}
}
