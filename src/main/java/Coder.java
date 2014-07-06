package main.java;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Coder implements ActionListener {
	
	JTextField plainText;
	JTextField codedText;
	
	Coder(){
		
		JFrame frame = new JFrame("A Simple Coder");
		frame.setLayout(new FlowLayout());
		frame.setSize(340,120);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel plainLabel = new JLabel(" Plain Text ");
		JLabel codeLabel = new JLabel(" Code Text ");
		
		plainText = new JTextField(20);
		codedText = new JTextField(20);
		
		plainText.setActionCommand("Encode");
		codedText.setActionCommand("Decode");
		plainText.addActionListener(this);
		codedText.addActionListener(this);
		
		frame.add(plainLabel);
		frame.add(plainText);
		frame.add(codeLabel);
		frame.add(codedText);
		
		JButton encodeB = new JButton("Encode");
		JButton decodeB = new JButton("Decode");
		JButton resetB = new JButton("Reset");
		
		encodeB.addActionListener(this);
		decodeB.addActionListener(this);
		resetB.addActionListener(this);
		
		frame.add(encodeB);
		frame.add(decodeB);
		frame.add(resetB);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Encode")){
			StringBuilder str = new StringBuilder(plainText.getText());
			
			for(int i=0; i < str.length();i++){
				str.setCharAt(i, (char)(str.charAt(i)+1));
			}
			
			codedText.setText(str.toString());
		}
		
		else if(e.getActionCommand().equals("Decode")){
			StringBuilder str = new StringBuilder(codedText.getText());
			
			for(int i=0; i < str.length();i++){
				str.setCharAt(i, (char)(str.charAt(i)-1));
			}
			
			plainText.setText(str.toString());
		}
		else {
			plainText.setText("");
			codedText.setText("");
		}
	}
	
	
	

}
