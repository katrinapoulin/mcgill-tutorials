package tutorial1;

/**
 * 
 * @author kpoulin
 *
 */
public class Person {
	
	// instance variables -- fields 
	private String name;
	private String email;
	
	// constructor: entry point to create objects
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
		
	}
	
	// constructor vs method: constructor can only be called once! @ init 
	// methods can be called indefinitely
	
	// method (getter)
	public String getName() {
		return this.name;
	}
	
	// method (setter)
	public void setName(String name) {
		this.name = name;
	}
	
	

}
