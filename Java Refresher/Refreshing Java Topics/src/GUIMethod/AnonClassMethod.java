package GUIMethod;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AnonClassMethod {
	
	public AnonClassMethod() {
		// code that starts setting up the frame
		
		/*
		// code that creates the button and adds the listener
		JButton button1 = new JButton("Test Button");
		ActionListener listener = new ActionListener() { // defines a var for an ActionListener obj named listener using anonymous class
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("The button was clicked!"); // Code for the class that implements the interface
			}
		};
		button1.addActionListener(listener);
		// code that finishes setting up the frame
		*/
		
		//code that starts setting up the frame
		
		// code that creates the button and adds the listener
		JButton button1 = new JButton("TestButton");
		button1.addActionListener(new ActionListener() { // implements interface w/o assigning an instance var
			@Override
			public void actionPerformed(ActionEvent e) { // Create new ActionListener obj
				System.out.println("Button 1 clicked!"); // Code for the class that implements the interface
			}
		});
		
		// code that finishes setting up the frame
		
		// An anonymous class is a type of inner class that doesn't have a name
		// Code the braces for an anon class after the parentheses that attempt to create an obj fr an interface
	}

}
