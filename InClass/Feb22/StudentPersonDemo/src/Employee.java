
public class Employee extends Person {
	
	private long salary;

	public Employee(String wNumber, String firstName, String lastName, long salary) {
		
		super(wNumber,firstName,lastName);
		this.salary = salary;
	}
	
	// Public getter (accessor)
	public long getSalary() {
		
		return this.salary;
	}
	
	public String reportInfo() {
		return String.format("Name: %s, %s ID: %s Salary: %d", this.lastName, this.firstName, this.wNumber, this.salary);
	}
}
