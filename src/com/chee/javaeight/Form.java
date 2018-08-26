package com.chee.javaeight;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {

	JFrame frame;
	JPanel panel;
	
	JLabel nameLabel;
	JLabel ageLabel;
	JLabel nricLabel;
	JLabel addressLabel;
	JLabel handphoneLabel;

	JTextField nameText;
	JTextField ageText;
	JTextField nricText;
	JTextField addressText;
	JTextField handphoneText;
	
	JButton submitButton;
	JButton cancelButton;
	
	public Form() {
		frame = new JFrame("Form");
		panel = new JPanel();
		panel.setLayout(new GridLayout(6, 2));
		
		nameLabel = new JLabel("Name");
		ageLabel = new JLabel("Age");
		nricLabel = new JLabel("NRIC");
		addressLabel = new JLabel("Address");
		handphoneLabel = new JLabel("Handphone Number");
		
		nameText = new JTextField();
		ageText = new JTextField();
		nricText = new JTextField();
		addressText = new JTextField();
		handphoneText = new JTextField();
		
		submitButton = new JButton("Submit");
		cancelButton = new JButton("Cancel");
	}
	
	public void init() {
		//This is an example of creating an annonymous class. Especially useful in GUI making
		submitButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
			
		});
		
		cancelButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
			
		});
		panel.add(nameLabel);
		panel.add(nameText);
		panel.add(ageLabel);
		panel.add(ageText);
		panel.add(nricLabel);
		panel.add(nricText);
		panel.add(addressLabel);
		panel.add(addressText);
		panel.add(handphoneLabel);
		panel.add(handphoneText);
		
		panel.add(submitButton);
		panel.add(cancelButton);
		
		frame.getContentPane().add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Form f = new Form();
		f.init();
	}
}
