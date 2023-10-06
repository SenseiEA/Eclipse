package com.gui;

import javax.swing.JFrame;

public class WanminDono {

	public static void main(String[] args) {
		LoginForm lgf=new LoginForm();
		lgf.setVisible(true);
		lgf.pack();
		lgf.setLocationRelativeTo(null);
		lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
