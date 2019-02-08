package Equipment;

public abstract class Equipment {
	
	// Properties
	private int attackIncrease = 2;
	private int attackDecrease = -3;
	private String equipmentType = "equipment";
	private int tierLevel = 1;
	
	// Constructor
	public Equipment() {
		
	}

	// Getters and setters
	
	// Calculate attack amount
	public abstract int calculateEquipmentAttack(String proficency);
	
	// Get equipment type
	public abstract String getEquipmentType();


	// Get attack increase amount
	public int getAttackIncrease() {
		return attackIncrease;
	}
	
	// Get attack decrease amount
	public int getAttackDecrease() {
		return attackDecrease;
	}

	// Get player tier level
	public int getTierLevel() {
		return tierLevel;
	}

	// Set player tier level
	public void setTierLevel(int tierLevel) {
		this.tierLevel = tierLevel;
	}
}
