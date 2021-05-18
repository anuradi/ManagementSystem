/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thilona
 */
public class Session extends javax.swing.JFrame {

    /**
     * Creates new form ManageSession
     */
    public Session() {
        initComponents();
        loadTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        view = new javax.swing.JButton();
        addsession = new javax.swing.JButton();
        addsession1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Session");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 44, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lecturer", "Subject Code", "Subject Name", "Group ID", "Tag", "No Of Students", "Hours"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 79, 561, 320));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        view.setBackground(new java.awt.Color(204, 255, 204));
        view.setText("View");
        view.setBorderPainted(false);
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 130, 30));

        addsession.setBackground(new java.awt.Color(255, 255, 0));
        addsession.setText("Manage Session");
        addsession.setBorderPainted(false);
        addsession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsessionActionPerformed(evt);
            }
        });
        jPanel1.add(addsession, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 130, 30));

        addsession1.setBackground(new java.awt.Color(153, 204, 255));
        addsession1.setText("Add Session");
        addsession1.setBorderPainted(false);
        addsession1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsession1ActionPerformed(evt);
            }
        });
        jPanel1.add(addsession1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addsessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsessionActionPerformed
        ManageSession As = new ManageSession();
        As.setVisible(true);
    }//GEN-LAST:event_addsessionActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
       loadTableData();
    }//GEN-LAST:event_viewActionPerformed

    private void addsession1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsession1ActionPerformed
       AddSession as = new AddSession();
       as.setVisible(true);
    }//GEN-LAST:event_addsession1ActionPerformed

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
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Session().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addsession;
    private javax.swing.JButton addsession1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables

    private void loadTableData() {
        try {
            DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            ResultSet rs = DB.DB.search("select ls.idlecture_sessions,l.name,ls.subject_code,sg.groups_id,s.name,t.name,ls.std_count,ls.duration from lecture_sessions ls JOIN lecturer l on ls.lecturer_id=l.idlecturer JOIN subjects s on ls.subjects_id=s.idsubjects JOIN tags t on ls.tags_id=t.idtags JOIN student_groups sg on ls.group_id=sg.idstudent_groups");
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
