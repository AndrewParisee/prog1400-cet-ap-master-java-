
public class Comissioned extends Employee {

	// Variables
	double pay = 0;
	
	// Constructor
	public Comissioned(String employeeName, String employeeType, float monthlyPay) {
		super(employeeName, employeeType);
		this.setEmployeeName("Bob Loblaw");
		this.setEmployeeType("Comissioned");
	}

	@Override
	public double getMonthlyPay() {
		pay = (2000 * 1) + (40000 * 0.10);
		return pay;
	}
}
