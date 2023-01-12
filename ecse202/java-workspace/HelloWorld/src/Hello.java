import acm.program.ConsoleProgram;

// class declaration
public class Hello extends ConsoleProgram {

	int size = 2;
	
	public void run() {
		String eval = "2.35";
		int sliderValue = 4;
		String formatted = "%." + sliderValue + "f";
		String str = String.format("%." + sliderValue + "f", eval);
		System.out.println(str);
	}
}
