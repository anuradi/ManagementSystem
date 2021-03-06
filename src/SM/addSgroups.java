/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SM;

import Main.MainWindow;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Thilona
 */


public class addSgroups extends javax.swing.JFrame {
    private MainWindow mainWindow;

  
    public addSgroups(MainWindow mainWindow) {
        initComponents();
        this.mainWindow = mainWindow;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        generateid = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        save = new javax.swing.JButton();
        semester = new javax.swing.JTextField();
        programme = new javax.swing.JComboBox<>();
        groupno = new javax.swing.JComboBox<>();
        subgroupno = new javax.swing.JComboBox<>();
        groupid = new javax.swing.JTextField();
        subgroupid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Add_Sgroup.setBackground(new java.awt.Color(255, 255, 255));
        Add_Sgroup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Academic Year Semester");
        Add_Sgroup.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 200, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Programme");
        Add_Sgroup.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Group No");
        Add_Sgroup.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 170, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Sub Group No");
        Add_Sgroup.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 200, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Group ID");
        Add_Sgroup.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Sub Group ID");
        Add_Sgroup.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 200, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add Student Groups");
        Add_Sgroup.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 250, -1));

        generateid.setBackground(new java.awt.Color(0, 153, 255));
        generateid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        generateid.setForeground(new java.awt.Color(255, 255, 255));
        generateid.setText("Generate IDs");
        generateid.setBorderPainted(false);
        generateid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateidActionPerformed(evt);
            }
        });
        Add_Sgroup.add(generateid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 190, 40));

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
        Add_Sgroup.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 620, 190, 40));

        save.setBackground(new java.awt.Color(0, 204, 255));
        save.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.setBorderPainted(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        Add_Sgroup.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 190, 40));
        Add_Sgroup.add(semester, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 330, 40));

        programme.setEditable(true);
        programme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<-Select->", "IT", "CS" }));
        programme.setFocusable(false);
        programme.setOpaque(false);
        programme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programmeActionPerformed(evt);
            }
        });
        Add_Sgroup.add(programme, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 330, 40));

        groupno.setEditable(true);
        groupno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<-Select->", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        groupno.setFocusable(false);
        Add_Sgroup.add(groupno, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 330, 40));

        subgroupno.setEditable(true);
        subgroupno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<-Select->", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        subgroupno.setFocusable(false);
        subgroupno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subgroupnoActionPerformed(evt);
            }
        });
        Add_Sgroup.add(subgroupno, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 330, 40));

        groupid.setEditable(false);
        Add_Sgroup.add(groupid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 330, 40));

        subgroupid.setEditable(false);
        Add_Sgroup.add(subgroupid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 330, 40));

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Add_Sgroup.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 620, 190, 40));

        getContentPane().add(Add_Sgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void programmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programmeActionPerformed

    private void subgroupnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subgroupnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subgroupnoActionPerformed

    private void generateidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateidActionPerformed
        if (semester.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Semester is empty");
        } else if (programme.getSelectedItem().toString().equals("<-Select->")) {
            JOptionPane.showMessageDialog(rootPane, "please select a program");
        } else if (groupno.getSelectedItem().toString().equals("<-Select->")) {
            JOptionPane.showMessageDialog(rootPane, "please select a group no");
        } else if (subgroupno.getSelectedItem().toString().equals("<-Select->")) {
            JOptionPane.showMessageDialog(rootPane, "please select a sub group no");
        } else {
            String semest = semester.getText();
            String program = programme.getSelectedItem().toString();
            String group = groupno.getSelectedItem().toString();
            String subgroup = subgroupno.getSelectedItem().toString();
            String groupid = semest + "." + program + "." + group;
            String subgroupid = semest + "." + program + "." + subgroup;
            this.groupid.setText(groupid);
            this.subgroupid.setText(subgroupid);
        }
    }//GEN-LAST:event_generateidActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clearFields();
    }//GEN-LAST:event_clearActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String semest = semester.getText();
        String program = programme.getSelectedItem().toString();
        String group = groupno.getSelectedItem().toString();
        String subgroup = subgroupno.getSelectedItem().toString();
        String groupid = this.groupid.getText();
        String subgroupid = this.subgroupid.getText();
        if (semest.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Semester is empty");
        } else if (program.equals("<-Select->")) {
            JOptionPane.showMessageDialog(rootPane, "Please select a program");
        } else if (group.equals("<-Select->")) {
            JOptionPane.showMessageDialog(rootPane, "Please select a group no");
        } else if (subgroup.equals("<-Select->")) {
            JOptionPane.showMessageDialog(rootPane, "Please select a sub group no");
        } else if (groupid.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please generate group id");
        } else if (subgroupid.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please generate sub group id");
        } else {
            try {
                DB.DB.iud("insert into student_groups (semester, program, groupno, subgroupno, groups_id, sub_groups_id,status)values ('" + semest + "','" + program + "','" + group + "','" + subgroup + "','" + groupid + "','" + subgroupid + "','Active')");
                JOptionPane.showMessageDialog(rootPane, "Successfully inserted");
                clearFields();
            } catch (Exception ex) {
                Logger.getLogger(addSgroups.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ManageSGroups mg = new ManageSGroups();
        mg.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // * @param args the command line arguments
   //  */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(addSgroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(addSgroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(addSgroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(addSgroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//              //  new addSgroups().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public final javax.swing.JPanel Add_Sgroup = new javax.swing.JPanel();
    private javax.swing.JButton clear;
    private javax.swing.JButton generateid;
    private javax.swing.JTextField groupid;
    private javax.swing.JComboBox<String> groupno;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> programme;
    private javax.swing.JButton save;
    private javax.swing.JTextField semester;
    private javax.swing.JTextField subgroupid;
    private javax.swing.JComboBox<String> subgroupno;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        semester.setText("");
        programme.setSelectedIndex(0);
        groupno.setSelectedIndex(0);
        subgroupno.setSelectedIndex(0);
        groupid.setText("");
        subgroupid.setText("");
    }
}
