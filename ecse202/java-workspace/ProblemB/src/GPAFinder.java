import acm.program.ConsoleProgram;

/**
 * Program that sorts an array of Student objects and
 * searches for a student with a specified gpa.
 * 
 * @author kpoulin
 *
 */
public class GPAFinder extends ConsoleProgram {

	/**
	 * Main entry point of the program.
	 */
	public void run() {
		Student[] students = { new Student("A", 0, 3.3), new Student("B", 1, 2.1), new Student("C", 2, 4.0),
				new Student("D", 3, 2.2), new Student("E", 4, 3.8) };
		
		students = selectionSort(students);
		
		println("Sorted students:");
		for (int i = 0; i < students.length; i++) {
			println(students[i].toString() + "\n");
		}
		
		double gpaToFind = 2.2;

		println("Searching for student with GPA " + gpaToFind + " using iterative binary search...");
		int index = binarySearchIterative(students, gpaToFind);

		if (index == -1) {
			println("Student not found :(");
		} else {
			println(students[index].toString());
		}

		println("Searching for student with GPA " + gpaToFind + " using recursive binary search...");
		index = binarySearchRecursive(students, gpaToFind, 0, students.length);

		if (index == -1) {
			println("Student not found :(");
		} else {
			println(students[index].toString());
		}
		
		println("Program terminated.");
	}

	/**
	 * Uses the selection sort algorithm to sort an array of Students.
	 * 
	 * @param in array to sort.
	 * @return Sorted array of Student objects.
	 */
	public Student[] selectionSort(Student[] in) {
		for (int i = 0; i < in.length; i++) {
			int smallest = i;
			for (int j = i + 1; j < in.length; j++) {
				if (in[j].getGPA() < in[smallest].getGPA()) {
					smallest = j;
				}
			}
			
			Student temp = in[i];
			in[i] = in[smallest];
			in[smallest] = temp;
		}
		return in;
	}

	/**
	 * Uses an iterative binary search algorithm to find the student with the specified gpa.
	 * 
	 * Adapted from Prof. Ferrie's notes for ECSE202
	 * 
	 * @param sortedStudents student array to search in
	 * @param gpa gpa to search for
	 * @return position of found student in array, -1 if not found.
	 */
	public int binarySearchIterative(Student[] sortedStudents, double gpa) {
		int lh = 0;
		int rh = sortedStudents.length - 1;

		while (lh <= rh) {
			int mid = (lh + rh) / 2;

			if (gpa == sortedStudents[mid].getGPA()) {
				return mid;
			}
			if (gpa < sortedStudents[mid].getGPA()) {
				rh = mid - 1; // move our search area to the left half
			} else {
				lh = mid + 1; // move our search area to the right half
			}
		}
		return -1; // not found
	}

	/**
	 * 
	 * Uses an recursive binary search algorithm to find the student with the specified gpa.
	 * 
	 * @param sortedStudents student array to search in
	 * @param gpa gpa to search for
	 * @param start start index of search area
	 * @param end end index of search area
	 * @return
	 */
	public int binarySearchRecursive(Student[] sortedStudents, double gpa, int start, int end) {
		int mid = (start + end - 1) / 2;
		
		if (sortedStudents[mid].getGPA() == gpa) {
			return mid;
			
		} else if (start == end && sortedStudents[mid].getGPA() != gpa) {
			return -1;
			
		} else if (sortedStudents[mid].getGPA() < gpa) {
			return binarySearchRecursive(sortedStudents, gpa, mid + 1, end);
		
		} else {
			return binarySearchRecursive(sortedStudents, gpa, start, mid);
	}
	}
}
