package com;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.*;

public class FoodMenu3 extends JFrame{
 Map<String, ImageIcon> imageMap;

	public FoodMenu3() {
		String[] foodList = {"almondtofu","BlackBackPerchStew","CrabRoeTofu","JadeParcels","JewelrySoup","Jueyun","MoraMeat",
				"NoodleDelicacy","SquirrelFish"};
		
		imageMap = createImageMap(foodList);

		JList list = new JList(foodList);
		list.setCellRenderer(new FoodMenu3Renderer());
		JScrollPane scroll = new JScrollPane(list);
		scroll.setPreferredSize(new Dimension(500,600));
		add(scroll);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pack();
        setLocation(100, 100);
        setVisible(true);
        try {
			setIconImage(ImageIO.read(new File("C:\\Eclipse\\HomeScreen\\src\\com\\Guoba.png")));
			
		}	
		catch(IOException e) {
			e.printStackTrace();
		}
  
		}
	
	public class FoodMenu3Renderer extends DefaultListCellRenderer{
		Font font = new Font("helvitica", Font.BOLD, 24);
		
		 @Override
	        public Component getListCellRendererComponent(
	                JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

	            JLabel label = (JLabel) super.getListCellRendererComponent(
	                    list, value, index, isSelected, cellHasFocus);
	            label.setIcon(imageMap.get((String) value));
	            label.setHorizontalTextPosition(JLabel.RIGHT);
	            label.setFont(font);
	            label.setBackground(Color.getHSBColor(0.45f, 1f, 0.60f));
	            label.setForeground(Color.getHSBColor(0,226,223));
	            return label;
	}
	           
}

	 Map<String, ImageIcon> createImageMap(String[] foodList) {
		Map<String, ImageIcon>map = new HashMap<>();
		try {
			map.put("almondtofu" , new ImageIcon(getClass().getResource("almondtofu.jpg")));
			map.put("BlackBackPerchStew", new ImageIcon(getClass().getResource("BlackBackPerchStew.jpg")));
			map.put("CrabRoeTofu", new ImageIcon(getClass().getResource("CrabRoeTofu.jpg")));
			map.put("JadeParcels", new ImageIcon(getClass().getResource("JadeParcels.jpg")));
			map.put("JewelrySoup", new ImageIcon(getClass().getResource("JewelrySoup.jpg")));
			map.put("Jueyun", new ImageIcon(getClass().getResource("Jueyun.jpg")));
			map.put("MoraMeat", new ImageIcon(getClass().getResource("MoraMeat.jpg")));
			map.put("NoodleDelicacy", new ImageIcon(getClass().getResource("NoodleDelicacy.jpg")));
			map.put("SquirrelFish", new ImageIcon(getClass().getResource("SquirrelFish.jpg")));
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return map;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
                    @Override
			public void run() {
				new FoodMenu3();
			}
		});
	}

}


