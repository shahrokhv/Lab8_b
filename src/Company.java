import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author Shawn Vahid
 * @version Jun16.2015
 *
 */

public class Company extends Employee
{

	private ArrayList <Employee> allTypesOfEmployees;
	Random random = new Random();
	
	
	/**
	 * 
	 * @param name
	 * @param allTypesOfEmployees
	 */
	public Company(String name, ArrayList<Employee> allTypesOfEmployees) {
		super(name);
		allTypesOfEmployees = new ArrayList<Employee>();
		this.allTypesOfEmployees = allTypesOfEmployees;
	}

	@Override
	public double calculateMonthlyEarnings() {
	
		return 0;
	}
/*
 * This method adds employee to the array list
 */
	public void addEmployees(Employee employee)
	{
		allTypesOfEmployees.add(employee);
	}
	
	/*
	 * This method removes an employee randomly from arraylist 
	 */
	public void removeEployees()
	{
		allTypesOfEmployees.remove(random.nextInt(allTypesOfEmployees.size()));
	}
	
	/*
	 * displays all the employees details
	 */
	public void displayAllEmployees()
	{
		 for(Employee allEmployees: allTypesOfEmployees)
		 {
			 System.out.print("\n"+allEmployees.getName()+" has monthly earnings of $"+allEmployees.calculateMonthlyEarnings());
			 
		 }
		 
		 
	}
	
}
