
public class Managers extends Employee {

	// Variables
	double pay = 0;
	
	public Managers(String employeeName, String employeeType) {
		super(employeeName, employeeType);
		this.setEmployeeName("Richard Rich");
		this.setEmployeeType("Managers");
		}

	@Override
	public double getMonthlyPay() {
		pay = (100000 / 12) + (2000);
		return pay;
	}

}
