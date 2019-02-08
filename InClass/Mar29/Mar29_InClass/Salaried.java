
public class Salaried extends Employee {

	// Variables
	double pay = 0;
	
	// Constructor
	public Salaried(String employeeName, String employeeType) {
		super(employeeName, employeeType);
		this.setEmployeeName("Sue Me");
		this.setEmployeeType("Salaried");
	}

	@Override
	public double getMonthlyPay() {
		pay = (50000 / 12) + (0.1 * 10);
		return pay;
	}
	

}
