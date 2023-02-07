package classes;

public class StudentRegistration {
	public void register(Student st) {
		// Write DB logic to save student details into DB.
		System.out.println(st.getStudentId());
		System.out.println(st.getStudentName());
	}
	public void save(Product p) {
		System.out.println(p.getPid());
		System.out.println(p.getpName());
		
	}
	public void foo(int x) { // If a method is taking one primitive type as argument
		System.out.println(x);
	}
}
