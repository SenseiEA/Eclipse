package com;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class UsingSet1 extends JFrame{
	JTextArea ta;
	
	
	
	public UsingSet1() {
		super("SET EXAMPLE");
		setLayout(new FlowLayout());
		Set set=new HashSet();
		set.add("oracle");
		set.add("oracle");
		set.add("java");
		set.add("Java");
		
		String elements="";
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			elements += iter.next()+"\n";
		}
		
			
		ta=new JTextArea();
		ta.setText(elements);
		
		
		add(ta);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		UsingSet1 us=new UsingSet1();
		us.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
