
public class BoardingPass {
	// Define variables/properties
	public String firstName;
	public String lastName;
	public int row;
	public int seat;
	public boolean isRunning;
		
	// Constructor
	public BoardingPass() {}
		
	// Method
	public String passInfo() {
		String pass = new String();
		
		System.out.println("Boarding Pass:");
		pass = String.format("%s, %s: Row: %d Seat %d", lastName, firstName, row, seat);
			
		return pass;
	}
		
}
	


