package main.java;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class TwoTextFieldsDemo implements ActionListener {

	JTextField textField1;
	JTextField textField2;
	JLabel label;

	TwoTextFieldsDemo(){
	
		JFrame frame = new JFrame("Two Textfield Demo");
		frame.setLayout(new FlowLayout());
		frame.setSize(240,120);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField1 = new JTextField(10);
		textField2 = new JTextField(10);
		
		textField1.setActionCommand("One");
		textField2.setActionCommand("Two");
		
		textField1.addActionListener(this);
		textField2.addActionListener(this);
		
		frame.add(textField1);
		frame.add(textField2);
		
		label = new JLabel("");
		
		frame.add(label);
		frame.setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getActionCommand().equals("One")){
			label.setText("Entered text in first is " + textField1.getText());
			textField1.setText("");
		} else {
			label.setText("Entered text in 2nd is " + textField2.getText());
			textField2.setText("");
		}
	}	
}
