package Equipment;

public class BattleAxe extends Equipment {
	// Properties
	private String equipmentType = "BattleAxe";
		
	// Constructor
	public BattleAxe() {
				
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
