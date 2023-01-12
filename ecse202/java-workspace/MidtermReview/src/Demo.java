import java.util.Stack;

import acm.program.ConsoleProgram;

public class Demo extends ConsoleProgram {

	// Reverse a string char by char using a stack.
	
	public void run() {
		Stack<Character> stack = new Stack<Character>();
		String input = readLine("Enter string to reverse: ");
		println("hello");
		
		for (int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}
		
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char c = stack.pop();
			output = output + c;
		}
		
//		while(!stack.empty()) {
//			char c = stack.pop();
//			output = output + c;
//		}
		
		println(output);
		
	}
}