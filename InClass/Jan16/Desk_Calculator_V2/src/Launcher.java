import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		System.out.println("Desk Calculator V2:");
		System.out.println();
		
		// Declare Variables
		int baseCharge = 200;
		int orderNumber = 0;
		int deskLength = 0;
		int deskWidth = 0;
		int woodType = 0;
		int numberOfDrawers = 0;
		int drawerCost = 0;
		int costTotal = 0;
		int surfaceArea = 0;
		String replay = "";
		
		// Do-While Loop
		do {
			// Open Scanner
			Scanner reader = new Scanner(System.in);
			
			// Get Data From User
			System.out.print("Enter the Order Number: ");
			orderNumber = reader.nextInt();
			System.out.print("Enter the Length of the Desk (inches): ");
			deskLength = reader.nextInt();
			System.out.print("Enter the Width of the Desk (inches): ");
			deskWidth = reader.nextInt();
			System.out.print("Enter the Type of Wood (1: Mahogany, 2: Oak, 3: Pine): ");
			woodType = reader.nextInt();
			System.out.print("Enter the Number of Drawers: ");
			numberOfDrawers = reader.nextInt();
			
			// Perform Calculations
			surfaceArea = deskLength * deskWidth;
			
			if(surfaceArea > 750) {
				baseCharge = baseCharge + 50;
			}
			if(woodType == 1) {
				baseCharge = baseCharge + 150;
			} else if(woodType == 2) {
				baseCharge = baseCharge + 125;
			} else {
				baseCharge = baseCharge + 0;
			}
			
			drawerCost = numberOfDrawers * 30;
			costTotal = drawerCost + baseCharge;
			
			// Output the Results
			System.out.println();
			System.out.println(String.format("The Total Cost of Order #%d, is $%d.",orderNumber, costTotal));
			System.out.println();
			
			// Ask the user If They Want to Run the Program Again
			System.out.print("Would you like to Run the Program Again? (Y/N): ");
			replay = reader.next();
			
			// Close Scanner
						reader.close();
		} while(replay == "Y" || replay == "y");
		
		System.out.println();
		System.out.println("Have a Nice Day!");

	}

}
