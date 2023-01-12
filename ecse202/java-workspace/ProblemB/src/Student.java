public class Student {
	
	private String name;
	private int id;
	private double gpa;

	public Student(String name, int id, double gpa) {
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public double getGPA() {
		return this.gpa;
	}
	
	public String toString() {
		return "Name: " + this.name + "\nId: " + this.id + "\nGPA: " + this.gpa;
	}
}
