
/**
 * 
 * @author Shawn Vahid
 * @version Jun16.2015
 *
 */

public abstract class Employee {

	String name;

	/**
	 * 
	 * @param name 
	 */
	public Employee(String name) {
		setName(name);
	}

	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name 
	 */
	public void setName(String name) {
		if(name != null)   {
			this.name = name.substring(0, 1).toUpperCase()+name.substring(1).toLowerCase();;
		}
	}

	
	public abstract double calculateMonthlyEarnings();
	
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
}
