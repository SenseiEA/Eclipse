package com.gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUISample3 extends JFrame implements ItemListener{
	JLabel lbl1;
	JRadioButton rbMale,rbFemale;
	JTextField txtGender;
	ButtonGroup bg;
	
	public GUISample3() {
		super("Using JRadioButton");
		setLayout(new GridLayout(4,1));
		lbl1=new JLabel("Gender:");
		rbMale=new JRadioButton("Male",false);
		rbFemale=new JRadioButton("Female",false);
		bg=new ButtonGroup();
		bg.add(rbMale);bg.add(rbFemale);
		txtGender=new JTextField();
		
		
		add(lbl1);add(rbMale);add(rbFemale);add(txtGender);
		rbMale.addItemListener(this);
		rbFemale.addItemListener(this);
		setSize(250,250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		GUISample3 gui=new GUISample3();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getItemSelectable()==rbMale)
			txtGender.setText("Sigma Spotted");
		else if(e.getItemSelectable()==rbFemale)
			txtGender.setText("Opinion Rejected!");
		
	}

}
