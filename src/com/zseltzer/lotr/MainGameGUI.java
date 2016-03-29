package com.zseltzer.lotr;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainGameGUI
{
	public static boolean beginGame;
	public static boolean raceValid;
	public static boolean homeValid;
	public static boolean nameValid;
	public static String name;
	public static String race;
	public static String home;
	public static String HobbitHomeTown;
	//private Boolean notAllOptionsValid = false;

	
		public static JFrame mainFrame;
		public static JLabel headerLabel;
		public static JLabel statusLabel;
		public static JPanel controlPanel;
		//private JLabel optionLabel;
	
		public MainGameGUI(){
		      prepareGUI();
		   }
		
	public static void main(String[] args)
	{	
		MainGameGUI  MainGameGUI = new MainGameGUI();      
			MainGameGUI.GameDemo();
	}
	
	private void prepareGUI()
	   {
	      mainFrame = new JFrame("Lord of The Rings Text Adventure");
	      //this
	      mainFrame.setSize(450,450);
	      mainFrame.setLayout(new GridLayout(3, 1));
	      mainFrame.addWindowListener(new WindowAdapter() 
	      {
	         public void windowClosing(WindowEvent windowEvent)
	         {
	            System.exit(0);
	         }        
	      });    
	      
	      headerLabel = new JLabel("", JLabel.CENTER);        
	      statusLabel = new JLabel("",JLabel.CENTER);    
	      statusLabel.setSize(420,100);

	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());

	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);
	      mainFrame.setVisible(true);  
	   }
	   private void GameDemo()
	   {	
		   headerLabel.setText("Welcome to Zev's Lord of The Rings Adventure Game."); 
		   headerLabel.setFont(new Font("Serif", Font.PLAIN, 18));
		      JLabel choiceLabel = new JLabel("", JLabel.CENTER);		      
		      JButton submitButton = new JButton("<html><center><font color=#0000FF><b>Play Game</b><br>");
		      	submitButton.addActionListener(new ActionListener() 
		      	{
		      		public void actionPerformed(ActionEvent e) 
		      		{
		      			String[] choices = { "Hobbit", "Dwarf", "Elf", "Man", "Wizard"};
		      			String input = (String) JOptionPane.showInputDialog(null, "Welcome to Zev's LOTR Adventure Game!\n\nPlease choose your race. Select from the options below.\n",
		      			"Race Selector", JOptionPane.QUESTION_MESSAGE, null,                                                                 // icon
		        choices, // Array of choices
		        choices[0]); // Initial choice
		    if (input == choices[0])
		    {
		    	race = "Hobbit";
		    	System.out.print("You have chosen " + race);
		    	//Separate
		    	String[] choicesHome = { "Hobbiton", "Michel Delving", "Bywater", "Bucklebury", "Tuckborough" };
			    String myHome = (String) JOptionPane.showInputDialog(null, "Please select the Kingdom or City you want to live in,\n from the options below.",
			        "Home Selector", JOptionPane.QUESTION_MESSAGE, null, 
			        choicesHome, // Array of choices
			        choicesHome[0]); // Initial Choice shown.
			    HobbitHomeTown = myHome;
			    home = "The Shire";
			    MainGameGUI.raceValid = true;
			    System.out.println("\nYour Home is " + home + "!");
			    MainGameGUI.homeValid = true;
		    }
		    else if (input == choices[1])
		    {
		    	race = "Dwarf";
		    	System.out.print("You have chosen " + race);
		    	//Separate
		    	String[] choicesHome = { "Erebor", "Moria", "Iron Hills"};
			    String myHome = (String) JOptionPane.showInputDialog(null, "Please select the Kingdom or City you are from,\nOf the options below.",
			        "Home Selector", JOptionPane.QUESTION_MESSAGE, null, 
			        choicesHome, // Array of choices
			        choicesHome[0]);
			    home = myHome;
			    MainGameGUI.raceValid = true;
			    System.out.println("\nYour Home is " + home + "!");
			    MainGameGUI.homeValid = true;
		    }
		    else if (input == choices[2])
		    {
		    	race = "Elf";
		    	System.out.print("You have chosen " + race);
		    	//Separate
		    	String[] choicesHome = { "Rivendell", "Mirkwood", "Lothlorien", "Lindon", "Grey Havens"};
			    String myHome = (String) JOptionPane.showInputDialog(null, "Please select the Kingdom or City you want to live in,\n from the options below.",
			        "Home Selector", JOptionPane.QUESTION_MESSAGE, null, 
			        choicesHome, // Array of choices
			        choicesHome[0]);
			    home = myHome;
			    MainGameGUI.raceValid = true;
			    System.out.println("\nYour Home is " + home + "!");
			    MainGameGUI.homeValid = true;
			    System.out.println("raceValid and homeValid" + raceValid + "   " + homeValid);
		    }
		    else if (input == choices[3])	
		    {
		    	race = "Man";
		    	System.out.print("You have chosen " + race);
		    	//Separate
		    	String[] choicesHome = { "Ithilien", "Gondor", "Bree", "Rohan", "Dale"};
			    String myHome = (String) JOptionPane.showInputDialog(null, "Please select the Kingdom or City you want to live in,\n from the options below.",
			        "Home Selector", JOptionPane.QUESTION_MESSAGE, null, 
			        choicesHome, // Array of choices
			        choicesHome[0]);
			    home = myHome;
			    MainGameGUI.raceValid = true;
			    System.out.println("\nYour Home is " + home + "!");
			    MainGameGUI.homeValid = true;
		    }
		    else if (input == choices[4])	
		    {
		    	race = "Wizard";
		    	System.out.print("You have chosen " + race);
		    	//Separate
		    	String[] choicesHome = { "With all the good folk of Middle Earth"};
			    String myHome = (String) JOptionPane.showInputDialog(null, "Please select the Kingdom or City you want to live in,\n from the options below.",
			        "Home Selector", JOptionPane.QUESTION_MESSAGE, null, 
			        choicesHome, // Array of choices
			        choicesHome[0]);
			  	myHome = "Nowhere";
			    MainGameGUI.raceValid = true;
			    System.out.println("\nYou have no permanent home, since you are a Traveling Wizard!");
			    MainGameGUI.homeValid = true;
		    }
		    else
		    {
		    System.out.print("There's been a problem. YOu did not select a race. Fix it yourself!");
		    }
		    //System.out.println(input);
	      		String input2 = (String)JOptionPane.showInputDialog(
		                        mainFrame,
		                        "Please enter your Player Name.\n"
		                        + "\"It can be anything you want to be called.\"",
		                        "Player Identifier",
		                        JOptionPane.QUESTION_MESSAGE,
		                        null,
		                        null, "Type your player name.");
		    //If a string was returned, say so.
		    if ((input2 != null) && (input2.length() > 0)) {
		    	name = input2.toLowerCase();
			    name = name.substring(0, 1).toUpperCase() + name.substring(1);
			    System.out.println("\nYour name is " + name + "!");
			    MainGameGUI.nameValid = true;
		    }
		    else
		    {
		    	JOptionPane.showMessageDialog(mainFrame,
					    "There's been a problem. YOu did not select a race. Fix it yourself!",
					    "Error!",
					    JOptionPane.ERROR_MESSAGE);
		    	//MainGameGUI.raceValid = false;
		    }
		    //if (raceValid = false)
		    //{
		    //
		    //}
		    if(MainGameGUI.raceValid == true && MainGameGUI.nameValid == true && MainGameGUI.homeValid == true)
		    {
		    	JOptionPane.showMessageDialog(mainFrame,
		    	    "You are ready to start playing.\nLoading Middle Earth.",
		    	    "Starting Game ....",
		    	    JOptionPane.PLAIN_MESSAGE);
				beginGame = true;
		    }
		    else
		    {
		    	JOptionPane.showMessageDialog(mainFrame,
					    "For some reason, you did not complete all of the forms. Shame on you!!",
					    "Error!",
					    JOptionPane.ERROR_MESSAGE);
		    	prepareGUI();
		    	GameDemo();
		    }
		    
		    if (beginGame == true)
			{
				System.out.println("Level One Testing.");
					levelOne start = new levelOne();
					start.startGame(name, race, home);
			}
			else
			{
				JOptionPane.showMessageDialog(mainFrame,
					    "Test Failed.",
					    "Error!",
					    JOptionPane.ERROR_MESSAGE);			}
		 }
	} );
	      	 controlPanel.add(choiceLabel);
		     controlPanel.add(submitButton);
		     mainFrame.setVisible(true);
	   }
}

