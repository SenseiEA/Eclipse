package com;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UsingStack extends JFrame implements ActionListener{
	JTextArea ta;
	JButton btnPush,btnPeek,btnPop;
	Stack<Integer> stack=new Stack<>();
	
	public UsingStack() {
		super("Stack Examples");
		setLayout(new GridLayout(2,1));
		ta=new JTextArea();
		btnPush=new JButton("PUSH");
		btnPeek=new JButton("PEEK");
		btnPop=new JButton("POP");
		btnPush.addActionListener(this);
		btnPeek.addActionListener(this);
		btnPop.addActionListener(this);
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(1,3));
		p.add(btnPush);p.add(btnPeek);p.add(btnPop);
		add(ta);
		add(p);
		setSize(250,200);
		setVisible(true);
	}
	public void displayStack() {
		String all="";
		Iterator iter=stack.iterator();
		while(iter.hasNext()) {
			all += iter.next()+"\n";
		}
		ta.setText(all);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnPeek)
			try {
				JOptionPane.showMessageDialog(null, stack.peek());
			}
			catch(EmptyStackException ese) {
				JOptionPane.showMessageDialog(null, "Enter a number before peeking!", "ERROR",0);
			}
		if(e.getSource()==btnPush) {
			try {
				int element=Integer.parseInt(JOptionPane.showInputDialog("Enter element to add"));
					stack.push(element);
					displayStack();
			}
			catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Enter a number", "ERROR", 0);
			}
		}
		if(e.getSource()==btnPop) {
			try {
				int elem=stack.peek();
				int reply=JOptionPane.showConfirmDialog(
					null,"Are you sure you want to delete it?","DELETE",
					JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(reply==0)
				stack.pop();
				displayStack();
		}
			catch(EmptyStackException ese) {
				JOptionPane.showMessageDialog(null, "Stack is empty", "ERROR", 0);
			}
			
		}
	}
	
	public static void main(String[] args) {
		UsingStack us=new UsingStack();
		us.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
