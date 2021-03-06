/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM;

import Main.MainWindow;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Thilona
 */
public class AddLecturer extends javax.swing.JFrame {

    /**
     * Creates new form AddLecturer
     */
    
      private MainWindow mainWindow;

  
    public AddLecturer(MainWindow mainWindow) {
        initComponents();
        loadFaculty();
        loadCampus();
        loadLevel();
        loadDepartment();
        loadBuilding();
       
        this.mainWindow = mainWindow;
        
    }
    
    public AddLecturer() {
       
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lrank = new javax.swing.JTextField();
        lbuilding = new javax.swing.JComboBox<>();
        ldep = new javax.swing.JComboBox<>();
        lempid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        llevel = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lcampus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lfaculty = new javax.swing.JComboBox<>();
        lecname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddLec.setBackground(new java.awt.Color(255, 255, 255));
        AddLec.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Lecturer Name");
        AddLec.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 186, -1, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Employee ID");
        AddLec.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 120, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Department");
        AddLec.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 120, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText(" Building");
        AddLec.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 110, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Rank");
        AddLec.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 100, 40));

        lrank.setFocusable(false);
        AddLec.add(lrank, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 330, 40));

        lbuilding.setEditable(true);
        lbuilding.setFocusable(false);
        AddLec.add(lbuilding, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 330, 40));

        ldep.setEditable(true);
        ldep.setFocusable(false);
        AddLec.add(ldep, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 330, 40));
        AddLec.add(lempid, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 330, 40));

        jButton2.setBackground(java.awt.Color.red);
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        AddLec.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, 190, 40));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Generate Rank");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        AddLec.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 190, 40));

        jButton3.setBackground(new java.awt.Color(0, 204, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Save");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        AddLec.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, 190, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Level");
        AddLec.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 50, 40));

        llevel.setEditable(true);
        llevel.setFocusable(false);
        AddLec.add(llevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 330, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Campus");
        AddLec.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 300, 70, 40));

        lcampus.setEditable(true);
        lcampus.setFocusable(false);
        AddLec.add(lcampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 330, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Faculty");
        AddLec.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 240, 60, 40));

        lfaculty.setEditable(true);
        lfaculty.setFocusable(false);
        AddLec.add(lfaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 330, 40));
        AddLec.add(lecname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 330, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add Lecturer");
        AddLec.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 180, -1));

        jButton7.setBackground(new java.awt.Color(0, 204, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("View");
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        AddLec.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 640, 190, 40));

        getContentPane().add(AddLec, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (lempid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Employee id is empty");
        } else {
            lrank.setText(llevel.getSelectedItem().toString() + "." + lempid.getText());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clearFields();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (lecname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Lecture name is empty");
            } else if (lempid.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Employee ID is empty");
            } else if (lfaculty.getSelectedItem().toString().equals("<-Select->")) {
                JOptionPane.showMessageDialog(rootPane, "Select the Faculty");
            } else if (lcampus.getSelectedItem().toString().equals("<-Select->")) {
                JOptionPane.showMessageDialog(rootPane, "Select the Campus");
            } else if (ldep.getSelectedItem().toString().equals("<-Select->")) {
                JOptionPane.showMessageDialog(rootPane, "Select the Department");
            } else if (lbuilding.getSelectedItem().toString().equals("<-Select->")) {
                JOptionPane.showMessageDialog(rootPane, "Select the Building");
            } else if (llevel.getSelectedItem().toString().equals("<-Select->")) {
                JOptionPane.showMessageDialog(rootPane, "Select the Level");
            } else {
                String faculty = lfaculty.getSelectedItem().toString();
                String campus = lcampus.getSelectedItem().toString();
                String department = ldep.getSelectedItem().toString();
                String building = lbuilding.getSelectedItem().toString();
                String facultyid = "";
                String campusid = "";
                String depid = "";
                String buildingid = "";
                ResultSet rs1 = DB.DB.search("select idfaculty from faculty where name='" + faculty + "'");
                if (rs1.first()) {
                    facultyid = rs1.getString(1);
                }
                ResultSet rs2 = DB.DB.search("select idcampus from campus where name='" + campus + "'");
                if (rs2.first()) {
                    campusid = rs2.getString(1);
                }
                ResultSet rs3 = DB.DB.search("select iddepartment from department where name='" + department + "'");
                if (rs3.first()) {
                    depid = rs3.getString(1);
                }

                ResultSet rs4 = DB.DB.search("select idbuilding from building where name='" + building + "'");
                if (rs4.first()) {
                    buildingid = rs4.getString(1);
                }
                DB.DB.iud("insert into lecturer (name, emp_id, rank, faculty_id, department_id, campus_id, building_id, level_id,status) values ('" + lecname.getText() + "','" + lempid.getText() + "','" + lrank.getText() + "','" + facultyid + "','" + depid + "','" + campusid + "','" + buildingid + "','" + llevel.getSelectedItem().toString() + "', 'Active')");
                JOptionPane.showMessageDialog(rootPane, "Successfully Saved");
                clearFields();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //View Button
        Managelecturers al = new Managelecturers();
        al.setVisible(true);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddLecturer().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public final javax.swing.JPanel AddLec = new javax.swing.JPanel();
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> lbuilding;
    private javax.swing.JComboBox<String> lcampus;
    private javax.swing.JComboBox<String> ldep;
    private javax.swing.JTextField lecname;
    private javax.swing.JTextField lempid;
    private javax.swing.JComboBox<String> lfaculty;
    private javax.swing.JComboBox<String> llevel;
    private javax.swing.JTextField lrank;
    // End of variables declaration//GEN-END:variables

    private void loadFaculty() {
        try {
            lfaculty.addItem("<-Select->");
            ResultSet rs = DB.DB.search("select distinct name from faculty");
            while (rs.next()) {
                lfaculty.addItem(rs.getString(1));
            }
        } catch (Exception e) {
        }
    }

    private void loadCampus() {
        try {
            lcampus.addItem("<-Select->");
            ResultSet rs = DB.DB.search("select distinct name from campus");
            while (rs.next()) {
                lcampus.addItem(rs.getString(1));
            }
        } catch (Exception e) {
        }
    }

    private void loadLevel() {
        try {
            llevel.addItem("<-Select->");
            ResultSet rs = DB.DB.search("select distinct level from level");
            while (rs.next()) {
                llevel.addItem(rs.getString(1));
            }
        } catch (Exception e) {
        }
    }

    private void loadDepartment() {
        try {
            ldep.addItem("<-Select->");
            ResultSet rs = DB.DB.search("select distinct name from department");
            while (rs.next()) {
                ldep.addItem(rs.getString(1));
            }
        } catch (Exception e) {
        }
    }

    private void loadBuilding() {
        try {
            lbuilding.addItem("<-Select->");
            ResultSet rs = DB.DB.search("select distinct name from building");
            while (rs.next()) {
                lbuilding.addItem(rs.getString(1));
            }
        } catch (Exception e) {
        }
    }

    private void clearFields() {
        lecname.setText("");
        lempid.setText("");
        lrank.setText("");
    }
}
