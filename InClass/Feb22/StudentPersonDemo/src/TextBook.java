
public class TextBook {
	private String title;
	private double cost;
	
	public TextBook(String title, double cost) {
		this.title = title;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return String.format("Title: %s Cost: %.2f", this.title, this.cost);
	}

}
