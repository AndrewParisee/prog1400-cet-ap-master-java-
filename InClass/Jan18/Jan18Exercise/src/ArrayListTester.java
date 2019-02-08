import java.util.ArrayList;

public class ArrayListTester {

	public static void main(String[] args) {
		
		// Create the ArrayList
		ArrayList<String> myList = new ArrayList<String>();
		
		/*This is how elements should be added to the array list */
		myList.add("Mike");
		myList.add("Tom");
		myList.add("Sally");

		for (int i = 0; i < myList.size(); i ++)
		{
			System.out.println(myList.get(i));
		}
	}

}
