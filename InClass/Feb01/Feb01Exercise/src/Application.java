
public class Application {
	public void start() {
		// All of our application code here for now
		
		/* This Array is not as clean as the one below
		int originalArray[] = new int[5];
		originalArray[0] = 1;
		originalArray[1] = 2;
		originalArray[2] = 3;
		originalArray[3] = 4;
		originalArray[4] = 5;
		*/
		int originalArray[] = {1,2,3,4,5};
		int reversedArray[] = new int[5];
		
		int reverseIndex = 0;
		
		for (int i = originalArray.length - 1; i >= 0; i--) {
			reversedArray[reverseIndex] = originalArray[i];
			
			reverseIndex++;
		}
		
		
		for (int i = 0; i < reversedArray.length; i++) {
			System.out.println(reversedArray[i]);
		}
		
	}

}
