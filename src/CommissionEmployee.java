/**
 * 
 * @author Shawn Vahid
 * @version Jun16.2015
 *
 */
public class CommissionEmployee extends Employee {

	private static final double COMMISSION_RATE = 0.5; // %50 COMMISSION RATE
	private double monthlySalesTotal;
	
	/**
	 * 
	 * @param name
	 * @param monthlySalesTotal
	 */
	public CommissionEmployee(String name, double monthlySalesTotal) {
		super(name);
		setMonthlySalesTotal(monthlySalesTotal);
	}

	/**
	 * 
	 * @return monthlySalesTotal
	 */
	public double getMonthlySalesTotal() {
		return monthlySalesTotal;
	}

	/*
	 * This method sets the monthly sales total
	 */
	public void setMonthlySalesTotal(double monthlySalesTotal) {
		if(monthlySalesTotal >= 0){
			this.monthlySalesTotal = monthlySalesTotal;
		}
		else{
			this.monthlySalesTotal = 0;
		}
	}

	@Override
	public double calculateMonthlyEarnings() {
		return COMMISSION_RATE * monthlySalesTotal;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommissionEmployee [monthlySalesTotal="
				+ monthlySalesTotal
				+ ", getMonthlySalesTotal()="
				+ getMonthlySalesTotal()
				+ ", calculateMonthlyEarnings()="
				+ calculateMonthlyEarnings()
				+ ", "
				+ (getName() != null ? "getName()=" + getName() + ", " : "")
				+ (super.toString() != null ? "toString()=" + super.toString()
						: "") + "]";
	}

}
