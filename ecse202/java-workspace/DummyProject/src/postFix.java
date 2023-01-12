// The code below was taken from Katrina in the tutorial with changes made that will be documented. 
import java.util.StringTokenizer;

public class postFix {

	Character[] operators = {'+', '-', '/', '*', '^'};//array of  operators here
	Integer [] precedences = {2, 2, 3, 3, 4}; //listed is precedences for the respective operators above
	/**
	 * Take in a string entered by user(infix notation)
	 * and return a Queue of these elements, in the same order
	 * @param arg
	 * @return
	 */
	public Queue parse(String arg) {
		arg.replaceAll("\\s+", ""); 
		Queue Qin = new Queue();
		StringTokenizer st = new StringTokenizer(arg,"+-*/^()", true);
		while (st.hasMoreTokens()) {
			Qin.enqueue(st.nextToken()); 
		}
		return Qin; 
	}
	/** We have a seperate class for In2P, it essentially outputs our Queue
	 * @param Qin
	 * @return Qout
	 */
	public Queue In2Post(Queue Qin) {
		Stack stack = new Stack();
		Queue Qout = new Queue(); 
		
		String e;
		
		while((e=Qin.dequeue()) != null) {
			if (isOperator(e)) {
				while (stack.top != null) {
						String stackTop=stack.pop(); 					// pop top
						if (precedence(stackTop) >= precedence(e)) {	// compare it with precedence at top of stack
							Qout.enqueue(stackTop); 					// if (P(top)) > P(e) enqueue top to Qout 
						} else {
							stack.push(stackTop);						// else push(top)
							break; 
					}
				}
				stack.push(e);											// push(e)
			}
			
			else if (e.charAt(0) == '(' ) {
				stack.push(e); 											// push to stack 
			}
			else if (e.charAt(0) == ')' ) {
				while(stack.top != null) { 
					String top = stack.pop();							//pop all stack and enqueue to Qout until I reach the (.
					if(top.charAt(0) == '(' ) { 
						break;
					} else {
						Qout.enqueue(top); 								
					}
				}
			
			} else {
				Qout.enqueue(e); 			// enqueues operands to output
			}
		}
		String p; 							// creates string P
		while((p=stack.pop()) != null) {
			Qout.enqueue(p); 				// empty stack and enqueue onto output
		}
		
		return Qout;                       // The goal of the In2P method; we want to output the Queue 
	}
	
		/** Takes in a string and searches for operands or operators, sending
	 *  the operands to the output and the operators to the queue to be sorted by precedence
	 * @param s the input string
	 * @return true if we find if the string in the array, and if not it returns false 
	 */
	public boolean isOperator(String s) {
		for (int i = 0; i < operators.length;i++) {
			if (s.charAt(0) == operators[i]) {
				return true; 
			}
		}
		return false; 		
	}
	
	/** Organizes the precedence of the operators
	 *  Our bounds are 
	 * @param 
	 * @returns precedences of our characters to be used
	 */
	public int precedence(String s) {
		for (int i = 0; i < operators.length;i++) {
			if (s.charAt(0) == operators[i]) {
				return precedences[i]; 
			}
		}
		return 0;
	}

	// The code below was taken from Katrina in the tutorial. 
	public double PostEval(Queue postFixQueue) {
		Stack postEvalStack = new Stack(); 
		Double result; 
		
	while(postFixQueue.head != null) {
		String e = postFixQueue.dequeue(); 
		// what to do with element
		if(isOperator(e)) {
			// pop two elements
			String elA = postEvalStack.pop(); 
			String elB = postEvalStack.pop(); 
			
			// A [op] B
			Double A = Double.parseDouble(elA); 
			Double B = Double.parseDouble(elB); 
			Double r = 0.0; 
			
			switch(e) {
			case "+":
				result = B + A;
				break; 
			case "-": 
				result = B - A;
				break; 
			case "*": 
				result = B * A; 
				break; 
			case "/": 
				result = B / A;
				break;
			default: 
				result = 0.0; 
			}
			
			postEvalStack.push(Double.toString(result)); 	// push string that signifies result onto the stack
			//
		}   else  {
			//push element to stack
			postEvalStack.push(e);
			}
		}
		// at this point there is only one element on the stack; the result
		String r = postEvalStack.pop(); 
		return Double.parseDouble(r); 
	}
}