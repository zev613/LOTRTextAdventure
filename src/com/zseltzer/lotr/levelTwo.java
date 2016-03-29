package com.zseltzer.lotr;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.*;

public class levelTwo 
{
	
	public String descriptionText;
	public String dialogTitle;
	public String eventName = "";
	public int eventNum = 0;
	public void startLevel2()
	{
		
	}
	public void beginEvent()
	{
		JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
		    	    "You and Frdo arrive in the Village of Bree after your short journey.\nUpon entering the village, you go to the Prancing Pony Inn and Tavern.\nBarliman Butterbur, owner of the Prancing Pony greets you.",
		    	    "Conversation",
		    	    JOptionPane.PLAIN_MESSAGE);	
		if (MainGameGUI.home == "Bree")
		{
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
		    	    "Barliman Butterbur: 'Welcome home, master " + MainGameGUI.name + ". How are you?'",
		    	    "Conversation",
		    	    JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
		    	    "You: 'I am well Barliman.'",
		    	    "Conversation",
		    	    JOptionPane.PLAIN_MESSAGE);	
			eventName = "PrancingPony";
			eventNum = 3;
			descriptionText = "WHat do you want to say to Barliman Butterbur?";
			dialogTitle = "Bree";
				String choice1 = "Is Gandalf here?\nHe's a old wizard, with a pointy hat.";
				String choice2 = "How have things been while I was gone?";
			String[] event2Choices = { choice1, choice2};
			String inputChoices = (String) JOptionPane.showInputDialog(null, descriptionText,
			dialogTitle, JOptionPane.QUESTION_MESSAGE, null,                                                                 // icon
			event2Choices, // Array of choices
			event2Choices[1]); // Initial choice
				if (inputChoices == choice1)
				{
					JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
				    	    "Barliman: 'Gandalf...? Oh.... yes. Well no, I haven't seen him for at least a month.'",
				    	    "Conversation",
				    	    JOptionPane.PLAIN_MESSAGE);	
					JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
				    	    "You: 'He's supposed to have met us here.",
				    	    "Conversation",
				    	    JOptionPane.PLAIN_MESSAGE);
					JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
				    	    "Barliman: 'You should probably wait for a few days for him then.'",
				    	    "Conversation",
				    	    JOptionPane.PLAIN_MESSAGE);	
					JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
				    	    "Barliman: 'There's a man here who wants to talk to you.\nHe's one of them Ranger folk, people 'round here call him Strider.\nHe's over in that corner.'",
				    	    "Conversation",
				    	    JOptionPane.PLAIN_MESSAGE);	
				}
		}
		else
		{
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
		    	    "Barliman Butterbur: 'Welcome, master " + MainGameGUI.race + ". How can I help you?'",
		    	    "Conversation",
		    	    JOptionPane.PLAIN_MESSAGE);		
		}
		
		eventName = "PrancingPony";
		eventNum = 3;
		descriptionText = "WHat do you want to say to Barliman Butterbur?";
		dialogTitle = "Bree";
			String choice1 = "Is Gandalf here?\nHe's a old wizard, with a pointy hat.";
			String choice2 = "Can I get a pint?";
		String[] event2Choices = { choice1, choice2};
		String inputChoices = (String) JOptionPane.showInputDialog(null, descriptionText,
		dialogTitle, JOptionPane.QUESTION_MESSAGE, null,                                                                 // icon
		event2Choices, // Array of choices
		event2Choices[1]); // Initial choice
			if (inputChoices == event2Choices[0])
			{
				JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	    "Barliman: 'Gandalf...? Oh.... yes. Well no, I haven't seen him for at least a month.'",
			    	    "Conversation",
			    	    JOptionPane.PLAIN_MESSAGE);	
				JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	    "You: 'He's supposed to have met us here.",
			    	    "Conversation",
			    	    JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	    "Barliman: 'You should probably wait for him.'",
			    	    "Conversation",
			    	    JOptionPane.PLAIN_MESSAGE);	
				JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	    "Barliman: 'I believe there's a man here who wants to talk to you.\nOh yes, thats right, that man in the corner.\nHe's one of them Ranger folk, people 'round here call him Strider.\nHe's over in that corner.'",
			    	    "Conversation",
			    	    JOptionPane.PLAIN_MESSAGE);	 
			if (inputChoices == event2Choices[1])
				{
				//Dialog after option 1 goes here.
					JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
						    "Barliman Butterbur: 'Right away, master " + MainGameGUI.race + ". 1 Pint of Ale coming right up.'",
						    "Conversation",
						    JOptionPane.PLAIN_MESSAGE);
					JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
						    "You: *Takes a sip* 'Is Gandalf here? The old wizard in Grey?'",
						    "Conversation",
						    JOptionPane.PLAIN_MESSAGE);
					JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
				    	    "Barliman: 'Gandalf...? Oh.... yes. Well no, I haven't seen him for at least a month.'",
				    	    "Conversation",
				    	    JOptionPane.PLAIN_MESSAGE);	
					JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
				    	    "You: 'He's supposed to have met us here.",
				    	    "Conversation",
				    	    JOptionPane.PLAIN_MESSAGE);
					JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
				    	    "Barliman: 'You should probably wait for him.'",
				    	    "Conversation",
				    	    JOptionPane.PLAIN_MESSAGE);	
					JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
				    	    "Barliman: 'I believe there's a man here who wants to talk to you.\nOh yes, thats right, that man in the corner.\nHe's one of them Ranger folk, people 'round here call him Strider.\nHe's over in that corner.'",
				    	    "Conversation",
				    	    JOptionPane.PLAIN_MESSAGE);	 
					levelThree start = new levelThree();
					start.startLevel3();
				}
					else
					{
						JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
							    "There is a problem. I don't know why.",
							    "Error!",
							    JOptionPane.ERROR_MESSAGE);					}
		}				
	}
}
		