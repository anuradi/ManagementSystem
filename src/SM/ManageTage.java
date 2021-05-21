/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SM;

import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thilona
 */
public class ManageTage extends javax.swing.JFrame {

    private int xAxisMousePoint;
    private int yAxisMousePoint;

    /**
     * Creates new form ManageTage
     */
    public ManageTage() {
        initComponents();
        loadData();
    }
 protected void setMouseClickedLocation(int x, int y) {
        this.xAxisMousePoint = x;
        this.yAxisMousePoint = y;
    }
     protected void setWindowLocation(int x, int y) {
        this.setLocation(x - xAxisMousePoint, y - yAxisMousePoint);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        windowTopBar = new javax.swing.JPanel();
        btn_Exit1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        relatedtags = new javax.swing.JComboBox<>();
        tagcode = new javax.swing.JTextField();
        tagname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Subject Name", "Subject Code", "Related Tag"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 69, 542, 200));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clear.setBackground(java.awt.Color.red);
        clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.setBorderPainted(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 130, -1));

        delete.setBackground(java.awt.Color.red);
        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.setBorderPainted(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 130, -1));

        update.setBackground(new java.awt.Color(0, 153, 255));
        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.setBorderPainted(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 140, -1));

        windowTopBar.setBackground(new java.awt.Color(255, 255, 255));
        windowTopBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        windowTopBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                windowTopBarMouseDragged(evt);
            }
        });
        windowTopBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                windowTopBarMousePressed(evt);
            }
        });
        windowTopBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close_1.png"))); // NOI18N
        btn_Exit1.setBorder(null);
        btn_Exit1.setBorderPainted(false);
        btn_Exit1.setContentAreaFilled(false);
        btn_Exit1.setFocusPainted(false);
        btn_Exit1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close_2.png"))); // NOI18N
        btn_Exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Exit1ActionPerformed(evt);
            }
        });
        windowTopBar.add(btn_Exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 0, 34, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Manage Tags");
        windowTopBar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 7, -1, 20));

        jPanel1.add(windowTopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 30));

        jLabel2.setText("Tag Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        jLabel3.setText("Tag Code");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jLabel4.setText("Related Tags");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        relatedtags.setEditable(true);
        relatedtags.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<-Select->", "Lecture", "Tutorial", "Lab", "Evolution" }));
        relatedtags.setFocusable(false);
        jPanel1.add(relatedtags, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 266, -1));
        jPanel1.add(tagcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 266, -1));
        jPanel1.add(tagname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 266, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         int selectedRow = jTable1.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        tagname.setText(dtm.getValueAt(selectedRow, 1).toString());
        tagcode.setText(dtm.getValueAt(selectedRow, 2).toString());
        relatedtags.setSelectedItem(dtm.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clearFields();
    }//GEN-LAST:event_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(rootPane, "Please select a row");
        } else {
            try {
                DB.DB.iud("delete from tags where idtags='" + dtm.getValueAt(selectedRow, 0) + "'");
                JOptionPane.showMessageDialog(rootPane, "Deleted successfully");
                loadData();
            } catch (Exception ex) {
                Logger.getLogger(ManageSGroups.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Cannot delete this item");
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(rootPane, "Please select a row");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            try {
                DB.DB.iud("update tags set name='"+tagname.getText()+"', code='"+tagcode.getText()+"', related_tag='"+relatedtags.getSelectedItem().toString()+"' where idtags='"+dtm.getValueAt(selectedRow, 0)+"'");
                JOptionPane.showMessageDialog(rootPane, "Updated successfully");
                loadData();
            } catch (Exception ex) {
                Logger.getLogger(ManageSGroups.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void btn_Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Exit1ActionPerformed

        this.dispose();
    }//GEN-LAST:event_btn_Exit1ActionPerformed

    private void windowTopBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowTopBarMouseDragged
        this.setWindowLocation(evt.getXOnScreen(), evt.getYOnScreen());
    }//GEN-LAST:event_windowTopBarMouseDragged

    private void windowTopBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowTopBarMousePressed
        this.setMouseClickedLocation(evt.getX(), evt.getY());
    }//GEN-LAST:event_windowTopBarMousePressed

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
            java.util.logging.Logger.getLogger(ManageTage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageTage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageTage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageTage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageTage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Exit1;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> relatedtags;
    private javax.swing.JTextField tagcode;
    private javax.swing.JTextField tagname;
    private javax.swing.JButton update;
    private javax.swing.JPanel windowTopBar;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        try {
            ResultSet rs = DB.DB.search("select * from tags");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                dtm.addRow(v);
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageSGroups.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearFields() {
        tagname.setText("");
        tagcode.setText("");
        relatedtags.setSelectedIndex(0);
    }
}
