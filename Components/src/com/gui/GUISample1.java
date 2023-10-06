package com.gui;

import java.awt.*;
import java.awt.event.*;

public class GUISample1 implements ActionListener{
	Frame f;
	Label lbl1,lbl2,lbl3;
	TextField txtFName,txtLName,txtFull;
	Button btnDisplay;

	public GUISample1() {
		f=new Frame("Testing GUI");
		f.setLayout(null);
		f.setSize(400,300);
		f.setVisible(true);
		lbl1=new Label("First name:");
		lbl2=new Label("Last name:");
		lbl3=new Label("Full name:");
		txtFName=new TextField();
		txtLName=new TextField();
		txtFull=new TextField();
		btnDisplay=new Button("Display");
		lbl1.setBounds(10, 40, 100, 30);
		lbl2.setBounds(10, 100, 100, 30);
		lbl3.setBounds(10, 160, 100, 30);
		txtFName.setBounds(120, 40, 100, 30);
		txtLName.setBounds(120, 100, 100, 30);
		txtFull.setBounds(120, 160, 100, 30);
		btnDisplay.setBounds(100, 200, 100, 30);
		f.add(lbl1);f.add(lbl2);f.add(lbl3);
		f.add(txtFName);f.add(txtLName);f.add(txtFull);
		f.add(btnDisplay);
		btnDisplay.addActionListener(this);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String firstName=txtFName.getText();
		String lastName=txtLName.getText();
		String fullName=firstName+" "+lastName;
		txtFull.setText(fullName);
		
	}
	public static void main(String[] args) {
		GUISample1 gui=new GUISample1();
		

	}
	

}
