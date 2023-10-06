package com;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FoodComboBox extends JFrame implements ItemListener{
	JComboBox cb;
	JLabel lbl1,lbl2;
	String names[]= {"Choose your meal!","Wanmin Specialty",
			"Bountiful Year","Matsutake Meal Rolls","Mora Meat","Crystal Shrimp",
			"Grilled Tiger Fish","Jueyun Chili Chicken","Jueyun Guoba","Qingce Stir Fry",
			"Noodles with Mountain Delicacies","Squirrel Fish","Zhongyuan Chop Suey"};
	
	
	
	public FoodComboBox() {
		super("Wanmin Resto ComboBox");
		setLayout(new FlowLayout());
		cb=new JComboBox(names);
		lbl1=new JLabel();
		lbl2=new JLabel();
		add(cb);add(lbl1);add(lbl2);
		cb.addItemListener(this);
		setSize(450,300);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie) {
		lbl1.setText(String.valueOf(cb.getSelectedItem()));
		Icon icon=new ImageIcon(cb.getSelectedItem()+".jpg");
		lbl2.setIcon(icon);
	}
	
	public static void main(String[] args) {
		FoodComboBox f=new FoodComboBox();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
