
public abstract class Employee {

	private String employeeName;
	private String employeeType;
	
	public Employee (String employeeName,
			String employeeType) {
		this.employeeName = employeeName;
		this.employeeType = employeeType;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public abstract double getMonthlyPay();

}
