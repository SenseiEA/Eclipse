package com.gui;
import java.awt.*;
import java.awt.event.*;
public class GUISample2 implements ItemListener{
	Frame f;
	Label lbl1,lbl2,lbl3;
	TextField txt1stNum,txt2ndNum,txtResult;
	Checkbox chkAdd,chkSub,chkMul,chkDiv;
	CheckboxGroup cbg;
	
	public GUISample2() {
		f=new Frame("Simple Calculator");
		f.setLayout(new FlowLayout());
		f.setSize(350,250);
		f.setVisible(true);
		lbl1=new Label("1st number:");
		lbl2=new Label("2nd number:");
		lbl3=new Label("Result is:");
		txt1stNum=new TextField(25);
		txt2ndNum=new TextField(25);
		txtResult=new TextField(25);
		cbg=new CheckboxGroup();
		chkAdd=new Checkbox("Add",cbg,false);
		chkSub=new Checkbox("Subtract",cbg,false);
		chkMul=new Checkbox("Multiply",cbg,false);
		chkDiv=new Checkbox("Divide",cbg,false);
		chkAdd.addItemListener(this);
		chkSub.addItemListener(this);
		chkMul.addItemListener(this);
		chkDiv.addItemListener(this);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.add(lbl1);f.add(txt1stNum);f.add(lbl2);f.add(txt2ndNum);
		f.add(lbl3);f.add(txtResult);
		f.add(chkAdd);f.add(chkSub);f.add(chkMul);f.add(chkDiv);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int x=Integer.parseInt(txt1stNum.getText());
		int y=Integer.parseInt(txt2ndNum.getText());
		int z=0;
		if(e.getItemSelectable()==chkAdd)
			z=x+y;
		if(e.getItemSelectable()==chkSub)
			z=x-y;
		if(e.getItemSelectable()==chkMul)
			z=x*y;
		if(e.getItemSelectable()==chkDiv)		
			z=x/y;
		txtResult.setText(String.valueOf(z));
	}
	
	public static void main(String[] args) {
		GUISample2 gui=new GUISample2();
		

	}



}
