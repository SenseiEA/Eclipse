package com;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class UsingSet2 extends JFrame {
	JComboBox cb;
	DefaultComboBoxModel<String> dcm;
	
	public UsingSet2() {
		super("LIST EXAMPLE");
		setLayout(new FlowLayout());
		HashSet<String> set=new HashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("grapes");
		set.add("orange");
		set.add("melon");
		set.add("mango");
		
		
		dcm=new DefaultComboBoxModel<>();
		dcm.addAll(set);
		cb=new JComboBox(dcm);
		
		
		add(cb);
		setLocationRelativeTo(null);
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		UsingSet2 us=new UsingSet2();
		us.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
