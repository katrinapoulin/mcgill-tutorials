
/**
 * Class to calculate and store a factorial expression.
 * @author kpoulin
 *
 */
public class Factorial {
// 4! = 24
	private int base;
	private int result;
	
	/**
	 * Constructor. Creates a Factorial object
	 * without calculating the result.
	 * @param base the base of the expression
	 */
	public Factorial(int base) {
		this.base = base;
		this.result = 0;
	}
	
	/**
	 *  Calculates result of this factorial object.
	 */
	public void calculate() {
		for (int i = 1; i < base; i++) {
			this.result = this.result * i;
		}
	}
	
	/**
	 * Returns base variable.
	 * @return
	 */
	public int getBase() {
		return this.base;
	}
	
	/**
	 * Returns result variable.
	 * @return
	 */
	public int getResult() {
		return this.result;
	}
}
