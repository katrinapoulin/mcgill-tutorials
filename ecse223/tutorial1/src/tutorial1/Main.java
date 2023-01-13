package tutorial1;

/**
 * 
 * @author kpoulin
 *
 */
public class Main {

	public static void main(String[] args) {
		Student s = new Student("Katrina", "@mcgill", 260000000, 2);
		s.addCourse("ECSE202", "A-");
		 String myGrade = s.getGradeForCourse("ECSE202");
		 System.out.println(myGrade);
	}
}
