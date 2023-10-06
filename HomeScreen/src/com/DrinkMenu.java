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


public class DrinkMenu extends JFrame {
	Map<String, ImageIcon> imageMap2;
	
	public DrinkMenu() {
		String[] drinkList = {"WolfHookJuice","RainbowAster","HouseBlendIcedTea","DangoMilk","BerryMintBurst","AppleCider"};
		
		imageMap2 = createImageMap(drinkList);
		JList list = new JList(drinkList);
		list.setCellRenderer(new DrinkMenuRenderer());
		
		JScrollPane scroll = new JScrollPane(list);
		scroll.setPreferredSize(new Dimension(500,600));
		add(scroll);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setLocation(800,100);
        setVisible(true);
        try {
			setIconImage(ImageIO.read(new File("C:\\Eclipse\\HomeScreen\\src\\com\\Guoba.png")));
			
		}	
		catch(IOException e) {
			e.printStackTrace();
		}
		}
	public class DrinkMenuRenderer extends DefaultListCellRenderer{
		Font font = new Font("helvitica", Font.BOLD, 24);
		public Component getListCellRendererComponent(
                JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

            JLabel label = (JLabel) super.getListCellRendererComponent(
                    list, value, index, isSelected, cellHasFocus);
            label.setIcon(imageMap2.get((String) value));
            label.setHorizontalTextPosition(JLabel.RIGHT);
            label.setFont(font);
            label.setBackground(Color.getHSBColor(0.45f, 1f, 0.60f));
            label.setForeground(Color.getHSBColor(0,226,223));
            return label;
	}
		
}
       Map<String, ImageIcon> createImageMap(String[] drinkList) {
		Map<String, ImageIcon>map2 = new HashMap<>();
		try {
			map2.put("WolfHookJuice", new ImageIcon(getClass().getResource("WolfHookJuice.jpg")));
			map2.put("RainbowAster", new ImageIcon(getClass().getResource("RainbowAster.jpg")));
			map2.put("HouseBlendIcedTea", new ImageIcon(getClass().getResource("HouseBlendIcedTea.jpg")));
			map2.put("DangoMilk", new ImageIcon(getClass().getResource("DangoMilk.jpg")));
			map2.put("BerryMintBurst", new ImageIcon(getClass().getResource("BerryMintBurst.jpg")));
			map2.put("AppleCider", new ImageIcon(getClass().getResource("AppleCider.jpg")));
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return map2;
		
	}
         public static void main(String[] args) {
	          SwingUtilities.invokeLater(new Runnable() {
                      @Override
		      public void run() {
			     new DrinkMenu();
		       }
	           });
               }
}
