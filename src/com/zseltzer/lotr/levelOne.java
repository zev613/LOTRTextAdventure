package com.zseltzer.lotr;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.*;

public class levelOne 
{
	public static String choice1;
	public static String choice2;
	public static String choice3;
	public static String choice4;
	public Boolean startSequence = false;
	public String descriptionText;
	public String dialogTitle;
	public String eventName = "";
	public int eventNum = 0;
	public String homeTemp = "";
	public int baseHealth = 10;
	public int currentHealth;
	public int baseAttack = 4;
	// Every 2 baseAttack points correspond to 1 baseHealth.

	//private JFrame levelFrame;
	//private JLabel levelHeaderLabel;
	//private JLabel levelStatusLabel;
	//private JPanel levelControlPanel;
	//public levelOne(){
	      //setupGUI();
	/*
	private void setupGUI()
	   {
	     levelFrame = new JFrame("Lord of The Rings Text Adventure");
	      //this
	      levelFrame.setSize(450,450);
	      levelFrame.setLayout(new GridLayout(3, 1));
	      levelFrame.addWindowListener(new WindowAdapter() 
	      {
	         public void windowClosing(WindowEvent windowEvent)
	         {
	            System.exit(0);
	         }        
	      }); 
	   */
	      /*
	      levelHeaderLabel = new JLabel("", JLabel.CENTER);        
	      levelStatusLabel = new JLabel("",JLabel.CENTER);    
	      levelStatusLabel.setSize(420,100);

	      levelControlPanel = new JPanel();
	      levelControlPanel.setLayout(new FlowLayout());

	      levelFrame.add(levelHeaderLabel);
	      levelFrame.add(levelControlPanel);
	      levelFrame.add(levelStatusLabel);
	      levelFrame.setVisible(true); 
	   }
*/	
	public void startGame(String name, String race, String home) 
	{
		if (MainGameGUI.beginGame == true)
		{
			
			//setupGUI();
			//System.out.println("Name and Race are equal to: " + name + " the " + race + ", and your home is " + home);
			if (race == "Wizard")
			{
				homeTemp = " the Grey";
			}
			else
			{
				homeTemp = " of " + home;
			}
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
		    	    "Among the people of Middle Earth, you shall be known as:\n" + name + homeTemp + ".",
		    	    "Welcome, " + "MainGameGUI.name" + "!",
		    	    JOptionPane.PLAIN_MESSAGE);
			levelOne start = new levelOne();
			start.beginEvent();
		}
		else
		{
			//custom title, error icon
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    "Something weird happened. Sorry about that!",
			    "Error!",
			    JOptionPane.ERROR_MESSAGE);
		}
	}
	public void beginEvent()
	{
		if (MainGameGUI.race == "Wizard")
		{
			eventName = "BagEnd";
			eventNum = 1;
			descriptionText = "The tale begins in a hole in the ground. In this hole, there lived a hobbit. You knock on the door. Frodo Baggins answers. \n Frodo: 'Ah my dear friend " + MainGameGUI.name + "! What can I do for you, old friend?'";
			dialogTitle = "The Beginning: Bag End";
				choice1 = "'Is it secret? Is it safe? Where is the ring? You must keep it hidden!'";
				choice2 = "'The enemy stirs in the Land of Mordor, where the Shadows lie. This ring is the One Ring of Sauron.'";
				String[] eventOneChoicesWiz = { choice1, choice2};
				String inputChoices = (String) JOptionPane.showInputDialog(null, descriptionText,
				dialogTitle, JOptionPane.QUESTION_MESSAGE, null,                                                                 // icon
				eventOneChoicesWiz, // Array of choices
				eventOneChoicesWiz[1]); // Initial choice 
			if (inputChoices == eventOneChoicesWiz[0])
			{
				//MainGameGUI.mainFrame.add();
				//MainGameGUI.mainFrame.revalidate(); // to invoke the layout manager
				//MainGameGUI.mainFrame.repaint();
				JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	    "Frodo: 'I have it right here. Why?'",
			    	    "Conversation",
			    	    JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	    "You: 'This ring is the One Ring.'\n'It belong to the enemy, Sauron of Mordor. He must never find. it.'\nFrodo: 'It is safe here, is it not? He does not know to look in the Shire, does he?'", 
			    	    "Conversation",
			    	    JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	    "You: 'There is another who knew it was here, other than Bilbo.'\n'Gollum was forced to tell them. They are coming to get it.'\nFrodo: 'What do we do? We can't stay here in the Shire!'", 
			    	    "Conversation",
			    	    JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	    "You: 'You must leave at once. Go to the Prancing Pony in Bree. I will meet you there soon.'\nFrodo: 'Okay " + MainGameGUI.name + ". I'll travel by day, stay off the road at night. I will see you soon " + MainGameGUI.name + ".'",
			    	    "Conversation",
			    	    JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	    "You leave, and visit Saruman, another wizard. Saruman betrayed you, and you were imprisoned.\nAfter a few days, you escape, and meet Frodo in Rivendell.",
			    	    "Narration",
			    	    JOptionPane.PLAIN_MESSAGE);
				currentHealth = baseHealth - 2;
				JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	    "You were hurt while imprisoned by Saruman.\nYour health is now: " + currentHealth + ".",
			    	    "Health",
			    	    JOptionPane.WARNING_MESSAGE);
			//This Branch of Dialog finished.
				levelTwo startEvent = new levelTwo();
				startEvent.beginEvent();
			}
			else if (inputChoices == eventOneChoicesWiz[1])
			{
				JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	    "Frodo: 'The ring belongs to Sauron? Does he know it is here?'\n'He can't have known it was here in the Shire.'",
			    	    "Conversation",
			    	    JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	    "You: 'There is another who knew it was here, other than Bilbo.'\n'Gollum was forced to tell them. They are coming to get it.'\nFrodo: 'What do we do? We can't stay here in the Shire!'", 
			    	    "Conversation",
			    	    JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	    "You: 'You must leave at once. Go to the Prancing Pony in Bree. I will meet you there soon.'\nFrodo: 'Okay " + MainGameGUI.name + ". I'll travel by day, stay off the road at night.'\n'I will see you soon " + MainGameGUI.name + ".'", 
			    	    "Conversation",
			    	    JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	    "You leave, and visit Saruman, another wizard. Saruman betrayed you, and you were imprisoned.\nYou luckily escape, and make it to the Prancing Pony. You find Frodo, and you leave for Rivendell, with Frodo and Strider accompanying you.",
			    	    "Narration",
			    	    JOptionPane.PLAIN_MESSAGE);
				currentHealth = baseHealth - 2;
				JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	    "You were hurt while imprisoned by Saruman.\nYour health is now: " + currentHealth + ".",
			    	    "Health",
			    	    JOptionPane.WARNING_MESSAGE);
			//This Branch of Dialog finished.
				levelThree start = new levelThree();
				start.startLevel3();
			}	
		}
		else
		{
			levelOne start = new levelOne();
		start.OtherRacesEvent1();
		}
	}
	public void OtherRacesEvent1()
	{
		
		eventName = "BagEnd";
		eventNum = 1;
		descriptionText = "The tale begins in a hole in the ground. In this hole, there lived a hobbit. You knock on the door. Frodo Baggins answers. \n Frodo: 'Ah my dear friend " + MainGameGUI.name + "! What are you doing here?'";
		dialogTitle = "The Beginning: Bag End";
			choice1 = "'Don't we need to meet Gandalf at the Prancing Pony in Bree? Are you ready to go?'";
			choice2 = "'How have you been Frodo?'";
			choice3 = "'The enemy stirs in the Land of Mordor, where the Shadows lie. We must leave on our journey immediately!!'";
			choice4 = "'You still have the ring, right?  \n I believe that is what Gandalf wanted to meet about.'";	
				String[] eventOneChoices = { choice1, choice2, choice3, choice4};
					String inputChoices = (String) JOptionPane.showInputDialog(null, descriptionText,
					dialogTitle, JOptionPane.QUESTION_MESSAGE, null,                                                                 // icon
					eventOneChoices, // Array of choices
					eventOneChoices[1]); // Initial choice 
		if (inputChoices == eventOneChoices[0])
		{
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
					"Frodo: 'Ah yes! I almost forgot!!'\n'Let me go get my supplies, then we can leave.'",
		    	    "Conversation",
		    	    JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	   "You both leave for Bree. A few days later you arrive at the Prancing Pony.\nAll sorts of men, hobbits, and a few dwarves are there, but no Gandalf.",
			    	   "Narration", 
			    	   JOptionPane.PLAIN_MESSAGE);	
			//This Branch of Dialog finished.
			levelTwo startEvent = new levelTwo();
			startEvent.beginEvent();
		}
		  // I left off here. Continue here.
		  // I left off here. Continue here.
		  // I left off here. Continue here.
		else if (inputChoices == eventOneChoices[1])
		{
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
		    	    "Frodo: 'I am very well my friend.'",
		    	    "Conversation",
		    	    JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
		    	    "You: 'Are you all set to leave on our journey to Bree?'\nFrodo: 'Oh I almost forgot that we need to go meet Gandalf!'\n'Let me get my supplies, then we can leave.'",
		    	    "Conversation",
		    	    JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	   "You both leave for Bree. A few days later you arrive at the Prancing Pony.\nAll sorts of men, hobbits, and a few dwarves are there, but no Gandalf.",
			    	   "Narration", 
			    	   JOptionPane.PLAIN_MESSAGE);
		//This Branch of Dialog finished.
			levelTwo startEvent = new levelTwo();
			startEvent.beginEvent();
		}
		else if (inputChoices == eventOneChoices[2])
		{
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
		    	    "Frodo: 'Mordor. Now that is one place you only want to see from a distance.'\n'I hope I never have to go there.",
		    	    "Conversation",
		    	    JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
		    	    "You: 'Sauron must be gathering his strength. Anyway, Gandalf is worried about the ring.'\nFrodo: 'I wonder if the ring is somehow connected to Sauron.'",
		    	    "Conversation",
		    	    JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
		    	    "You: 'Are you ready to go? We need to go to Bree.'\nFrodo: 'Ah yes. Let me get my supplies, then we can go.'",
		    	    "Conversation",
		    	    JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
		    	   "You both leave for Bree. A few days later you arrive at the Prancing Pony.\nAll sorts of men, hobbits, and a few dwarves are there, but no Gandalf.",
		    	   "Narration", 
		    	   JOptionPane.PLAIN_MESSAGE);
		//This Branch of Dialog finished.
			levelTwo startEvent = new levelTwo();
			startEvent.beginEvent();
		}
		else if (inputChoices == eventOneChoices[3])
		{
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
		    	    "Frodo: 'Do not worry, my friend. It is safe, I keep it hidden.'\n'Do you know what it actually is?",   
		    	    "Conversation",
		    	    JOptionPane.PLAIN_MESSAGE);			
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
		    	    "You: 'I have no idea. But it is safe?'\nFrodo: 'Yes. Let me get my supplies, then we can leave for Bree.",
		    	    "Conversation",
		    	    JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
			    	   "You both leave for Bree. A few days later you arrive at the Prancing Pony.\nAll sorts of men, hobbits, and a few dwarves are there, but no Gandalf.",
			    	   "Conversation", 
			    	   JOptionPane.PLAIN_MESSAGE);
		//This Branch of Dialog finished.		
			levelTwo startEvent = new levelTwo();
			startEvent.beginEvent();
		}
			else
			{
				JOptionPane.showMessageDialog(MainGameGUI.mainFrame,
					    "Something terrible has happened!! What could it be?",
					    "Error!",
					    JOptionPane.ERROR_MESSAGE);
			}
	}

}