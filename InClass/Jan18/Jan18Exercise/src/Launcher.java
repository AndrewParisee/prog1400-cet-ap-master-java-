import java.util.Scanner;
public class Launcher {

	public static void main(String[] args) {
		// Declare and initialize variables
		int numberOne;
		String rawInput;
		
		// Create the scanner object
		Scanner myScanner = new Scanner(System.in);
		
		do
		{
			// Get user input
			System.out.print("Enter a number: ");
			//numberOne = myScanner.nextInt();
			rawInput = myScanner.next();
			
			// TODO: NEED CODE TO VALIDATE rawInput is numeric
			
			numberOne = Integer.parseInt(rawInput);
		
		} while(numberOne % 5 != 0);
		
		System.out.println("You entered a number divisible by 5!");
		
		// Close the scanner
		myScanner.close();
	}

}
