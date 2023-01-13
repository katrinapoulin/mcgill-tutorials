package tutorial1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author kpoulin
 *
 */
public class Student extends Person {

	int id;
	double gpa;
	
	List<String> courses;
	
	Map<String, String> grades; // = null
	
	
	public Student(String name, String email, int id, double gpa) {
		super(name, email);
		this.id = id;
		this.gpa = gpa;
		grades = new HashMap<String, String>();
	}
	
	public void addCourse(String code, String grade) {
		grades.put(code, grade);
		
	}
	
	public String getGradeForCourse(String code) {
		String grade = grades.get(code);
		return grade;
	}
	
	public void printGrades()  {
		for (String c : grades.keySet()) {
			System.out.println(grades.get(c));
		}
	}
}
