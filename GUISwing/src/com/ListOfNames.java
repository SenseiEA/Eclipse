package com;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class ListOfNames extends JFrame implements ActionListener,
				ListSelectionListener{
	JList list;
	JScrollPane s;
	JButton btnAdd,btnRemove;
	JLabel lbl1;
	DefaultListModel listMod;
	String names[]= {"Xiangling","Yun Jin","Zhongli","Hu Tao","Xingqiu","Chongyun",
					"Xiao","Ganyu"};
	
	public ListOfNames() {
		super("Liyue Characters");
		setLayout(new FlowLayout());
		listMod=new DefaultListModel();
		for(int i=0;i<names.length;i++) {
			listMod.addElement(names[i]);
		}
		list=new JList(listMod);
		list.setVisibleRowCount(3);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		s=new JScrollPane(list);
		btnAdd=new JButton("ADD");
		btnRemove=new JButton("REMOVE");
		lbl1=new JLabel();
		list.addListSelectionListener(this);
		btnAdd.addActionListener(this);
		btnRemove.addActionListener(this);
		add(s);add(btnAdd);add(btnRemove);add(lbl1);
		
		
		setSize(400,300);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnAdd) {
			String n=JOptionPane.showInputDialog(null,"What character?");
			listMod.addElement(n);
			JOptionPane.showMessageDialog(null,"You successfully added: "+n);
		}
		else {
			if(list.getSelectedIndex()<0)
				JOptionPane.showMessageDialog(null,"Remove a character","Delete",
						JOptionPane.ERROR_MESSAGE);
			else {
				int r=JOptionPane.showConfirmDialog(null,"Are you sure you want to delete the character?");
				if(r==0)
				listMod.removeElementAt(list.getSelectedIndex());
		}
		}
		lbl1.setText("");
			
	}
	public void valueChanged(ListSelectionEvent le) {
		lbl1.setText(String.valueOf(list.getSelectedValue()));
	}
	public static void main(String[] args) {
		ListOfNames l=new ListOfNames();
	}
}
