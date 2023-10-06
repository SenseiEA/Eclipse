//1st Part (Nathan)

package com;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;


public class TestCompute extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	JFrame f;
	JLabel nameLabel, natureLabel, posLabel, hoursLabel;
	JComboBox<String> natComboBox, posComboBox;
	JTextField nameTextField, hoursTextField;
	JButton submit;
	
	String[] natOptions = {"Field", "Office"};
    String[] posOptions = {"Manager", "Supervisor", "Employee"};

    String name;
    String natureWork;
    String position;
    int hoursWorked;
    int rate;
    int allowance;
    int grossPay;
    
    boolean nameAccept = false;
    boolean hoursAccept = false;
    
    public TestCompute() {
    	f = new JFrame("GUI");
		f.setLayout(new FlowLayout());
		this.setResizable(false);
		
		nameLabel = new JLabel("Name:");
		natureLabel = new JLabel("Nature of Work: ");
		posLabel = new JLabel("Position: ");
		hoursLabel = new JLabel("Number of Hours Worked: ");
		
		natComboBox = new JComboBox<String>(natOptions);
		posComboBox = new JComboBox<String>(posOptions);
		
		nameTextField = new JTextField(25);
		hoursTextField = new JTextField(15);
		
		submit = new JButton("Submit");
		
		f.add(nameLabel);
		f.add(nameTextField);
		
		f.add(natureLabel);
		f.add(natComboBox);
		
		f.add(posLabel);
		f.add(posComboBox);
		
		f.add(hoursLabel);
		f.add(hoursTextField);
		
		f.add(submit);
		
		submit.addActionListener(this);
		
		f.setSize(350, 250);
		f.setVisible(true);
    }
    
// 2nd Part + classes if needed (Noel)
    
    public void actionPerformed(ActionEvent e) { 
            	if (nameTextField.getText().length() != 0) {
                name = nameTextField.getText();
                nameAccept = true;
            } else {
                JOptionPane.showMessageDialog(null, "The Name box is blank!", "Error",
                        JOptionPane.WARNING_MESSAGE);
                nameAccept = false;
            }

            natureWork = natComboBox.getSelectedItem().toString();

            if (natureWork == "Field") {
                allowance = 1000;
            } else {
                allowance = 0;
            }

            String hours = hoursTextField.getText();

            try {
                hoursWorked = Integer.parseInt(hours);
                hoursAccept = true;
            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(null, "The Hours box is blank!", "error",
                        JOptionPane.WARNING_MESSAGE);
                hoursAccept = false;
            }
            
            position = posComboBox.getSelectedItem().toString();
            
            if (position == "Manager") {
            	Manager manager = new Manager();
            	rate = 1000;
                manager.setName(name);
                manager.setHoursWorked(hoursWorked);
                manager.setRate(1000);
                grossPay = manager.grossPay();
                grossPay = grossPay + allowance;
                System.out.println(manager.showDetails() 
                		+ "\nNature of work: " + natureWork 
                		+ "\nPosition: " + position 
                		+ "\nAllowance: " + allowance 
                		+ "\nGross Pay: " + grossPay + "\n");
                
            } else if (position == "Supervisor") {
            	Supervisor supervisor = new Supervisor();
            	rate = 700;
                supervisor.setName(name);
                supervisor.setHoursWorked(hoursWorked);
                supervisor.setRate(700);
                grossPay = supervisor.grossPay();
                grossPay = grossPay + allowance;
                System.out.println(supervisor.showDetails() 
                		+ "\nNature of work: " + natureWork 
                		+ "\nPosition: " + position 
                		+ "\nAllowance: " + allowance 
                		+ "\nGross Pay: " + grossPay + "\n");
                
            } else if (position == "Employee") {
            	Employee employee = new Employee();
            
           
            	rate = 300;
                employee.setName(name);
                employee.setHoursWorked(hoursWorked);
                employee.setRate(300);
                grossPay = employee.grossPay();
                grossPay = grossPay + allowance;
                System.out.println(employee.showDetails() 
                		+ "\nNature of work: " + natureWork 
                		+ "\nPosition: " + position 
                		+ "\nAllowance: " + allowance 
                		+ "\nGross Pay: " + grossPay + "\n");
            }

// 3nd Part + running the GUI (Sean)        
            
    	if (nameAccept && hoursAccept) {
            try {
            	String uHome = System.getProperty("user.home");
                String fSeparator = System.getProperty("file.separator");
                String path = uHome + fSeparator + "lab4.csv";
                System.out.println(path);
                
                BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
                bw.write("Name: " + name);
                bw.write("\nNature of work: " + natureWork);
                bw.write("\nPosition: " + position);
                bw.write("\nRate: " + rate);
                bw.write("\nNumber of hours worked: " + hoursWorked);
                bw.write("\nAllowance: " + allowance);
                bw.write("\nGross Pay: " + grossPay + "\n");
                bw.close();
            } catch (IOException err) {
                err.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
    	TestCompute a = new TestCompute();
    	
    }
}