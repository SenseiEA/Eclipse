package com.gui;
import javax.swing.JFrame;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

public class RegisterForm extends JFrame implements MouseListener, ActionListener{
	
	JPanel p;
	JLabel lblResto,lblUName,lblPW,lblLogo,lblBGImage,lblRegisterHere;
	JTextField txtUName;
	JPasswordField txtPW;
	JButton btnLogin,btnCreate;
	
	
	
	public RegisterForm() {
		super("WanminDono!");
		setLayout(null);
		p=new JPanel();
		p.setBackground(Color.getHSBColor(0,226,223));
		lblResto=new JLabel("WanminDono!");
		lblResto.setFont(new Font("FZShuTi", 1, 42));
		lblRegisterHere=new JLabel("Register your Account: ");
		lblRegisterHere.setFont(new Font("FZShuTi", 1, 24));
		lblUName=new JLabel("Username or ID: ");
		lblUName.setFont(new Font("FZShuTi", 1, 24));
		lblPW=new JLabel("Password: ");
		lblPW.setFont(new Font("FZShuTi", 1, 24));
		txtUName=new JTextField(20);
		txtUName.setFont(new Font("FZShuTi", 1, 24));
		txtUName.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtPW=new JPasswordField(15);
		txtPW.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		btnLogin=new JButton("Login");
		btnLogin.setFont(new Font("FzShuTi", 1, 16));
		btnLogin.setBackground(Color.getHSBColor(224, 204, 20));
		btnLogin.setForeground(Color.getHSBColor(0,226,223));
		btnLogin.addMouseListener(this);
		btnCreate=new JButton("Create");
		btnCreate.setFont(new Font("FzShuTi", 1, 16));
		btnCreate.setBackground(Color.getHSBColor(47,90,96));
		btnCreate.setForeground(Color.getHSBColor(0,0,0));
		btnCreate.addActionListener(this);
		
		try {
			setIconImage(ImageIO.read(new File("Guoba.png")));
			
		}	
		catch(IOException e) {
			e.printStackTrace();
		}
		lblResto.setBounds(160, 115, 300, 100);
		lblRegisterHere.setBounds(160, 160, 300, 100);
		lblUName.setBounds(160, 200, 300, 100);
		txtUName.setBounds(160, 275, 275, 25);
		lblPW.setBounds(160,275, 300, 100);
		txtPW.setBounds(160, 350, 275, 25);
		btnLogin.setBounds(160, 395, 100, 25);
		btnCreate.setBounds(335, 395, 100, 25);
		p.setBounds(150,0,300,600);
		
		
		
		setContentPane(new JLabel(new ImageIcon("LiyueBG.jpg")));
		lblBGImage=new JLabel();
		
		
		ImageIcon imageLogo=new ImageIcon("WanminLogo.png");
		JLabel WanminLogo=new JLabel(imageLogo);
		p.add(WanminLogo);
		
		add(lblBGImage);
		
		
		
		
		add(lblResto);add(lblRegisterHere);add(lblUName);add(txtUName);add(lblPW);add(txtPW);add(btnLogin);add(btnCreate);
		add(p);
		setSize(600,500);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		RegisterForm rf=new RegisterForm();
		rf.pack();
		rf.getDefaultCloseOperation();
		
		

	}
		
	


	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnCreate) {
			
			
			if(txtUName.getText().length() != 0 && txtPW.getPassword().length != 0){
				String userName=txtUName.getText();
				char[] pwf= txtPW.getPassword();
				String passwordField=new String(pwf);
				
				
				try {
					String loginAcc = System.getProperty("java.class.path");
				    String fSeparator = System.getProperty("file.separator");
				    String path = loginAcc + fSeparator + "Accounts.csv";
				    System.out.println(path);
				    
				    BufferedWriter bw = new BufferedWriter(new FileWriter(path,true));
				    bw.write(userName + "," + passwordField + "\n");
				    bw.close();
				    JOptionPane.showMessageDialog(null, "Account has been created", getTitle(), 1);
					}catch (IOException err) {
						err.printStackTrace();
						JOptionPane.showMessageDialog(null, "Do not create while opening the CSV File!", getTitle(), 0);
					}
					
				
				
				
				txtUName.setText(null);
				txtPW.setText(null);
				
			}
			else{
				if(txtUName.getText().length() == 0 && txtPW.getPassword().length == 0) {
					JOptionPane.showMessageDialog(null, "Enter your Username or ID and Password First!", getTitle(), 0);
				}
				else if(txtUName.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "Enter your Username or ID!", getTitle(), 0);
				}
				else if(txtPW.getPassword().length == 0) {
					JOptionPane.showMessageDialog(null, "Enter your Password!", getTitle(), 0);
				}
			}
								
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		if(me.getSource()==btnLogin) {	
			LoginForm lgf=new LoginForm();
			lgf.setVisible(true);
			lgf.pack();
			lgf.setLocationRelativeTo(null);
			lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.dispose();
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







