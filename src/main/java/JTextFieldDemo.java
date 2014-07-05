package main.java;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JTextFieldDemo implements ActionListener{

	JTextField textfield;
	JLabel label;
	
	public JTextFieldDemo(){
		
		JFrame frame = new JFrame("A Simple TextField Example");
		frame.setLayout(new FlowLayout());
		frame.setSize(240,90);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textfield = new JTextField(10);
		
		textfield.addActionListener(this);
		
		frame.add(textfield);
		label = new JLabel("");
		frame.add(label);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		
		label.setText("Label now contains: "+ textfield.getText());
		textfield.setText("");  /// extra
	}
}
