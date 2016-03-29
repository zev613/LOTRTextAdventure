package com.zseltzer.lotr;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.*;

public class levelThree 
{
	
	public String descriptionText;
	public String dialogTitle;
	public String eventName = "";
	public int eventNum = 0;

	//private JFrame levelTwoFrame;
	//private JLabel levelTwoHeaderLabel;
	//private JLabel levelTwoStatusLabel;
	//private JPanel levelTwoControlPanel;
	
	//public levelOne(){
	      //setupGUI();
	/*
	private void setupGUI2()
	   {
	     levelTwoFrame = new JFrame("Lord of The Rings Adventure");
	      //this
	      levelTwoFrame.setSize(350,350);
	      levelTwoFrame.setLayout(new GridLayout(3, 1));
	      levelTwoFrame.addWindowListener(new WindowAdapter() 
	      {
	         public void windowClosing(WindowEvent windowEvent)
	         {
	            System.exit(0);
	         }        
	      });    
	      
	      levelTwoHeaderLabel = new JLabel("", JLabel.CENTER);        
	      levelTwoStatusLabel = new JLabel("",JLabel.CENTER);    
	      levelTwoStatusLabel.setSize(500,100);

	      levelTwoControlPanel = new JPanel();
	      levelTwoControlPanel.setLayout(new FlowLayout());

	      levelTwoFrame.add(levelTwoHeaderLabel);
	      levelTwoFrame.add(levelTwoControlPanel);
	      levelTwoFrame.add(levelTwoStatusLabel);
	      levelTwoFrame.setVisible(true);  
	   }
	*/
	public void startLevel3()
	{
		//setupGUI2();
		levelThree startEvent = new levelThree();
		startEvent.beginEvent();
	}
	
	public void beginEvent()
	{
		eventName = "Rivendell";
			eventNum = 3;
			descriptionText = "";
			dialogTitle = "Rivendell";
				String choice1 = "Test option for Rivendell choice 1";
				String choice2 = "This is the description for Rivendell choice2.";
				String choice3 = "Rivendell Option 3 will go here.";
				String choice4 = "This is Rivendell choice #4.";
			String[] event2Choices = { choice1, choice2, choice3, choice4};
			String inputChoices = (String) JOptionPane.showInputDialog(null, descriptionText,
			dialogTitle, JOptionPane.QUESTION_MESSAGE, null,                                                                 // icon
			event2Choices, // Array of choices
			event2Choices[1]); // Initial choice 
			if (inputChoices == event2Choices[0])
				{
				//Dialog after option 1 goes here.
					JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
						    "This is Dialog option #1",
						    "Test Dialog",
						    JOptionPane.PLAIN_MESSAGE);
				}
				else if (inputChoices == event2Choices[1])
				{
					//Dialog after option 2 goes here.
					JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
						    "This is Dialog option #2.",
						    "Test Dialog",
						    JOptionPane.PLAIN_MESSAGE);
				}
				else if (inputChoices == event2Choices[2])
				{
					//Dialog after option 3 goes here.
					JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
						    "This is Dialog option #3.",
						    "Test Dialog",
						    JOptionPane.PLAIN_MESSAGE);
				}
				else if (inputChoices == event2Choices[3])
				{				
					//Dialog after option 4 goes here.
					JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
						    "This is Dialog option #4.",
						    "Test Dialog",
						    JOptionPane.PLAIN_MESSAGE);
				}
					else
					{
						JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
							    "There is a problem. I don't know why.",
							    "Error!",
							    JOptionPane.ERROR_MESSAGE);					}
	}				
}
		