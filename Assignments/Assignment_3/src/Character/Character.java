package Character;
import Equipment.BattleAxe;
import Equipment.Dagger;
import Equipment.Equipment;
import Equipment.Fists;
import Equipment.Staff;
import Equipment.Sword;

public abstract class Character {

	// Properties
	private String name;
	private String alignment;
	private String proficency;
	private Equipment equipment = null;
	private final Equipment equipmentAssortment[] = {new Sword(),
			new Staff(),
			new BattleAxe(),
			new Dagger(),
			new Fists()};
	private int attack = 10;
	private int coins = 40;
	private int health = 100;
	private String type;
	
	// Constructor
	public Character (String name, String alignment) {
		
		this.alignment = alignment;
		
		// Specify whether player is good or evil
		if(alignment.equals("Evil")) {
			this.name = name + " The Devious";
		}
		else {
			this.name = name + " The Great";
		}
	}
	
	// Getters and setters
	public String getName() {
		return name;
	}

	// Set player name
	public void setName(String name) {
		this.name = name;
	}

	// Get attack amount
	public int getAttack() {
		return attack;
	}

	// Set attack amount
	public void setAttack(int attack) {
		this.attack = attack;
	}

	// Get number of coins
	public int getCoins() {
		return coins;
	}

	// Set number of coins
	public void setCoins(int coins) {
		this.coins = coins;
	}

	// Get player health
	public int getHealth() {
		return health;
	}

	// Set player health
	public void setHealth(int health) {
		this.health = health;
	}

	// Get player equipment choice
	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipmentName) {
		for(Equipment equipment : equipmentAssortment) {
			if(equipment.getEquipmentType().equals(equipmentName)) {
				this.equipment = equipment;
				break;
			}
		}
		// Determine the players attack level
		if(equipment != null) {
			this.attack = this.attack + equipment.calculateEquipmentAttack(getProficency());
		}
		else {
			attack = 10;
		}
	}
	
	
	public void takeDamage(int damage) {
		health -= damage;
	}

	// Get player proficency
	public abstract String getProficency();

	// Get player type
	public abstract String getType();
}
