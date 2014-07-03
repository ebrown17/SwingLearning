package main.java;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonDemo implements ActionListener {

	JLabel label;
	
	ButtonDemo(){
		
		JFrame frame = new JFrame("A Button Example");
		
		frame.setLayout(new FlowLayout());
		frame.setSize(225,90);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton firstB = new JButton("First");
		JButton secondB = new JButton("Second");
		
		firstB.addActionListener(this);
		secondB.addActionListener(this);
		
		frame.add(firstB);
		frame.add(secondB);
		
		label = new JLabel("Press a Button");
		
		frame.add(label);
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("First")) label.setText("First B pressed");
		else label.setText("Second B Pressed");
		
	}
	
	

}
