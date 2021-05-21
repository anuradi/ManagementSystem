/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM;

import Main.MainWindow;
import javax.swing.JOptionPane;

/**
 *
 * @author Thilona
 */
public class AddSubject extends javax.swing.JFrame {

    /**
     * Creates new form AddSubject
     */
    
      private MainWindow mainWindow;

  
    public AddSubject(MainWindow mainWindow) {
        initComponents();
        this.mainWindow = mainWindow;
        
    }
    public AddSubject() {
       
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sofferyear = new javax.swing.JComboBox<>();
        sname = new javax.swing.JTextField();
        scode = new javax.swing.JTextField();
        sfirstsem = new javax.swing.JRadioButton();
        ssecondsem = new javax.swing.JRadioButton();
        slech = new javax.swing.JSpinner();
        stutorialh = new javax.swing.JSpinner();
        slabh = new javax.swing.JSpinner();
        sevoh = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddSub.setBackground(new java.awt.Color(255, 255, 255));
        AddSub.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add Subject");
        AddSub.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Offered Year");
        AddSub.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 240, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Offered Semester");
        AddSub.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 150, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Subject Name");
        AddSub.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 230, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Subject Code");
        AddSub.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 230, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Number of Lecture Hours");
        AddSub.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 240, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Number of Tutorial Hours");
        AddSub.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 240, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Number of Lab Hours");
        AddSub.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 240, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Number of Ecolution Hours");
        AddSub.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 230, 40));

        sofferyear.setEditable(true);
        sofferyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st year", "2nd year", "3rd year", "4th year" }));
        sofferyear.setFocusable(false);
        AddSub.add(sofferyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 330, 40));
        AddSub.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 330, 40));
        AddSub.add(scode, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 330, 40));

        sfirstsem.setBackground(new java.awt.Color(255, 255, 255));
        sfirstsem.setSelected(true);
        sfirstsem.setText("First");
        AddSub.add(sfirstsem, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 90, 40));

        ssecondsem.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(ssecondsem);
        ssecondsem.setText("Second");
        AddSub.add(ssecondsem, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 90, 40));
        AddSub.add(slech, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 330, 40));
        AddSub.add(stutorialh, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 330, 40));
        AddSub.add(slabh, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 330, 40));
        AddSub.add(sevoh, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 330, 40));

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
        AddSub.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 190, 40));

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
        AddSub.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 640, 190, 40));

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
        AddSub.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, 190, 40));

        getContentPane().add(AddSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clearFields();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if (scode.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Subject code is empty");
            } else if (sname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Subject Name is empty");
            } else {
                String offeryear = sofferyear.getSelectedItem().toString();
                String semester = "";
                if (sfirstsem.isSelected()) {
                    semester = "First";
                } else {
                    semester = "Second";
                }
                String subject = sname.getText();
                String code = scode.getText();
                String lechours = slech.getValue().toString();
                String tutorialhours = stutorialh.getValue().toString();
                String labhours = slabh.getValue().toString();
                String evolutionhours = sevoh.getValue().toString();
                DB.DB.iud("insert into subjects ( name, code, semester, lecture_hours, lab_hours, totorial_hours, evolution_hours, year, status) values ('" + subject + "','" + code + "','" + semester + "','" + lechours + "','" + labhours + "','" + tutorialhours + "','" + evolutionhours + "','" + offeryear + "', 'Active' )");
                JOptionPane.showMessageDialog(rootPane, "Successfully saved");
                clearFields();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ManageSubject ms = new ManageSubject();
        ms.setVisible(true);
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
            java.util.logging.Logger.getLogger(AddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSubject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public final javax.swing.JPanel AddSub = new javax.swing.JPanel();
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField scode;
    private javax.swing.JSpinner sevoh;
    private javax.swing.JRadioButton sfirstsem;
    private javax.swing.JSpinner slabh;
    private javax.swing.JSpinner slech;
    private javax.swing.JTextField sname;
    private javax.swing.JComboBox<String> sofferyear;
    private javax.swing.JRadioButton ssecondsem;
    private javax.swing.JSpinner stutorialh;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        sname.setText("");
        scode.setText("");
        slech.setValue(0);
        stutorialh.setValue(0);
        slabh.setValue(0);
        sevoh.setValue(0);
    }
}
