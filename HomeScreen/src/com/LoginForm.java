package com;

import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

public class LoginForm extends JFrame implements MouseListener,ActionListener{
	
	JPanel p;
	JLabel lblResto,lblUName,lblPW,lblLogo,lblBGImage;
	JTextField txtUName;
	JPasswordField txtPW;
	JButton btnLogin,btnSignUp;
	
	
	
	public LoginForm() {
		super("WanminDono!");
		setLayout(null);
		p=new JPanel();
		p.setBackground(Color.getHSBColor(0.45f, 1f, 0.60f));
		lblResto=new JLabel("WanminDono!");
		lblResto.setFont(new Font("FZShuTi", 1, 42));
		lblUName=new JLabel("Username or ID: ");
		lblUName.setFont(new Font("FZShuTi", 1, 24));
		lblPW=new JLabel("Password: ");
		lblPW.setFont(new Font("FZShuTi", 1, 24));
		txtUName=new JTextField(20);
		txtUName.setFont(new Font("FZShuTi", 1, 24));
		txtPW=new JPasswordField(15);
		btnLogin=new JButton("Login");
		btnLogin.setFont(new Font("FzShuTi", 1, 16));
		btnLogin.setBackground(Color.getHSBColor(224, 204, 20));
		btnLogin.setForeground(Color.getHSBColor(0,226,223));
		btnLogin.addActionListener(this);
		btnSignUp=new JButton("Sign Up");
		btnSignUp.setFont(new Font("FzShuTi", 1, 16));
		btnSignUp.setBackground(Color.getHSBColor(47,90,96));
		btnSignUp.setForeground(Color.getHSBColor(0,0,0));
		btnSignUp.addMouseListener(this);
		
		setIconImage("C:\\Eclipse\\HomeScreen\\src\\com");
			
	
		lblResto.setBounds(160, 115, 300, 100);
		lblUName.setBounds(160, 165, 300, 100);
		txtUName.setBounds(160, 240, 275, 25);
		lblPW.setBounds(160,240, 300, 100);
		txtPW.setBounds(160, 315, 275, 25);
		btnLogin.setBounds(160, 360, 100, 25);
		btnSignUp.setBounds(335, 360, 100, 25);
		p.setBounds(150,0,300,600);
		
		
		setContentPane("/com/LIyueBG.jpg");
		ImageIcon lblBGImage = new ImageIcon();
		JLabel BGImage = new JLabel(lblBGImage);
		
		
		ImageIcon imageLogo= new ImageIcon(getClass().getResource("WanminLogo.png"));
		JLabel WanminLogo=new JLabel(imageLogo);
		p.add(WanminLogo);
		add(BGImage);
		
		
		
		
		add(lblResto);add(lblUName);add(txtUName);add(lblPW);add(txtPW);add(btnLogin);add(btnSignUp);
		add(p);
		setSize(600,500);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}
	

	private void setIconImage(String string) {
		// TODO Auto-generated method stub
		
	}


	private void setContentPane(String string) {
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args) {
		LoginForm lf=new LoginForm();
		lf.setSize(600,500);
		lf.setLocationRelativeTo(null);
		lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==btnLogin) {
			try {
                    String loginAcc = System.getProperty("user.dir");
				    String fSeparator = System.getProperty("file.separator");
				    String path = loginAcc + fSeparator + "Accounts.csv";
                                    
				File myFile=new File(path);
				BufferedReader acc=new BufferedReader(new FileReader(myFile));
				String accounts = "";
				String userName=txtUName.getText();
				char[] pwf=txtPW.getPassword();
				String passwordField=new String(pwf);
				
				
				while((accounts =acc.readLine()) !=null) {
					String[] array = accounts.split(",");
					//System.out.println(array[0]);
					//System.out.println(array[1]);
					for(int i=0;i<array.length;i++) {
						if(userName.equals(array[i]) ) {
							String userInput=userName;
							for(int j=0;j<array.length;j++) {
								if(passwordField.equals(array[j])) {
									String passwordInput=passwordField;
									if(userInput.equals(userName) && passwordInput.equals(passwordField)) {
										HomeScreen hf=new HomeScreen();
										hf.setVisible(true);
										hf.pack();
										hf.setLocationRelativeTo(null);
										hf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
										this.dispose();
										return;
										}
									}
								}
							}
						else if(userName.isEmpty() && passwordField.isEmpty()) {
							JOptionPane.showMessageDialog(null, "Enter your Username or ID and Password First!", getTitle(), 0);
							txtUName.setText(null);
							txtPW.setText(null);
							return;
						}
							
						}

				txtUName.setText(null);
				txtPW.setText(null);
				
			}
			}catch(IOException err) {
				JOptionPane.showMessageDialog(null, "Create an account first!", getTitle(), 0);
			}
			catch(ArrayIndexOutOfBoundsException arrerr) {
				JOptionPane.showMessageDialog(null, "Create an account first!", getTitle(), 0);
			}
		
		
		}
	}
	



	@Override
	public void mouseClicked(MouseEvent me) {
		RegisterForm rgf=new RegisterForm();
		rgf.pack();
		rgf.setSize(600,500);
		rgf.setVisible(true);
		rgf.setLocationRelativeTo(null);
		rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
		
		
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
