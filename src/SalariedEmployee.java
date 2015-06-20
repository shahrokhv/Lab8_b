/**
 * 
 * @author Shawn Vahid
 * @version Jun16.2015
 *
 */
public  class SalariedEmployee extends Employee
{
	private static final int ZERO = 0;
	private static final int FIFTY_THREE = 53;
	private int yearlySalary;
	private int weeksPerYear;

	

	/**
	 * @param name
	 */
	public SalariedEmployee(String name, int yearlySalary,int weeksPerYear) {
		super(name);
		setYearlySalary(yearlySalary);
		setWeeksPerYear(weeksPerYear);
	}

	/**
	 * @return the yearlySalary
	 */
	public int getYearlySalary() {
		return yearlySalary;
	}

	/**
	 * @param yearlySalary the yearlySalary to set
	 */
	public void setYearlySalary(int yearlySalary) {
		if(yearlySalary > ZERO){
		this.yearlySalary = yearlySalary;
		}
	}

	/**
	 * @return the expectedNumberOfWeeksPerYear
	 */
	public int getWeeksPerYear() {
		return weeksPerYear;
	}

	/**
	 * @param expectedNumberOfWeeksPerYear the expectedNumberOfWeeksPerYear to set
	 */
	public void setWeeksPerYear(int weeksPerYear) {
		if(weeksPerYear>ZERO && weeksPerYear<FIFTY_THREE)
		{
	               	this.weeksPerYear = weeksPerYear;
		}
	}

	@Override
	public double calculateMonthlyEarnings() {
       
		return (yearlySalary/weeksPerYear)*(52/12);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SalariedEmployee [getYearlySalary()=" + getYearlySalary()
				+ ", getWeeksPerYear()=" + getWeeksPerYear()
				+ ", calculateMonthlyEarnings()=" + calculateMonthlyEarnings()
				+ ", " + (getName() != null ? "getName()=" + getName() : "")
				+ "]";
	}


	
	
	
}
