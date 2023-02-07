package runner;

import classes.Student;

public class TestStudentEquality {

	public static void main(String[] args) {
	Student st1 = new Student();
	Student st2 = new Student();
	Student st3 = st1;
	System.out.println(st1 == st2);
	System.out.println(st1 == st3);
		}
	}

// When ever we create a object in java, Object is stored in JVM Heap memory
// internally every object has some unique object location.