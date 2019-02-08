
public class ArrayTest {

	public static void main(String[] args) {
		
		// Create a Java int Array
		int[] intArray = new int[3];
		
		// Assign Elements to the Array
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		
		// Print Java int Array
		for (int i = 0; i < intArray.length; i ++)
		{
			System.out.println(intArray[i]);
		}
		
		// Create a Java string Array
		String[] stringArray = new String[3];
				
		// Assign Elements to the Array
		stringArray[0] = "One";
		stringArray[1] = "Two";
		stringArray[2] = "Three";
				
		// Print Java string Array
		for (String i = 0; i < stringArray.length; i ++)
		{
			System.out.println(stringArray[i]);
		}
	}

}
