
public class Student extends Person {
	
	// HAS-A relationship with Textbook - Aggregation
//	private ArrayList<TextBook> myBooks; (Create a array for textbooks for more than one)!!! 
	private TextBook myBook;
	
	// PART-OF-A relationship with Account - Composition
	final private Account myAccount;

	private boolean isEnrolled;
	
	public Student(String wNumber, String firstName, String lastName, boolean isEnrolled, String accountNumber) {
		
		super(wNumber,firstName,lastName);
		this.isEnrolled = isEnrolled;
//		myBooks = newArrayList<TextBook>(); (Not necessary for this code)!!!
		this.myAccount = new Account(accountNumber,0);
		
	}
	
	public Account getMyAccount() {
		return myAccount;
	}

	//NOT LEGAL WITH COMPOSITION - FINAL
//	public void setMyAccount(Account myAccount) {
//		this.myAccount = myAccount;
//	}
	
	// Public getter (accessor)
	public boolean getIsEnrolled() {
		
		return this.isEnrolled;
	}
	
	public String reportInfo() {
		return String.format("Name: %s, %s ID: %s Enrolled: %b \nBook: %s \nBalance: %.2f",
				this.lastName, this.firstName, this.wNumber,
				this.isEnrolled, this.myBook.toString(), this.myAccount.getBalance());
	}

	public TextBook getMyBook() {
		return myBook;
	}

	public void setMyBook(TextBook myBook) {
		this.myBook = myBook;
	}

}
