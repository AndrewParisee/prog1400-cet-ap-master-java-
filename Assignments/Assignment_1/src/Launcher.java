import java.util.Scanner;
public class Launcher {

	public static void main(String[] args) {
		
		//Declare and set variables
		String salesPersonName;
		int salesPersonTotalQuantity;
		double salesPersonTotalEarnings;
		double commissionPercent = 0.09;
		double weeklyPay = 200;
		String itemNames[] = {"Item One", "Item Two", "Item Three", "Item Four"};
		double itemAmounts[] = {239.99, 129.75, 99.95, 350.89};
		int itemSales[] = {0, 0, 0, 0};
		double totalSumOfSales = 0;
		int totalAmountOfItemsSold = 0;
		double averageValueOfSales = 0;
		String input;
		String nameOfMostSoldItem = "";
		String topSalespersonName = "";
		int topSalespersonSales = 0;
		boolean isRunning = true;
		
		// Open Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Loop to get each sales person's individual sales records
		while(isRunning) {
			salesPersonTotalQuantity = 0;
			salesPersonTotalEarnings = 0;
			System.out.print("Please enter the sales person's name: ");
			salesPersonName = scanner.nextLine();
			
			// Loop through the four items to determine how many of each item the salesperson sold
			for(int i = 0; i < itemNames.length; i ++) {
				int currentItemQuantity = -1;
				
				System.out.println("==========" + itemNames[i] + "==========");
				System.out.println(itemNames[i] + " Price: $" + itemAmounts[i]);
				System.out.println("How much of " + itemNames[i] + " did " + salesPersonName + " sell?");
				input = scanner.nextLine();
				
				// Loop to validate if a valid integer is input by the user
				while (true) {
					boolean isNoException = true;
					try {
						currentItemQuantity = Integer.parseInt(input);
					}
					catch(Exception e) {
						isNoException = false;
					}
					
					if(currentItemQuantity > -1 && isNoException) {
						break;
					}
					else {
						System.out.print("Sorry, that was not a valid number. Please enter a valid amount of " + itemNames[i] + " sold: ");
						input = scanner.nextLine();
					}
				}
				
				// Calculations to weekly earnings made by each salesmen
				itemSales[i] = currentItemQuantity;
				salesPersonTotalQuantity += currentItemQuantity; 
				salesPersonTotalEarnings += (currentItemQuantity * itemAmounts[i]) * commissionPercent;
				System.out.println("============================\n");
			}
			// SalesPerson Report
			salesPersonTotalEarnings += weeklyPay;
			System.out.println("==========" + salesPersonName + "==========");
			System.out.println(salesPersonName + "'s total items sold: " + salesPersonTotalQuantity);
			System.out.println(String.format("%s's total comission: $%.2f", salesPersonName, salesPersonTotalEarnings));
			System.out.println("============================\n");
			
			// Calculations to get the totals for the items and of each salesmen
			totalSumOfSales += salesPersonTotalEarnings;
			totalAmountOfItemsSold += salesPersonTotalQuantity;
			
			// Determines which sales person has sold the most items
			if(topSalespersonSales < totalAmountOfItemsSold) {
				topSalespersonSales = totalAmountOfItemsSold;
				topSalespersonName = salesPersonName;
			}
			
			// Loop asking the user if they want to keep using the program
			while(true) {
				System.out.print("Would you like to add another sales person (yes/no)? \n");
				input = scanner.nextLine();
				
				if(input.toLowerCase().equals("yes")) {
					break;
				}
				else if(input.toLowerCase().equals("no")) {
					isRunning = false;
					break;
				}
				else {
					System.out.println("Incorrect input.");
				}
			}	
		}
		// Loop to determine which item was sold the most
		for(int i = 0; i < itemSales.length; i ++) {
			if(i == 0) {
				nameOfMostSoldItem = itemNames[i];
			}
			else if(itemSales[i - 1] < itemSales[i]) {
				nameOfMostSoldItem = itemNames[i];
			}
		}
		
		// Weekly Report 
		averageValueOfSales = totalSumOfSales / totalAmountOfItemsSold;
		System.out.println("==========Weekly Report==========");
		System.out.println("Top Salesperson: " + topSalespersonName);
		System.out.println("Item Sold The Most: " + nameOfMostSoldItem);
		System.out.println(String.format("Total Sum Of Sales: $%.2f", totalSumOfSales));
		System.out.println(String.format("Average Value Of Sales: $%.2f", averageValueOfSales));
		System.out.println("=================================");
		
		// Close Scanner
		scanner.close();
	}
}