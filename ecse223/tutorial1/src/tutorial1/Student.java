package tutorial1;

import java.util.List;
import java.util.Map;

public class Student extends Person {

	int id;
	double gpa;
	
	List<String> courses;
	
	Map<String, String> grades;
	
	
	public Student(String name, String email, int id, double gpa) {
		super(name, email);
		this.id = id;
		this.gpa = gpa;
	}
}
