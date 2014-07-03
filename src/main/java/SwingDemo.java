package main.java;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDemo {
	
	SwingDemo(){
		
		JFrame frame = new JFrame("A Simple Swing Program");
		frame.setSize(300,150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("The power of the swinnnng");
		
		
		frame.add(label);	
		frame.setVisible(true);
		
	}

}
