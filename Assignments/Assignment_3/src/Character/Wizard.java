package Character;

public class Wizard extends Character {

	// Properties
	private String type = "Wizard";
	private String proficency = "Staff";
	private int defenceIncrease = 3;
	
	// Constructor
	public Wizard(String name, String alignment) {
		super(name, alignment);
	}

	// Getters and setters
	
	// Return type of class
	public String getType() {
		return type;
	}

	// Update proficicency for this class
	@Override
	public String getProficency() {
		return proficency;
	}
	
	public void IncreaseDefence() {
		
	}
}
