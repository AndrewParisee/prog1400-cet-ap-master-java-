import java.util.ArrayList;

public class Application {

	public void start( ) {
		// Collection of all people
		ArrayList<Person> myPeople = new ArrayList<Person>();
		
		// Create a student object
		Student studentOne = new Student("w5555555", "Jake", "Smith", true, "5555");
		
		// Create a TextBook
		TextBook newBook = new TextBook("Fun with Java" ,159.99);
		
		// Charge $20 for parking
		studentOne.getMyAccount().setBalance(20.00);
		
		studentOne.setMyBook(newBook);
		
		myPeople.add(studentOne);
		
		// Create an employee object
		Employee employeeOne = new Employee("w1111111", "Sally", "Jones", 99999);
		myPeople.add(employeeOne);

		
		// Print the report for all people
		for (int i = 0; i < myPeople.size(); i++) {
			System.out.println(myPeople.get(i).reportInfo());
		}
	}
}
