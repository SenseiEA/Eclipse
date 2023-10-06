package com;
import java.util.*;

import javax.swing.JOptionPane;
public class UsingList1 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("oracle");
		list.add("oracle");
		list.add("java");
		list.add("Java");
		
		JOptionPane.showMessageDialog(null, "The elements are:\n"+list,"LIST EXAMPLE",1);
	}

}
