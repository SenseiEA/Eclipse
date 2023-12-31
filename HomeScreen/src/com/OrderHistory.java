/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author GAMING PC
 */
public class OrderHistory extends javax.swing.JFrame {

    /**
     * Creates new form OrderHistory
     */
    public OrderHistory() {
        initComponents();
        try {
			setIconImage(ImageIO.read(new File("C:\\Eclipse\\HomeScreen\\src\\com\\Guoba.png")));
			
		}	
		catch(IOException e) {
			e.printStackTrace();
		}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonSignOut = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();
        jButtonHistory = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelOrder6 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabelOrder7 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabelOrder8 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabelOrder9 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setPreferredSize(new java.awt.Dimension(1100, 600));
        setSize(new java.awt.Dimension(1100, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSignOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSignOut.setText("Sign Out");
        jButtonSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignOutActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 130, 40));

        jButtonHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonHome.setText("Home");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 40));

        jButtonMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonMenu.setText(" Menu");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 90, 40));

        jButtonHistory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonHistory.setText("History");
        jButtonHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHistoryActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1080, 60));

        jPanel4.setBackground(new java.awt.Color(0, 204, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelOrder6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelOrder6.setText("Order 4");
        jPanel4.add(jLabelOrder6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 70, 30));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane8.setViewportView(jTextArea4);

        jPanel4.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 290, 150));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 310, 210));

        jPanel5.setBackground(new java.awt.Color(0, 204, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelOrder7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelOrder7.setText("Order 1");
        jPanel5.add(jLabelOrder7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 70, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane9.setViewportView(jTextArea1);

        jPanel5.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 290, 150));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 310, 210));

        jPanel6.setBackground(new java.awt.Color(0, 204, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelOrder8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelOrder8.setText("Order 2");
        jPanel6.add(jLabelOrder8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 70, 30));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane10.setViewportView(jTextArea2);

        jPanel6.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 290, 150));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 310, 210));

        jPanel7.setBackground(new java.awt.Color(0, 204, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelOrder9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelOrder9.setText("Order 3");
        jPanel7.add(jLabelOrder9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 70, 30));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane11.setViewportView(jTextArea3);

        jPanel7.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 290, 150));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 310, 210));

        jPanel2.setBackground(new java.awt.Color(255, 255, 216));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignOutActionPerformed
        JFrame exit = new JFrame("Exit");

        if(JOptionPane.showConfirmDialog(exit, "Do you want to exit out?", "Point of Sale",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        	LoginForm lgf=new LoginForm();
			lgf.setVisible(true);
			lgf.pack();
			lgf.setLocationRelativeTo(null);
			lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.dispose();
        }

    }//GEN-LAST:event_jButtonSignOutActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        HomeScreen hf=new HomeScreen();
            hf.setVisible(true);
            hf.pack();
            hf.setLocationRelativeTo(null);
            hf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
            
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        FoodMenu3 fm = new FoodMenu3();
        fm.setVisible(true);

        DrinkMenu dm = new DrinkMenu();
        dm.setVisible(true);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHistoryActionPerformed

    }//GEN-LAST:event_jButtonHistoryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderHistory().setVisible(true);
            }
        });
    }
    
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHistory;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonSignOut;
    private javax.swing.JLabel jLabelOrder6;
    private javax.swing.JLabel jLabelOrder7;
    private javax.swing.JLabel jLabelOrder8;
    private javax.swing.JLabel jLabelOrder9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables

public JTextArea getGUI(){
        return jTextArea1;
    }

public JTextArea getGUI2(){
        return jTextArea2;
    }

public JTextArea getGUI3(){
        return jTextArea3;
    }

public JTextArea getGUI4(){
        return jTextArea4;
    }

}

    
