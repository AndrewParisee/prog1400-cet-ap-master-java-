package Character;

public class Rogue extends Character {

	// Properties
	private String type = "Rogue";
	private String proficency = "Dagger";
	
	// Constructor
	public Rogue(String name, String alignment) {
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
}
