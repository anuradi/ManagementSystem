/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RM;

import Main.MainWindow;
import javax.swing.JOptionPane;

/**
 *
 * @author Thilona
 */
public class AddRooms extends javax.swing.JFrame {

    /**
     * Creates new form AddRooms
     */
    
      private MainWindow mainWindow;

    public AddRooms(MainWindow mainWindow) {
        initComponents();;
        this.mainWindow = mainWindow;

    }
    
    public AddRooms() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rcapacity = new javax.swing.JTextField();
        lhall = new javax.swing.JRadioButton();
        lab = new javax.swing.JRadioButton();
        rname = new javax.swing.JTextField();
        bname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AR.setBackground(new java.awt.Color(255, 255, 255));
        AR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Building Name");
        AR.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLabel3.setText("Room Name");
        AR.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 66, -1));

        jLabel4.setText("Room Type");
        AR.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 66, -1));

        jLabel5.setText("Capacity");
        AR.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 66, -1));
        AR.add(rcapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 330, 40));

        lhall.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(lhall);
        lhall.setSelected(true);
        lhall.setText("Lecture Hall");
        AR.add(lhall, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        lab.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(lab);
        lab.setText("Laboratory");
        AR.add(lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));
        AR.add(rname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 330, 40));
        AR.add(bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 330, 40));

        jButton1.setBackground(java.awt.Color.red);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        AR.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 190, 40));

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        AR.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 190, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add Rooms Building Wise");
        AR.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 320, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Add_B.png"))); // NOI18N
        AR.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 490, 250));

        jButton3.setBackground(new java.awt.Color(0, 204, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("View");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        AR.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 190, 40));

        getContentPane().add(AR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clearFields();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try {
             if (bname.getText().isEmpty()) {
                 JOptionPane.showMessageDialog(rootPane, "Building name is empty");
             }else if (rname.getText().isEmpty()) {
                 JOptionPane.showMessageDialog(rootPane, "Room name is empty");
             }else if (rcapacity.getText().isEmpty()) {
                 JOptionPane.showMessageDialog(rootPane, "Capacity is empty");
             }else{
                 String building = bname.getText();
                 String room = rname.getText();
                 String capacity = rcapacity.getText();
                 String roomtype="";
                 if (lhall.isSelected()) {
                     roomtype="Lecture Hall";
                 }else{
                     roomtype="Laboratory";
                 }
                 DB.DB.iud("insert into building(name, room_name, type, capacity,status) values('"+building+"','"+room+"','"+roomtype+"','"+capacity+"', 'Active')");
                 JOptionPane.showMessageDialog(rootPane, "Succesfully inserted");
                 clearFields();
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ManageRooms mr = new ManageRooms();
        mr.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AddRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public final javax.swing.JPanel AR = new javax.swing.JPanel();
    private javax.swing.JTextField bname;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton lab;
    private javax.swing.JRadioButton lhall;
    private javax.swing.JTextField rcapacity;
    private javax.swing.JTextField rname;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        bname.setText("");
        rname.setText("");
        rcapacity.setText("");
        lhall.setSelected(true);
    }
}
