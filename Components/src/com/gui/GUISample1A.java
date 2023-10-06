package com.gui;

import java.awt.*;
import java.awt.event.*;

public class GUISample1A implements ActionListener{
	Frame f;
	Label lbl1,lbl2,lbl3;
	TextField txt1stNum,txt2ndNum,txtSum;
	Button btnAdd,btnClear;

	public GUISample1A() {
		f=new Frame("Testing GUI");
		f.setLayout(null);
		f.setSize(400,300);
		f.setVisible(true);
		lbl1=new Label("1ST NUMBER:");
		lbl2=new Label("2ND NUMBER:");
		lbl3=new Label("SUM IS:");
		txt1stNum=new TextField();
		txt2ndNum=new TextField();
		txtSum=new TextField();
		btnAdd=new Button("ADD");
		btnClear=new Button("CLEAR");
		lbl1.setBounds(10, 40, 100, 30);
		lbl2.setBounds(10, 100, 100, 30);
		lbl3.setBounds(10, 160, 100, 30);
		txt1stNum.setBounds(120, 40, 100, 30);
		txt2ndNum.setBounds(120, 100, 100, 30);
		txtSum.setBounds(120, 160, 100, 30);
		btnAdd.setBounds(10, 200, 100, 30);
		btnClear.setBounds(120, 200, 100, 30);
		f.add(lbl1);f.add(lbl2);f.add(lbl3);
		f.add(txt1stNum);f.add(txt2ndNum);f.add(txtSum);
		f.add(btnAdd);f.add(btnClear);
		btnAdd.addActionListener(this);
		btnClear.addActionListener(this);
		txtSum.setEnabled(false);
		txtSum.setFont(new Font("Serif",Font.BOLD,20));
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd) {
			int x=Integer.parseInt(txt1stNum.getText());
			int y=Integer.parseInt(txt2ndNum.getText());
			int z=x+y;
			txtSum.setText(String.valueOf(z));
		}
		else if(e.getSource()==btnClear) {
			txt1stNum.setText("");
			txt2ndNum.setText("");
			txtSum.setText("");
		}
		
	}
	public static void main(String[] args) {
		GUISample1A gui=new GUISample1A();
		

	}
	

}
