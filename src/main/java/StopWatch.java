package main.java;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class StopWatch implements ActionListener {

	JLabel label;
	long start;
	
	StopWatch(){
	
		JFrame frame = new JFrame("Simple Stop Watch");
		frame.setLayout(new FlowLayout());
		frame.setSize(230,90);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton startB = new JButton("Start");
		JButton stopB = new JButton("Stop");
		
		startB.addActionListener(this);
		stopB.addActionListener(this);
		
		frame.add(startB);
		frame.add(stopB);
		
		label = new JLabel("Press start to begin timer.");
		
		frame.add(label);
		frame.setVisible(true);
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Calendar cal = Calendar.getInstance();
		if(e.getActionCommand().equals("Start")){
			start = cal.getTimeInMillis();
			label.setText("Stop watch is Running...");
		}
		else {
			label.setText("Elapsed time is... " +(double) (cal.getTimeInMillis()-start)/1000);
		}
		
	}
	
	

}
