import javax.swing.*; //Don't forget to import this package
import java.awt.*;
import java.awt.event.*;
//This is Just a comment
//Another
public class simplegui implements ActionListener, MouseListener {
	JButton button;
	public static void main(String args[])
	{
		simplegui gui = new simplegui();
		gui.go();
	}
	
	public void go()
	{
		//Make a Frame
		JFrame frame = new JFrame();
		//Make a Button Widget
		button = new JButton("Click Me");
		
		
		//Add me to your list of listeners, Register with the button
		//Must be an object of a Class that implements ActionListener and Mouse Listener interface
		button.addActionListener(this);
		button.addMouseListener(this);
		
		
		// Make the program quit as soon as pressing Close button else the program Sits on the screen forever
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Add the Button to Frame's Content Pane
		frame.getContentPane().add(BorderLayout.CENTER, button);
		
		//Give the fame a size in Pixel
		frame.setSize(300, 300);
		
		//Make it visible, if you forget this step, you won't see anything when you run this code
		
		frame.setVisible(true);
	}// End of main Method
	
	//Implements Action Listeners ActionPerformed method i.e, event handling 
	
	public void actionPerformed(ActionEvent event)
	{
		button.setText("I've been Clicked!!");
	}
	//Implemets Mouse Listeners methods 
	public void mouseEntered(MouseEvent event)
	{
		button.setText("Mouse Entered");
	}
	public void mousePressed(MouseEvent event)
	{
		button.setText("Mouse Pressed");
	}
	public void mouseClicked(MouseEvent event)
	{
		button.setText("Mouse Clicked");
	}
	public void mouseReleased(MouseEvent event)
	{
		button.setText("Mouse Released");
	}
	public void mouseExited(MouseEvent event)
	{
		button.setText("Mouse Exited");
	}
}
