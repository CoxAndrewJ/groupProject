package groupProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GameBoard{

	private JPanel contentPane;

	/**
	 * TODO
	 * Create the main frame of the item
	 * We will add 2 panels: the gameBoard panel on west
	 * and the sidePanel on east
	 * We then add two more panels to the east panel
	 * 
	 * @author Andrew 
	 */
	public GameBoard(boolean[] characters) {

		//Setting up basic properties of frame
		JFrame mainFrame = new JFrame();
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setBounds(100, 100, 1500, 800);
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainFrame.setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0,0));
		
		//Create the game Panel
		//PERHAPS I WILL LEAVE THE GAMEBOARD AS ITS OWN CLASS, IT MAY BE EASIER TO WORK THAT WAY
		
		/////////////////////VERY IMPORTANT
		JPanel gameBoard = new JPanel();
		contentPane.add(gameBoard, BorderLayout.CENTER);
		
		//Create a new panel to be on the East side, and hold two more panels-- resultsPanel & gameInteractionPanel
		JPanel sidePanel = createSidePanel();	
		contentPane.add(sidePanel, BorderLayout.EAST);
		
		mainFrame.setContentPane(contentPane);

	}
	
	
	/**
	 * --------------------------------------------------
	 *All the following code is for the side Panel.
	 *---------------------------------------------------
	 * The side panel is on the east side
	 * and contains two more panels--
	 * 		resultsPanel
	 * 		gameInteractionPanel
	 * 
	 * @author Andrew
	 * @return
	 */
	private JPanel createSidePanel() {
		JPanel sidePanel = new JPanel();
		sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));
		
		//Add the resultsPanel to the sidePanel
		//Will go on the upper side
		JPanel resultsPanel = createResultsPanel();
		sidePanel.add(resultsPanel);
		
		//Add the gameInteractionPanel to the sidePanel
		//will go on the lower side
		JPanel gameInteractionPanel = createGameInteractionPanel();
		sidePanel.add(gameInteractionPanel);
		
		return sidePanel;

	}

	/**
	 * Create the gameInteractionPanel
	 * 
	 * This will have 4 buttons, 
	 * 		Move
	 * 		Loot
	 * 		Fight/Attack
	 * 		Open
	 * 
	 */
	private JPanel createGameInteractionPanel() {
		JPanel gameInteractionPanel = new JPanel();
		gameInteractionPanel.setBackground(Color.GRAY);
		gameInteractionPanel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton moveBtn = new JButton("Move");
		gameInteractionPanel.add(moveBtn);
		
		JButton lootBtn = new JButton("Loot");
		lootBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		gameInteractionPanel.add(lootBtn);
		
		JButton fightBtn = new JButton("Fight/Attack");
		gameInteractionPanel.add(fightBtn);
		
		JButton openBtn = new JButton("Open");
		gameInteractionPanel.add(openBtn);	
		return gameInteractionPanel;
	}



	private JPanel createResultsPanel() {
		JPanel resultsPanel = new JPanel();
		resultsPanel.setBackground(Color.LIGHT_GRAY);
		resultsPanel.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel healthLbl = new JLabel("Health: " /*+ healthAmount*/);
		healthLbl.setFont(new Font("Tahoma", Font.PLAIN, 32));
		healthLbl.setHorizontalAlignment(SwingConstants.CENTER);
		resultsPanel.add(healthLbl);
		
		JLabel diceRollLbl = new JLabel("Dice Roll: " /*+ dice.getRoll*/);
		diceRollLbl.setFont(new Font("Tahoma", Font.PLAIN, 32));
		diceRollLbl.setHorizontalAlignment(SwingConstants.CENTER);
		resultsPanel.add(diceRollLbl);
		
		JLabel actionsLbl = new JLabel("Actions: " /*+ numberOfActions*/);
		actionsLbl.setFont(new Font("Tahoma", Font.PLAIN, 32));
		actionsLbl.setHorizontalAlignment(SwingConstants.CENTER);
		resultsPanel.add(actionsLbl);
		
		JLabel objectiveLbl = new JLabel("Objective: " /*+ objectiveNumber*/);
		objectiveLbl.setFont(new Font("Tahoma", Font.PLAIN, 32));
		objectiveLbl.setHorizontalAlignment(SwingConstants.CENTER);
		resultsPanel.add(objectiveLbl);
		
		//This label will be an image
		JLabel statusIconLbl = new JLabel("statusIconLbl");
		//statusIconLbl.setIcon(smileyFace,SadFace);
		statusIconLbl.setFont(new Font("Tahoma", Font.PLAIN, 32));
		statusIconLbl.setHorizontalAlignment(SwingConstants.CENTER);
		resultsPanel.add(statusIconLbl);
		
		//Potentially used to display a dice image
		/*
		JLabel lblNewLabel_1 = new JLabel("New label");
		add(lblNewLabel_1);
		*/		
		return resultsPanel;
	}
}
