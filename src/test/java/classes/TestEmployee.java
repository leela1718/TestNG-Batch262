package classes;
public class TestEmployee {
	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		System.out.println(es.empId);
		String eName = es.getEmpName();
		System.out.println(eName);
	}
}
