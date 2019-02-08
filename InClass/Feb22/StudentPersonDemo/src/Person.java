
public abstract class Person {

	protected String wNumber;
	protected String firstName;
	protected String lastName;
	
	public Person(String wNumber, String firstName, String lastName) {
		
		this.wNumber = wNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// Abstract Method - Child classes Must implement
	public abstract String reportInfo();
}
