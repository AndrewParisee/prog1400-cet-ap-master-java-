package Equipment;

public class Dagger extends Equipment{
	
	// Properties
	private String equipmentType = "Dagger";
		

	// Constructor
	public Dagger() {
			
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
