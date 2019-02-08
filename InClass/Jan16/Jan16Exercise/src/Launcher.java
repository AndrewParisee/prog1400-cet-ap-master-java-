import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		// Declare and Initialize Variables
		int numberOne = 0;
		int numberTwo = 0;
		double average = 0;
		
		System.out.println("Exercise:");
		System.out.println("Write a Java program that asks the user to enter two numbers and then find the average of them and outputs it.");
		System.out.println();
		
		// Create the Scanner Object
		Scanner myScanner = new Scanner(System.in);
		
		// Get User Input of Two Numbers
		System.out.print("Enter Number One: ");
		numberOne = myScanner.nextInt();
		System.out.print("Enter Number Two: ");
		numberTwo = myScanner.nextInt();
		
		// Calculate the Average of the Two Numbers
		average = (double)(numberOne + numberTwo) / 2; 
		
		
		// Close the Scanner Object
		myScanner.close();
		
		// Output the Average
		System.out.println(String.format("The Average of %d and %d is %.1f.",numberOne,numberTwo,average));
	}

}
