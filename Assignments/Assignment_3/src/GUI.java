import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.List;
import java.awt.CardLayout;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JScrollPane;

public class GUI {

	// Variables
	private JFrame frmMyGame;
	private List fightLogList;
	private final ButtonGroup btnAlignmentGroup = new ButtonGroup();
	private final ButtonGroup btnClassGroup = new ButtonGroup();
	private final ButtonGroup btnWeaponGroup = new ButtonGroup();
	private final ButtonGroup btnChangeWeaponGroup = new ButtonGroup();
	private Game myGame = new Game();


	/**
	 * Launch the application.
	 */
	// Run Program
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					GUI window = new GUI();
					window.frmMyGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	// Initialize GUI
	private void initialize() {
		frmMyGame = new JFrame();
		frmMyGame.setResizable(false);
		frmMyGame.setTitle("My Game");
		frmMyGame.setBounds(100, 100, 533, 445);
		frmMyGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyGame.getContentPane().setLayout(new CardLayout(0, 0));
		
		// Character setup screen
		JPanel setupCharacterScreen = new JPanel();
		frmMyGame.getContentPane().add(setupCharacterScreen, "name_6452194400025");
		setupCharacterScreen.setLayout(null);
		
		// Name label
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(28, 103, 54, 16);
		setupCharacterScreen.add(lblName);
		
		JTextPane textPane_name = new JTextPane();
		textPane_name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPane_name.setBounds(79, 96, 154, 23);
		setupCharacterScreen.add(textPane_name);
		
		// Class label
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClass.setBounds(98, 169, 54, 11);
		setupCharacterScreen.add(lblClass);
		
		// Barbarian button on setup screen
		JRadioButton btnBarbarianClass = new JRadioButton("Barbarian");
		btnClassGroup.add(btnBarbarianClass);
		btnBarbarianClass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBarbarianClass.setBounds(28, 198, 103, 21);
		setupCharacterScreen.add(btnBarbarianClass);
		
		// Knight button on setup screen
		JRadioButton btnKnightClass = new JRadioButton("Knight");
		btnClassGroup.add(btnKnightClass);
		btnKnightClass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnKnightClass.setBounds(143, 198, 103, 21);
		setupCharacterScreen.add(btnKnightClass);
		
		// Rogue button on setup screen
		JRadioButton btnRogueClass = new JRadioButton("Rogue");
		btnClassGroup.add(btnRogueClass);
		btnRogueClass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRogueClass.setBounds(28, 256, 103, 21);
		setupCharacterScreen.add(btnRogueClass);
		
		// Wizard button on setup screen
		JRadioButton btnWizardClass = new JRadioButton("Wizard");
		btnClassGroup.add(btnWizardClass);
		btnWizardClass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnWizardClass.setBounds(143, 256, 103, 21);
		setupCharacterScreen.add(btnWizardClass);
		
		// Alignment label on setup screen
		JLabel lblAlignment = new JLabel("Alignment");
		lblAlignment.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAlignment.setBounds(351, 72, 83, 23);
		setupCharacterScreen.add(lblAlignment);
		
		JRadioButton btnGoodAlignment = new JRadioButton("Good");
		btnAlignmentGroup.add(btnGoodAlignment);
		btnGoodAlignment.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGoodAlignment.setBounds(286, 101, 103, 21);
		setupCharacterScreen.add(btnGoodAlignment);
		
		JRadioButton btnBadAlignment = new JRadioButton("Evil");
		btnAlignmentGroup.add(btnBadAlignment);
		btnBadAlignment.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBadAlignment.setBounds(414, 101, 103, 21);
		setupCharacterScreen.add(btnBadAlignment);
		
		JLabel lblNewLabel = new JLabel("Weapon");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(357, 163, 77, 23);
		setupCharacterScreen.add(lblNewLabel);
		
		JRadioButton btnBattleAxe = new JRadioButton("BattleAxe");
		btnWeaponGroup.add(btnBattleAxe);
		btnBattleAxe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBattleAxe.setBounds(286, 198, 103, 21);
		setupCharacterScreen.add(btnBattleAxe);
		
		JRadioButton btnDagger = new JRadioButton("Dagger");
		btnWeaponGroup.add(btnDagger);
		btnDagger.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDagger.setBounds(414, 198, 103, 21);
		setupCharacterScreen.add(btnDagger);
		
		JRadioButton btnStaff = new JRadioButton("Staff");
		btnWeaponGroup.add(btnStaff);
		btnStaff.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnStaff.setBounds(286, 256, 103, 21);
		setupCharacterScreen.add(btnStaff);
		
		JRadioButton btnSword = new JRadioButton("Sword");
		btnWeaponGroup.add(btnSword);
		btnSword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSword.setBounds(414, 256, 103, 21);
		setupCharacterScreen.add(btnSword);
		
		JRadioButton btnFists = new JRadioButton("Fists");
		btnWeaponGroup.add(btnFists);
		btnFists.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnFists.setBounds(362, 221, 103, 21);
		setupCharacterScreen.add(btnFists);
		
		JLabel titleLabel = new JLabel("Character Setup");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		titleLabel.setBounds(10, 10, 507, 36);
		setupCharacterScreen.add(titleLabel);
		
		JPanel battleScreen = new JPanel();
		frmMyGame.getContentPane().add(battleScreen, "name_6452204244343");
		battleScreen.setLayout(null);
		
		JLabel lblCannotContinue = new JLabel("Cannot Continue Until All Items Selected!");
		lblCannotContinue.setVisible(false);
		lblCannotContinue.setForeground(Color.RED);
		lblCannotContinue.setHorizontalAlignment(SwingConstants.CENTER);
		lblCannotContinue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCannotContinue.setBounds(10, 375, 507, 30);
		setupCharacterScreen.add(lblCannotContinue);
		
		JLabel lblHerosVsVillains = new JLabel("Heroes vs. Villains");
		lblHerosVsVillains.setHorizontalAlignment(SwingConstants.CENTER);
		lblHerosVsVillains.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHerosVsVillains.setBounds(10, 11, 507, 30);
		battleScreen.add(lblHerosVsVillains);
		
		JButton btnFightMedAi = new JButton("Fight Med AI");
		btnFightMedAi.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFightMedAi.setBounds(190, 226, 140, 40);
		battleScreen.add(btnFightMedAi);
		
		JLabel lblNewLabel_1 = new JLabel("Stats");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(190, 35, 140, 17);
		battleScreen.add(lblNewLabel_1);
		
		JLabel lblCharacterName = new JLabel("Player Name: ");
		lblCharacterName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCharacterName.setBounds(153, 101, 227, 17);
		battleScreen.add(lblCharacterName);
		
		JLabel lblHealth = new JLabel("Player Health:");
		lblHealth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHealth.setBounds(153, 121, 227, 17);
		battleScreen.add(lblHealth);
		
		JLabel lblCoins = new JLabel("Player Coins:");
		lblCoins.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCoins.setBounds(153, 163, 227, 17);
		battleScreen.add(lblCoins);
		
		JLabel lblAttack = new JLabel("Player Attack:");
		lblAttack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAttack.setBounds(153, 142, 227, 17);
		battleScreen.add(lblAttack);
		
		JLabel lblWeapon = new JLabel("Player Weapon: ");
		lblWeapon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWeapon.setBounds(10, 73, 170, 17);
		battleScreen.add(lblWeapon);
		
		JLabel lblTier = new JLabel("Player Tier Level: ");
		lblTier.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTier.setBounds(10, 94, 135, 17);
		battleScreen.add(lblTier);
		
		JLabel lblTierWarning = new JLabel("");
		lblTierWarning.setHorizontalAlignment(SwingConstants.CENTER);
		lblTierWarning.setVisible(false);
		lblTierWarning.setForeground(Color.RED);
		lblTierWarning.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTierWarning.setBounds(385, 91, 121, 17);
		battleScreen.add(lblTierWarning);
		
		JLabel lblTierUpgradeCost = new JLabel("(30 Coins)");
		lblTierUpgradeCost.setHorizontalAlignment(SwingConstants.CENTER);
		lblTierUpgradeCost.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTierUpgradeCost.setBounds(385, 145, 121, 14);
		battleScreen.add(lblTierUpgradeCost);
		
		JButton btnUpgradeTier = new JButton("Upgrade Tier");
		btnUpgradeTier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(myGame.getPlayer().getEquipment().getTierLevel() == 4) {
					lblTierWarning.setVisible(true);
					lblTierWarning.setText("Max Tier Achieved.");
				}
				else if(myGame.getPlayer().getCoins() >= myGame.getPlayer().getEquipment().getTierLevel() * 30) {
					myGame.getPlayer().setCoins(myGame.getPlayer().getCoins() - myGame.getPlayer().getEquipment().getTierLevel() * 30);
					myGame.getPlayer().getEquipment().setTierLevel(myGame.getPlayer().getEquipment().getTierLevel() + 1);
					lblCoins.setText("Player Coins: " + myGame.getPlayer().getCoins());
					lblTier.setText("Player Tier Level: " + myGame.getPlayer().getEquipment().getTierLevel());
					lblTierUpgradeCost.setText("(" + (myGame.getPlayer().getEquipment().getTierLevel() * 30) + " coins)");
					myGame.getPlayer().setAttack(10 + myGame.getPlayer().getEquipment().
							calculateEquipmentAttack(myGame.getPlayer().getEquipment().getEquipmentType()));
					lblAttack.setText("Player Attack: " + myGame.getPlayer().getAttack());
					lblTierWarning.setVisible(false);
				}
				else {
					lblTierWarning.setVisible(true);
					lblTierWarning.setText("Not enough coins.");
				}
			}
		});
		btnUpgradeTier.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUpgradeTier.setBounds(385, 106, 121, 40);
		battleScreen.add(btnUpgradeTier);
		
		JPanel changeWeaponScreen = new JPanel();
		frmMyGame.getContentPane().add(changeWeaponScreen, "name_13162403136397");
		changeWeaponScreen.setLayout(null);
		
		JButton btnChangeWeapon = new JButton("Change Weapon");
		btnChangeWeapon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				battleScreen.setVisible(false);
				changeWeaponScreen.setVisible(true);
				lblTierWarning.setVisible(false);
			}
		});
		btnChangeWeapon.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnChangeWeapon.setBounds(10, 111, 121, 40);
		battleScreen.add(btnChangeWeapon);
		
		JLabel lblComputerClass = new JLabel("Computer Class:");
		lblComputerClass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComputerClass.setBounds(290, 52, 227, 17);
		battleScreen.add(lblComputerClass);
		
		JLabel lblComputerWeapon = new JLabel("Computer Weapon:");
		lblComputerWeapon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComputerWeapon.setBounds(290, 73, 227, 17);
		battleScreen.add(lblComputerWeapon);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 277, 507, 128);
		battleScreen.add(scrollPane);
		
		JTextPane fightLog = new JTextPane();
		fightLog.setEditable(false);
		scrollPane.setViewportView(fightLog);
		
		JButton btnFightEasyAi = new JButton("Fight Easy AI");
		JButton btnFightHardAi = new JButton("Fight Hard AI");
		btnFightEasyAi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myGame.createComputerCharacter("easy", 10);
				lblComputerClass.setText("Computer Class:" + " " + myGame.getComputer().getType());
				lblComputerWeapon.setText("Computer Weapon Class:" + " " + myGame.getComputer().getEquipment().getEquipmentType());
				fightLog.setText("");
				fightLogList = myGame.doFight();
				lblCoins.setText("Player Coins: " + myGame.getPlayer().getCoins());
				displayFight(fightLog, lblCoins, btnFightEasyAi, btnFightMedAi, btnFightHardAi);
			}
		});
		btnFightEasyAi.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFightEasyAi.setBounds(10, 226, 140, 40);
		battleScreen.add(btnFightEasyAi);
		
	
		btnFightHardAi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myGame.createComputerCharacter("hard", 30);
				lblComputerClass.setText("Computer Class:" + " " + myGame.getComputer().getType());
				lblComputerWeapon.setText("Computer Weapon Class:" + " " + myGame.getComputer().getEquipment().getEquipmentType());
				fightLog.setText("");
				fightLogList = myGame.doFight();
				lblCoins.setText("Player Coins: " + myGame.getPlayer().getCoins());
				displayFight(fightLog, lblCoins, btnFightEasyAi, btnFightMedAi, btnFightHardAi);
			}
		});
		btnFightHardAi.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFightHardAi.setBounds(377, 226, 140, 40);
		battleScreen.add(btnFightHardAi);
		
		JLabel lbEasyFightLoseReward = new JLabel("Lose: -5 coins");
		lbEasyFightLoseReward.setHorizontalAlignment(SwingConstants.CENTER);
		lbEasyFightLoseReward.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbEasyFightLoseReward.setBounds(10, 212, 140, 14);
		battleScreen.add(lbEasyFightLoseReward);
		
		JLabel lbMedFightLoseReward = new JLabel("Lose: -5 coins");
		lbMedFightLoseReward.setHorizontalAlignment(SwingConstants.CENTER);
		lbMedFightLoseReward.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbMedFightLoseReward.setBounds(190, 212, 140, 14);
		battleScreen.add(lbMedFightLoseReward);
		
		JLabel lbHardFightLoseReward = new JLabel("Lose: -5 coins");
		lbHardFightLoseReward.setHorizontalAlignment(SwingConstants.CENTER);
		lbHardFightLoseReward.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbHardFightLoseReward.setBounds(377, 212, 140, 14);
		battleScreen.add(lbHardFightLoseReward);
		
		JLabel lblEasyFightWinReward = new JLabel("Win: +10 coins");
		lblEasyFightWinReward.setHorizontalAlignment(SwingConstants.CENTER);
		lblEasyFightWinReward.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEasyFightWinReward.setBounds(10, 191, 140, 14);
		battleScreen.add(lblEasyFightWinReward);
		
		JLabel lblMedFightWinReward = new JLabel("Win: +20 coins");
		lblMedFightWinReward.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedFightWinReward.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMedFightWinReward.setBounds(190, 191, 140, 14);
		battleScreen.add(lblMedFightWinReward);
		
		JLabel lblHardFightWinReward = new JLabel("Win: +30 coins");
		lblHardFightWinReward.setHorizontalAlignment(SwingConstants.CENTER);
		lblHardFightWinReward.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHardFightWinReward.setBounds(377, 191, 140, 14);
		battleScreen.add(lblHardFightWinReward);
		
		JLabel lblCharacterClass = new JLabel("Player Class:");
		lblCharacterClass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCharacterClass.setBounds(10, 52, 189, 17);
		battleScreen.add(lblCharacterClass);
		
		JLabel lblWeapons = new JLabel("Weapons");
		lblWeapons.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeapons.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWeapons.setBounds(10, 10, 507, 36);
		changeWeaponScreen.add(lblWeapons);
		
		JRadioButton radioButton = new JRadioButton("BattleAxe");
		btnChangeWeaponGroup.add(radioButton);
		radioButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		radioButton.setBounds(76, 111, 124, 21);
		changeWeaponScreen.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Dagger");
		btnChangeWeaponGroup.add(radioButton_1);
		radioButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		radioButton_1.setBounds(340, 111, 103, 21);
		changeWeaponScreen.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Fists");
		btnChangeWeaponGroup.add(radioButton_2);
		radioButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		radioButton_2.setBounds(227, 166, 103, 21);
		changeWeaponScreen.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Staff");
		btnChangeWeaponGroup.add(radioButton_3);
		radioButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		radioButton_3.setBounds(76, 215, 103, 21);
		changeWeaponScreen.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("Sword");
		btnChangeWeaponGroup.add(radioButton_4);
		radioButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		radioButton_4.setBounds(340, 215, 103, 21);
		changeWeaponScreen.add(radioButton_4);
		
		btnFightMedAi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myGame.createComputerCharacter("medium", 20);
				lblComputerClass.setText("Computer Class:" + " " + myGame.getComputer().getType());
				lblComputerWeapon.setText("Computer Weapon Class:" + " " + myGame.getComputer().getEquipment().getEquipmentType());
				fightLog.setText("");
				fightLogList = myGame.doFight();
				lblCoins.setText("Player Coins: " + myGame.getPlayer().getCoins());
				displayFight(fightLog, lblCoins, btnFightEasyAi, btnFightMedAi, btnFightHardAi);
			}
		});
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(btnWeaponGroup.getSelection() != null && btnClassGroup.getSelection() != null 
						&& btnAlignmentGroup.getSelection() != null 
						&& !textPane_name.getText().equals("")) {
					
					String weaponName = "";
					String characterClassName = "";
					String characterAlignmentName = "";
					String characterName = "";
					
					battleScreen.setVisible(true);
					setupCharacterScreen.setVisible(false);
					
					Enumeration elementsWeaponGroup = btnWeaponGroup.getElements();
					while(elementsWeaponGroup.hasMoreElements()) {
						AbstractButton radioButton = (AbstractButton) elementsWeaponGroup.nextElement();
					      if (radioButton.isSelected()) {
					        weaponName =  radioButton.getText();
					        break;
					      }
					}
					Enumeration elementsClassGroup = btnClassGroup.getElements();
					while(elementsClassGroup.hasMoreElements()) {
						AbstractButton radioButton = (AbstractButton) elementsClassGroup.nextElement();
					      if (radioButton.isSelected()) {
					        characterClassName =  radioButton.getText();
					        break;
					      }
					}
					Enumeration elementsAlignmentGroup = btnAlignmentGroup.getElements();
					while(elementsAlignmentGroup.hasMoreElements()) {
						AbstractButton radioButton = (AbstractButton) elementsAlignmentGroup.nextElement();
					      if (radioButton.isSelected()) {
					        characterAlignmentName =  radioButton.getText();
					        break;
					      }
					}
					characterName = textPane_name.getText();
					
					myGame.createPlayerCharacter(weaponName, characterClassName, characterAlignmentName, characterName);
					lblCharacterName.setText(lblCharacterName.getText() + " " + myGame.getPlayer().getName());
					lblHealth.setText(lblHealth.getText() + " " + myGame.getPlayer().getHealth());
					lblAttack.setText(lblAttack.getText() + " " + myGame.getPlayer().getAttack());
					lblCoins.setText(lblCoins.getText() + " " + myGame.getPlayer().getCoins());
					lblWeapon.setText(lblWeapon.getText() + " " + myGame.getPlayer().getEquipment().getEquipmentType());
					lblCharacterClass.setText(lblCharacterClass.getText() + " " + myGame.getPlayer().getType());
					lblTier.setText("Player Tier Level: " + myGame.getPlayer().getEquipment().getTierLevel());
					
					Enumeration elementsWeaponGroup2 = btnChangeWeaponGroup.getElements();
					while(elementsWeaponGroup2.hasMoreElements()) {
						AbstractButton radioButton = (AbstractButton) elementsWeaponGroup2.nextElement();
					      if (radioButton.getText().equals(myGame.getPlayer().getEquipment().getEquipmentType())) {
					    	  radioButton.setSelected(true);
					        break;
					      }
					}		
					
				}
				else {
					lblCannotContinue.setVisible(true);
				}
				
				
			}
		});
		btnContinue.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnContinue.setBounds(183, 309, 154, 55);
		setupCharacterScreen.add(btnContinue);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String weaponName = "";
				
				Enumeration elementsWeaponGroup = btnChangeWeaponGroup.getElements();
				while(elementsWeaponGroup.hasMoreElements()) {
					AbstractButton radioButton = (AbstractButton) elementsWeaponGroup.nextElement();
					if (radioButton.isSelected()) {
				        weaponName =  radioButton.getText();
				        break;
				      }
				}
				myGame.getPlayer().setAttack(10);
				myGame.getPlayer().setEquipment(weaponName);
				lblAttack.setText("Player Attack: " + myGame.getPlayer().getAttack());
				lblWeapon.setText("Player Weapon: " + myGame.getPlayer().getEquipment().getEquipmentType());
				lblTier.setText("Player Tier Level: " + myGame.getPlayer().getEquipment().getTierLevel());
				lblTierUpgradeCost.setText("(" + (myGame.getPlayer().getEquipment().getTierLevel() * 30) + " coins)");
				
				changeWeaponScreen.setVisible(false);
				battleScreen.setVisible(true);
			}
		});
		btnReturn.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReturn.setBounds(185, 329, 160, 59);
		changeWeaponScreen.add(btnReturn);
	}

	protected void displayFight(JTextPane fightLog, JLabel lblCoins, JButton btnFightEasyAi, JButton btnFightMedAi, JButton btnFightHardAi) {
		btnFightEasyAi.setEnabled(false);
		btnFightMedAi.setEnabled(false);
		btnFightHardAi.setEnabled(false);
		Timer timer = new Timer();
		timer.schedule(new timerTask(fightLogList, fightLog, fightLogList.getItemCount(), btnFightEasyAi, btnFightMedAi, btnFightHardAi), 0, 500);	
	}
}

class timerTask extends TimerTask  {
	private List fightLogList;
	private JTextPane fightLog;
	private JButton btnFightEasyAi;
	private JButton btnFightMedAi;
	private JButton btnFightHardAi;
	private int logLength;
	private int i = 0;

    public timerTask(List fightLogList, JTextPane fightLog, int logLength, JButton btnFightEasyAi, JButton btnFightMedAi,
			JButton btnFightHardAi) {
    	this.fightLog = fightLog;
		this.fightLogList = fightLogList;
		this.logLength = logLength;
		this.btnFightEasyAi = btnFightEasyAi;
		this.btnFightMedAi = btnFightMedAi;
		this.btnFightHardAi = btnFightHardAi;
	}

	@Override
    public void run() {
    	if(i < logLength) {
    		fightLog.setText(fightLog.getText() + fightLogList.getItem(i) + "\n");
    		i++;
    	}
    	else {
    		btnFightEasyAi.setEnabled(true);
    		btnFightMedAi.setEnabled(true);
    		btnFightHardAi.setEnabled(true);
    	}
    }
}
