
/**
 * 
 * @author Shawn Vahid
 * @version Jun16.2015
 *
 */
public class Driver {
	
	
	public static void main(String[] args) {
		Company newCompany = new Company(null, null ); 
		
		Employee employee = new HourlyEmployee("bOBB", 5.5); 
		Employee employee2 = new CommissionEmployee("wiLL", 5000);
		Employee employee3= new SalariedEmployee("John", 55000,52);
		
	
		newCompany.addEmployees(employee); // adds the different employees to on Array list
		newCompany.addEmployees(employee2);// adds the different employees to on Array list
		newCompany.addEmployees(employee3);// adds the different employees to on Array list
		
		newCompany.displayAllEmployees();// displays all the employees details
		
		System.out.println("\n");
		System.out.println("\n");
		
		  newCompany.removeEployees(); // this method removes an employee randomly  from the Array list
		 
		  newCompany.displayAllEmployees(); // displays all the employees details
		 
		  
		
		
		
		
	    
		
		
	}

}
