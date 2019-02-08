package Equipment;

public class Sword extends Equipment {
	
	// Properties
	private String equipmentType = "Sword";
	

	// Constructor
	public Sword() {
		
	}
	
	// Getters and setters
	public String getEquipmentType() {
		return equipmentType;
	}

	@Override
	public int calculateEquipmentAttack(String proficency) {
		if(proficency.equals(equipmentType)) {
			return getAttackIncrease() + (getTierLevel() * 2);
		}
		return getAttackDecrease() + (getTierLevel() * 1);
	}
}
