package com.gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUISample4 extends JFrame implements ActionListener{
	JLabel lbl1;
	JCheckBox chkSwim,chkWatch,chkOthers;
	JTextField txtOthers;
	JButton btnDisplay;
	String h="";
	
	public GUISample4() {
		super("Hobbies");
		setLayout(new GridLayout(6,1));
		lbl1=new JLabel("What are your Hobbies?");
		chkSwim=new JCheckBox("Swimming");
		chkWatch=new JCheckBox("Watching Movies");
		chkOthers=new JCheckBox("Others(Please Specify):");
		txtOthers=new JTextField();
		btnDisplay=new JButton("Display Answer");
		add(lbl1);
		add(chkSwim);add(chkWatch);add(chkOthers);
		add(txtOthers);add(btnDisplay);
		txtOthers.setEnabled(false);
		btnDisplay.addActionListener(this);
		chkOthers.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				txtOthers.setEnabled(true);

			}
		});
		setSize(300,350);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(chkSwim.isSelected())
			h+=chkSwim.getText()+"\n";
		if(chkWatch.isSelected())
			h+=chkWatch.getText()+"\n";	
		if(chkOthers.isSelected())
			h+=txtOthers.getText();
		if(h.equals(""))
				JOptionPane.showMessageDialog(null,"No selected hobbies!",
						"Hobbies",JOptionPane.ERROR_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"Your Hobbies are:\n"+h,
					"Hobbies",JOptionPane.PLAIN_MESSAGE);
		
		chkSwim.setSelected(false);
		chkWatch.setSelected(false);
		chkOthers.setSelected(false);
		txtOthers.setText("");
		txtOthers.setEnabled(false);
		h="";

	}
	
	public static void main(String[] args) {
		GUISample4 gui=new GUISample4();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
	}

}
