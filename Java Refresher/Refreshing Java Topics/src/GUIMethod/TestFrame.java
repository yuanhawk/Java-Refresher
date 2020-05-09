package GUIMethod;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class TestFrame extends JFrame { // window that contains the other components

	// can contain instance var & methods
	// can contain static var & methods
	
	public TestFrame() {
		// can access all variable & methods of OuterClass
		// can contain instance variables and methods
		// can't contain static variable or methods
		
		//code that sets up the frame
		this.setTitle("Test Frame");
		this.setSize(400, 100);
		this.setLocationByPlatform(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets the operation that's executed when the user clicks the Close button of the frame
		
		JPanel panel = new JPanel(); // creates a panel & add it to the frame
		this.add(panel);
		
		// code that creates the button and adds the listener
		JButton button1 = new JButton("Test Button");
		ActionListener listener = new ClickListener(); // ClickListener class implements the ActionListener interface
		button1.addActionListener(listener); // Code within the inner class executed if the user clicks on the btn
		
		// code that adds the btn to the panel & displays the frame
		panel.add(button1);
		this.setVisible(true);
		
	}
	
	// inner class that implements the listener
	class ClickListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("The button was clicked!");
		}
	}
}
