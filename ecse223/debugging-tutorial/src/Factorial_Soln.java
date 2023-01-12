
/**
 * 
 * @author kpoulin
 *
 */
public class Factorial_Soln {

	private int base;
	private int result;
	
	/**
	 * Constructor. Creates a Factorial object
	 * without calculating the result.
	 * @param base the base of the expression
	 */
	public Factorial_Soln(int base) {
		this.base = base;
		this.result = 1;
	}
	
	/**
	 *  Calculates result of this factorial object.
	 */
	public void calculate() {
		for (int i = 1; i <= base; i++) {
			this.result = this.result * i;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public int getBase() {
		return this.base;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getResult() {
		return this.result;
	}
}
