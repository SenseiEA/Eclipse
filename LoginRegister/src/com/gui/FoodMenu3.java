package com.gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
public class FoodMenu3 extends JFrame implements MouseListener{
 Map<String, ImageIcon> imageMap;

	public FoodMenu3() {
		String[] foodList = {"almondtofu","BlackBackPerchStew","CrabRoeTofu","JadeParcels","JewelrySoup","Jueyun","MoraMeat",
				"NoodleDelicacy","SquirrelFish"};
		
		imageMap = createImageMap(foodList);

		JList list = new JList(foodList);
		list.setCellRenderer(new FoodMenu3Renderer());
		JScrollPane scroll = new JScrollPane(list);
		scroll.setPreferredSize(new Dimension(500,600));
		JFrame frame = new JFrame();
		frame.add(scroll);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
  
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
			public void run() {
				new FoodMenu3();
			}
		});
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}