package Character;

public class Knight extends Character {
	
	// Properties
	private String type = "Knight";
	private String proficency = "Sword";
	
	// Constructor
	public Knight(String name, String alignment) {
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
