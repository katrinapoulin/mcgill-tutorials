import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.gui.TableLayout;
import acm.program.Program;
// The code below was taken from Katrina in the tutorial, with modifications made specific to the program. 
public class JCalcGUI extends Program {
	
	JTextField expressionField = new JTextField(); 
	JTextField result = new JTextField(); 
	postFix pf = new postFix(); 
	
	// public: visibility
	// static: not linked to an instance
	public static void main(String[] args) {
		// create an instance of JCalcGUI
		// when we start with psvm(), an instance of JCalcGUI is not created
		new JCalcGUI().start(args); 
		// new JCalcGUI: constructor, creates an instance
		// .start()-this starts execution of the program
		// start() looks for an init() methods and runs it
		
	}
	
	//JButton 
	//JTextField
	public void init() {
		createInterface(); // creates buttons, adds fields, etc.
		addActionListeners(); // detects button presses in particular
		
		expressionField.addActionListener(this); 
		expressionField.setActionCommand("expression"); 
	}
	
	
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand(); // returns the text in the button
	
		
		// instead of doing if/else statements repeatedly, use a switch case wih value command as shown below
		switch (command) {
		case "expression":
			addToExpression("e"); 
			evaluate(expressionField.getText()); 
		case "Quit":
			exit();
			break; 
		case "C":
			expressionField.setText("");
			result.setText(""); 
			break;  
		case "=":
			if (!expressionField.getText().contains("=")) { 
				computeResult();
				addToExpression(command); 
			}
			break;
		case "x": 
			addToExpression("*");
			break; 
		default: 
			addToExpression(command); 
			break; 		
		}
	}
	public void evaluate(String s) {
		s = s.substring(0, s.length()-1); // removes last character (=)
		result.setText(s);
		Queue Qin = pf.parse(s);
		Queue pfResult = pf.In2Post(Qin);
		double eval = pf.PostEval(pfResult);
		String evalStr = Double.toString(eval);
		result.setText(evalStr);
		
	}


	// The code and method below was taken from Katrina in the tutorial. 
	public void computeResult() {
		String input = expressionField.getText(); 
		Queue Qin = pf.parse(input); 
		Queue pfResult = pf.In2Post(Qin); 
		double eval = pf.PostEval(pfResult);
		result.setText(Double.toString(eval)); 
		
	}


	public void addToExpression(String s) {
		String expr = expressionField.getText(); 
		expr = expr + s;
		expressionField.setText(expr);
		
		
	}


	/**
	 * Add all buttons and fields to layout. Used with other methods, this provides the base for our calculator
	 */
	public void createInterface() {
		setLayout(new TableLayout(9,4));
		//add fields
		add(expressionField , "gridwidth=4");
		add(result, "gridwidth=4"); 
		
		add(new JButton("C"), "width=75"); 
		add(new JButton(""), "width=75"); 
		add(new JButton(""), "width=75"); 
		add(new JButton("/"), "width=75"); 
		
		add(new JButton("7"), "width=75");
		add(new JButton("8"), "width=75");
		add(new JButton("9"), "width=75");
		add(new JButton("x"), "width=75");
		
		add(new JButton("4"), "width=75");
		add(new JButton("5"), "width=75");
		add(new JButton("6"), "width=75");
		add(new JButton("-"), "width=75");
		
		add(new JButton("1"), "width=75");
		add(new JButton("2"), "width=75");
		add(new JButton("3"), "width=75");
		add(new JButton("+"), "width=75");
		
		add(new JButton("0"), "width=75");
		add(new JButton("."), "width=75");
		add(new JButton(""), "width=75");
		add(new JButton("="), "width=75");
		
		add(new JButton("("), "width=75");
		add(new JButton(")"), "width=75");
		add(new JButton(""), "width=75");
		add(new JButton(""), "width=75");
		
		add(new JButton(""), "width=75");
		add(new JButton(""), "width=75");
		add(new JButton(""), "width=75");
		add(new JButton("Quit"), "width=75");
		
		setBackground(Color.BLUE); 
	}
	
}
