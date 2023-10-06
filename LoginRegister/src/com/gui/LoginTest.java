package com.gui;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LoginTest {
	
	
	public static void main(String[] args){
		try {
		String loginAcc = System.getProperty("java.class.path");
	    String fSeparator = System.getProperty("file.separator");
	    String path = loginAcc + fSeparator + "Accounts.csv";
	    System.out.println(path);
	    
	    BufferedWriter bw = new BufferedWriter(new FileWriter(path,true));
	    bw.write("");
	    bw.close();
	    
		}catch (IOException err) {
			err.printStackTrace();
		}

	}
	
}
