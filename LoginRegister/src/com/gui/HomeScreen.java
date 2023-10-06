package com.gui;
import javax.swing.JFrame;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

public class HomeScreen extends JFrame implements MouseListener{

	JButton btn1;
	JLabel lbl1,lbl2,lbl3,lbl4;
	
	public HomeScreen() {
		
		lbl1=new JLabel("FoodToBeUsed");
		lbl1.setBounds(200,200,300,75);
		lbl1.addMouseListener(this);
		lbl2=new JLabel("Description");
		lbl2.setBounds(200,200,100,75);
		lbl2.addMouseListener(this);
		btn1=new JButton();
		btn1.setBounds(100,100,100,100);
		
		add(btn1);add(lbl1);
		setLayout(null);
		setSize(1200,600);
		setVisible(true);
		setResizable(true);
		setLocationRelativeTo(null);
		
		
	}
	
	
	public static void main(String[] args) {
		HomeScreen hs=new HomeScreen();
		hs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==lbl1) {
			lbl1.setText(lbl2.getText());
		}
		if(e.getSource()==lbl2) {
			lbl2.setText(lbl1.getText());
		}
	
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
