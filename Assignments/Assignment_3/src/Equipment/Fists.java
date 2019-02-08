package Equipment;

public class Fists extends Equipment {
	
	// Properties
	private String equipmentType = "Fists";
			

	// Constructor
	public Fists() {
				
	}
			
	// Getters and setters
	public String getEquipmentType() {
		return equipmentType;
	}

	@Override
	public int calculateEquipmentAttack(String proficency) {
			return 0;
	}
}
