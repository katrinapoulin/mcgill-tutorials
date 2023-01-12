import java.util.Scanner;

/**
 * 
 * @author kpoulin
 *
 */
public class Main_Soln {
	
	static Factorial_Soln factorial;
	static int historySize = 3;
	static Integer[] history = new Integer[historySize] ;

	/**
	 * 
	 * @param args
	 */
	public static void mainn(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int historyCounter = 0;

		System.out.println("Factorial calculator");
		System.out.println("Type in base number and press Enter.");
		System.out.println("Blank line to terminate.\n");
		while (true) {
			System.out.print("> ");
			String line = s.nextLine();
			if (line.equals(""))
				break;

			// get base number
			int base = Integer.parseInt(line);

			factorial = new Factorial_Soln(base);
			// update result
			factorial.calculate();
			int result = factorial.getResult();

			// print result
			System.out.println("The factorial of " + factorial.getBase() + " is " + result + ".\n");
			
			// update history
			history[historyCounter] = result;
			historyCounter = (historyCounter + 1) % historySize;
			
			printHistory();
		}
		System.out.print("Program terminated.");
		System.exit(0);
	}
	
	public static void printHistory() {
		// print history
		System.out.println("Last 3 results:");
		for (int i = 0; i < historySize; i++) {
			if (history[i] == null) continue;
			System.out.println(history[i]);
		}
		System.out.println("");
	}

}
