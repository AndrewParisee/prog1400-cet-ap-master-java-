
public class PieceWorkers extends Employee {
	
	// Variables
	double pay = 0;

	public PieceWorkers(String employeeName, String employeeType) {
		super(employeeName, employeeType);
		this.setEmployeeName("Tina Zena");
		this.setEmployeeType("Piece Workers");
		}

	@Override
	public double getMonthlyPay() {
		pay = 1 * 1000;
		return pay;
	}
	

}
