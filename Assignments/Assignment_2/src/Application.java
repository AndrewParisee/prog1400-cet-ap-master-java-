import java.util.Scanner;
import java.util.Random;

public class Application {
	private boolean seatLocation[][] = new boolean[4][4];
	// Open Scanner
	Scanner scanner = new Scanner(System.in);
	
	public void start() {
		// Declare and set variables
		String passengerName;
		String userChoice;
		String classChoice;
		String chosenClassName;
		String seatChoice;
		String chosenSeatTypeName;
		boolean isGoodInput = false;
		
		// Loop to run the program until user decides otherwise
		while (true) {
			
			// Call method to display the seating chart
			displaySeats();
			
			// Check to see if all seats are taken
			if(!checkSeatAvailability(0, seatLocation.length, 0 , seatLocation.length, false)) {
				System.out.println("Sorry, all seats are taken. The next flight is in three hours.");
				break;
			}
			
			// Ask the passenger for their name
			isGoodInput = false;
			do {
				System.out.print("\nWhat is your name? ");
				passengerName = scanner.nextLine();	
				if(passengerName.isEmpty()){
					System.out.println("Your name must not be empty.");
				}
				if(containsDigit(passengerName)) {
					System.out.println("Your name can not have numbers.");
				}
				else {
					isGoodInput = true;
				}
			} while (!isGoodInput);
			
			// Call method to ask user for class choice
			classChoice = getSeatingChoice("Please type 1 for First Class or 2 for Economy: ");
			
			int rowStart;
			int rowEnd;
			if(classChoice.equals("1")) {
				rowStart = 0;
				rowEnd = 2;
				chosenClassName = "First Class";
			} else {
				rowStart = 2;
				rowEnd = 4;
				chosenClassName = "Economy";
			}
			
			// Ask if moving to the next class is okay
			if (!checkSeatAvailability(rowStart, rowEnd, 0 , seatLocation.length, false))  {
				if(changeSeatingChoice("class")) {
					if(classChoice.equals("1")) {
						classChoice = "2";
						rowStart = 2;
						rowEnd = 4;
						chosenClassName = "Economy";
					}
					else {
						classChoice = "1";
						rowStart = 0;
						rowEnd = 2;
						chosenClassName = "First Class";
					}
				}
				else {
					System.out.println("Sorry, all seats are taken. The next flight is in three hours.");
					break;
				}
			}
			
			// Call method to ask user which seat type they prefer
			seatChoice = getSeatingChoice("Please type 1 for a Window seat or 2 for a Aisle seat: ");
			int colStart;
			int colEnd;
			boolean isWindowSeat = false;
			if(seatChoice.equals("1")) {
				colStart = 0;
				colEnd = 4;
				isWindowSeat = true;
				chosenSeatTypeName = "Window";
			}
			else{
				colStart = 1;
				colEnd = 3;
				chosenSeatTypeName = "Aisle";
			}
			
			// Check if the user wants a window seat or an aisle seat
			if (!checkSeatAvailability(rowStart, rowEnd, colStart , colEnd, isWindowSeat))  {
				if(changeSeatingChoice("seat type")) {
					if(seatChoice.equals("1")) {
						seatChoice = "2";
						chosenSeatTypeName = "Aisle";
					}
					else {
						seatChoice = "1";
						chosenSeatTypeName = "Window";
					}
				}
				else {
					System.out.println("Sorry, all seats are taken. The next flight is in three hours.");
					break;
				}
			}
			
			//Boarding pass for passenger output
			String seat = assignSeat(classChoice, seatChoice);
			System.out.println("\nBoarding Pass for " + passengerName + ".");
			System.out.println("Your seat is " + seat + ".");
			System.out.println("That is " + chosenClassName + " with a(n) " + chosenSeatTypeName + " seat.");
			
			// Call altered seating map 
			displaySeats();
						
			// Ask the user if they want to book another passenger
			System.out.print("\nDo you want to book another passenger? (Y to continue): ");
			userChoice = scanner.nextLine();
			if(userChoice.toLowerCase().equals("y")) {
			}
			else {
				break;
			}
			System.out.println("");
		}	
	}
	// Assigning seats method
	private String assignSeat(String classChoice, String seatChoice) {
		Random random = new Random();
		int row;
		int col;
		int rowMax;
		int rowMin;
		int colMax;
		int colMin;
		
		if(classChoice.equals("1")) {
			rowMax = 1;
			rowMin = 0;
		} else {
			rowMax = 3;
			rowMin = 2;
		}
		
		if(seatChoice.equals("1")) {
			colMax = 0;
			colMin = -1;
		} else {
			colMax = 2;
			colMin = 1;
		}
		
		while(true) {
			row = random.nextInt(rowMax - rowMin + 1) + rowMin;
			col = random.nextInt(colMax - colMin + 1) + colMin;
			if(col == -1) {
				col = 3;
			}
			
			if(!seatLocation[row][col]) {
				seatLocation[row][col] = true;
				break;
			}
		}
		return "R" + (row + 1) + "C" + (col + 1);
	}

	// Seat availability method
	private boolean checkSeatAvailability(int rowStart, int rowEnd, int colStart, int colEnd, boolean isWindowSeat) {
		for (int row = rowStart; row < rowEnd; row++) {
			if(isWindowSeat) {
				int col = 0;
				if(!seatLocation[row][col]) {
					return true;
				}
				col = 3;
				if(!seatLocation[row][col]) {
					return true;
				}
			}
			else {
				for (int col = colStart; col < colEnd; col++) {
					if (!seatLocation[row][col]) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	// No seats available method
	private boolean changeSeatingChoice(String choiceType) {
		String newChoice;
		while (true) {
			System.out.println("There are no seats available in this " + choiceType + ".");
			System.out.println("Is it okay if we place you into the other "+ choiceType + " (Y/N)? ");
			newChoice = scanner.nextLine();
			if (newChoice.toLowerCase().equals("y")) {
				return true;
			}
			else if (newChoice.toLowerCase().equals("n")) {
				return false;
			}
			else {
				System.out.println("That is not valid input. Try again.");
			}
		}
	}
	
	// Question users choice on which seat they want
	private String getSeatingChoice(String question) {
		String choice;
		// Loop to check which class the user selects
		while (true) {
			// Class preference
			System.out.print(question);
			choice = scanner.nextLine();
			if(choice.equals("1")) {
				break;
			}
			else if(choice.equals("2")) {
				break;
			}
			else {
				System.out.println("Incorrect input.\n");
			}
		}
		return choice;	
	}
	
	// Seat chart method
	public void displaySeats() {
		System.out.println("");
		for (int row = 0; row < seatLocation.length; row++) {
			if(row == 0) {
				System.out.print("           ");
				System.out.println("=First Class=");
			}
			else if(row == 2) {
				System.out.print("           ");
				System.out.println("===Economy===");
			}
			System.out.print(" ");
			for (int col = 0; col < seatLocation[row].length; col++) {
				System.out.print("|");
				if(seatLocation[row][col]) {
					System.out.print("BOOKED");
				}
				else{
					System.out.print("-R" + (row + 1) + "C" + (col + 1) + "-");
				}
				System.out.print("|");
				if(col == 1) {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
	// Validation on the passenger name method
	public static boolean containsDigit(String st) {
		for(int i = 0; i < st.length(); i++) {
			if(Character.isDigit(st.charAt(i))) {
				return true;
			}
		}
		return false;
	}
}