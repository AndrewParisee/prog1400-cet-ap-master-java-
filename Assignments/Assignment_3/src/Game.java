import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JTextPane;

import Character.Barbarian;
import Character.Character;
import Character.Knight;
import Character.Rogue;
import Character.Wizard;

public class Game {
	
	// Variables
	Random random = new Random();
	private Character player = null;
	private Character computer = null;
	String characterAlignment;
	String equipmentName;
	
	// Constructor
	public void createPlayerCharacter(String equipmentName, String className, String characterAlignment, String characterName) {	
		
		// Create character classes
		if(className.equals("Barbarian")) {
			player = new Barbarian(characterName, characterAlignment);
		}
		else if (className.equals("Knight")) {
			player = new Knight(characterName, characterAlignment);
		}
		else if (className.equals("Rogue")) {
			player = new Rogue(characterName, characterAlignment);
		}
		else if (className.equals("Wizard")) {
			player = new Wizard(characterName, characterAlignment);
		}
		// Set player equipment
		player.setEquipment(equipmentName);
	}
	
	// Constructor
	public void createComputerCharacter(String difficulty, int computerCoins) {
	
		// random numbers
		int classChoiceInt = random.nextInt(4) + 1;
		int alignmentChoiceInt = random.nextInt(2) + 1;
		int equipmentChoiceInt = random.nextInt(5) +1;
		
		// Good or evil choice for AI
		if(alignmentChoiceInt == 1) {
			characterAlignment = "Good";
		}
		else{
			characterAlignment = "Evil";
		}
		
		
		// Class choice for computer
		if(classChoiceInt == 1) {
			computer = new Barbarian("Vince", characterAlignment);
		}
		else if(classChoiceInt == 2) {
			computer = new Knight("Joe", characterAlignment);
		}
		else if(classChoiceInt == 3) {
			computer = new Rogue("Bethany", characterAlignment);
		}
		else if(classChoiceInt == 4) {
			computer = new Wizard("Robert", characterAlignment);
		}
		
		// Equipment choice for computer
		if (equipmentChoiceInt == 1) {
			equipmentName = "BattleAxe";
		}
		else if (equipmentChoiceInt == 2) {
			equipmentName = "Dagger";
		}
		else if (equipmentChoiceInt == 3) {
			equipmentName = "Fists";
		}
		else if (equipmentChoiceInt == 4) {
			equipmentName = "Staff";
		}
		else{
			equipmentName = "Sword";
		}
	
		// Set computer equipment
		computer.setEquipment(equipmentName);
		
		//Don't need to check easy as tier is automatically set to 1
		if(difficulty.equals("medium")) {
			int randMediumTier = random.nextInt(2) + 1;
			computer.getEquipment().setTierLevel(computer.getEquipment().getTierLevel() + randMediumTier);
		}
		else if(difficulty.equals("hard")) {
			computer.getEquipment().setTierLevel(computer.getEquipment().getTierLevel() + 3);
		}
		
		computer.setAttack(10 + computer.getEquipment().
		calculateEquipmentAttack(computer.getEquipment().getEquipmentType()));
		computer.setCoins(computerCoins);
	}
	
	// Fight method for GUI
	public List doFight() {
		Character firstCharacter;
		Character secondCharacter;
		List fightLog = new List();
		int randGoFirstNum = random.nextInt(2) + 1;
		int playerOneHitChance;
		int playerTwoHitChance;
		player.setHealth(100);
		if(randGoFirstNum == 1) {
			firstCharacter = player;
			secondCharacter = computer;
		}
		else {
			firstCharacter = computer;
			secondCharacter = player;
		}
		
		// Fight occurs until a player is dead
		while(true) {
			playerOneHitChance = random.nextInt(2) + 1;
			
			// Player one fight sequence
			if(playerOneHitChance == 1) {
				secondCharacter.takeDamage(firstCharacter.getAttack());
				fightLog.add(firstCharacter.getName() + " hit " + secondCharacter.getName() + " with a " + firstCharacter.getEquipment().getEquipmentType() + 
						". The damage dealt is " + firstCharacter.getAttack() + ".");
			}
			else {
				fightLog.add(firstCharacter.getName() + " missed the attack.");
			}
			
			// Checking if second character is still alive
			if(secondCharacter.getHealth() <= 0) {
				break;
			}
			
			playerTwoHitChance = random.nextInt(2) + 1;
			
			// Player two fight sequence
			if(playerTwoHitChance == 1) {
				firstCharacter.takeDamage(secondCharacter.getAttack());
				fightLog.add(secondCharacter.getName() + " hit " + firstCharacter.getName() + " with a " + secondCharacter.getEquipment().getEquipmentType() + 
						". The damage dealt is " + secondCharacter.getAttack() + ".");
			}
			else {
				fightLog.add(secondCharacter.getName() + " missed the attack.");
			}
			
			// Checking if second character is still alive
			if(firstCharacter.getHealth() <= 0) {
				break;
			}
		}
		
		// Determines which character won and how much coin to give
		if(randGoFirstNum == 1) {
			if(secondCharacter.getHealth() <= 0) {
				fightLog.add("You won the match!");
				player.setCoins(player.getCoins() + computer.getCoins());
			}
			else {
				fightLog.add("You lost the match.");
				if(player.getCoins() > 5) {
					player.setCoins(player.getCoins() -5);
				}
				else {
					player.setCoins(player.getCoins() - player.getCoins());
				}
			}
		}
		else {
			if(firstCharacter.getHealth() <= 0) {
				fightLog.add("You won the match!");
				player.setCoins(player.getCoins() + computer.getCoins());
			}
			else {
				fightLog.add("You lost the match.");
				if(player.getCoins() > 5) {
					player.setCoins(player.getCoins() -5);
				}
				else {
					player.setCoins(player.getCoins() - player.getCoins());
				}
			}
		}
		return fightLog;
	}
	
	// Get the player character
	public Character getPlayer() {
		return this.player;
	}
	
	// Get the computer character
	public Character getComputer() {
		return this.computer;
	}
}
