package com;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class UsingList2 extends JFrame{
	JList l;
	DefaultListModel dlm;
	JScrollPane sp;
	
	public UsingList2() {
		super("LIST EXAMPLE");
		setLayout(new FlowLayout());
		ArrayList<String> list=new ArrayList<String>();
		list.add("Arvey");
		list.add("Noel");
		list.add("Ryan");
		list.add("Denise");
		list.add("Karl");
		list.add("Minette");
		list.add("Kevin");
		
		dlm=new DefaultListModel();
		dlm.addAll(list);
		l=new JList(dlm);
		l.setVisibleRowCount(6);
		l.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		sp=new JScrollPane(l);
		sp.setBounds(100,100,100,100);
		
		add(sp);
		setSize(600,400);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		UsingList2 us=new UsingList2();
		us.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
