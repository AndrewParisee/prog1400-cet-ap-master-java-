package Character;

public class Barbarian extends Character {

	// Properties
	private String type = "Barbarian";
	private String proficency = "BattleAxe";

	// Constructor
	public Barbarian(String name, String alignment) {
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
