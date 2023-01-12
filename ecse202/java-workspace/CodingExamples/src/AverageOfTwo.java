import acm.program.ConsoleProgram;

public class AverageOfTwo extends ConsoleProgram {

	public void run() {
		double avg = calculateAverageOf2(2, 1);
	}
	
	public double calculateAverageOf2(int a, int b) {
		int sum = a + b;
		return (double)sum/2;
	}
}
