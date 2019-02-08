import java.util.Scanner;
public class Application {
	public void start( ) {
		// Code here
		
		// Boarding Pass
		BoardingPass pass = new BoardingPass();
		
		pass.firstName = "Andrew";
		pass.lastName = "Parisee";
		pass.row = 0;
		pass.seat = 1;
		pass.isRunning = true;
		
		System.out.println(pass.passInfo());
	}
}
