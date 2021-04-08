/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nisal
 */
public class WorkingDaysHours extends javax.swing.JFrame {

    /**
     * Creates new form WorkingDaysHours
     */
    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;
    
    public WorkingDaysHours() {
        initComponents();
        DBconnection.getConnection();
        loadID();
        
    }
    public void loadID(){
             try {
            con = (Connection) DBconnection.getConnection();
            stmt = con.createStatement();
            String sql = "SELECT  workingdays.workingDaysID  FROM management_system.workingdays";
            rs = stmt.executeQuery(sql);
//            jSelectID.removeAllItems();
            while (rs.next()) {
              
                jSelectID.addItem(rs.getString(1));
            }
        } catch (SQLException e) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jWorkingDay = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTuesday = new javax.swing.JCheckBox();
        jMonday = new javax.swing.JCheckBox();
        jWendnesday = new javax.swing.JCheckBox();
        jThursday = new javax.swing.JCheckBox();
        jFriday = new javax.swing.JCheckBox();
        jSatureday = new javax.swing.JCheckBox();
        jSunday = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jHours = new javax.swing.JComboBox<>();
        jMinutes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jAddbtn = new javax.swing.JButton();
        jUpdatebtn = new javax.swing.JButton();
        jResetbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSelectID = new javax.swing.JComboBox<>();
        jSearchbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Add Working Days & Hours");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 11, 295, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Numbers of Working Days");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jWorkingDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        jWorkingDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWorkingDayActionPerformed(evt);
            }
        });
        getContentPane().add(jWorkingDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 69, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText(" Working Days");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        jTuesday.setText("Tuesday");
        getContentPane().add(jTuesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 193, 81, -1));

        jMonday.setText("Monday");
        jMonday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMondayActionPerformed(evt);
            }
        });
        getContentPane().add(jMonday, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 138, 81, -1));

        jWendnesday.setText("Wendnesday");
        getContentPane().add(jWendnesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 248, 100, -1));

        jThursday.setText("Thursday");
        getContentPane().add(jThursday, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 309, 81, -1));

        jFriday.setText("Friday");
        getContentPane().add(jFriday, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 363, 81, -1));

        jSatureday.setText("Satureday");
        jSatureday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaturedayActionPerformed(evt);
            }
        });
        getContentPane().add(jSatureday, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 138, 81, -1));

        jSunday.setText("Sunday");
        getContentPane().add(jSunday, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 193, 81, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Working Time per Day");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, 20));

        jHours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(jHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 80, -1));

        jMinutes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        getContentPane().add(jMinutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 80, -1));

        jLabel5.setText("Hours");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, 19));

        jLabel6.setText("Minutes");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, -1, -1));

        jAddbtn.setBackground(new java.awt.Color(0, 153, 255));
        jAddbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jAddbtn.setForeground(new java.awt.Color(255, 255, 255));
        jAddbtn.setText("ADD");
        jAddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddbtnActionPerformed(evt);
            }
        });
        getContentPane().add(jAddbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 73, -1));

        jUpdatebtn.setBackground(new java.awt.Color(51, 51, 51));
        jUpdatebtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jUpdatebtn.setForeground(new java.awt.Color(255, 255, 255));
        jUpdatebtn.setText("Update");
        jUpdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(jUpdatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 73, -1));

        jResetbtn.setBackground(new java.awt.Color(204, 0, 51));
        jResetbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jResetbtn.setForeground(new java.awt.Color(255, 255, 255));
        jResetbtn.setText("Reset");
        jResetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(jResetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 73, -1));

        jLabel7.setText("ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 252, 26, -1));

        jSelectID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectIDActionPerformed(evt);
            }
        });
        getContentPane().add(jSelectID, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 249, 88, -1));

        jSearchbtn.setText("Search");
        jSearchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(jSearchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMondayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMondayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMondayActionPerformed

    private void jSaturedayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaturedayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSaturedayActionPerformed

    private void jAddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddbtnActionPerformed
        
      
        String noWorkingDays = (String)jWorkingDay.getSelectedItem(); 
        int monday = 0;
        int tuesday  = 0;
        int wednesday = 0;
        int thursday = 0;
        int friday = 0;
        int saturday = 0;
        int sunday = 0;
        if(jMonday.isSelected()){
            monday = 1;
        }
         if(jTuesday.isSelected()){
            tuesday = 1;
        } 
         if(jWendnesday.isSelected()){
            wednesday = 1;
        }
          if(jThursday.isSelected()){
            thursday = 1;
        }
           if(jFriday.isSelected()){
            friday = 1;
        }
            if(jSatureday.isSelected()){
            saturday = 1;
        }
             if(jSunday.isSelected()){
            sunday = 1;
        }
        String hours = (String)jHours.getSelectedItem(); 
        String minutes = (String)jMinutes.getSelectedItem();
        try{
              con = (Connection) DBconnection.getConnection();
              stmt = con.createStatement();
              String sql = "INSERT INTO management_system.workingdays(NoDays,monday,tuesday,wendnesday,thursday,friday,satureday,sunday,hour,minute) VALUES ('"+noWorkingDays+"','"+monday+"','"+tuesday+"','"+wednesday+"','"+thursday+"','"+friday+"','"+saturday+"','"+sunday+"','"+hours+"','"+minutes+"')";
              stmt.executeUpdate(sql);
              JOptionPane.showMessageDialog(null, "Successfully Inserted");
              setVisible(false);
              new WorkingDaysHours().setVisible(true);
              
              
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "unsuccess");
              setVisible(false);
              new WorkingDaysHours().setVisible(true);
              e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jAddbtnActionPerformed

    private void jResetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetbtnActionPerformed
       //Reset button
       jHours.setSelectedItem(null);
       jMinutes.setSelectedItem(null);
       jWorkingDay.setSelectedItem(null);
      if( jMonday.isSelected() == true){
          jMonday.setSelected(false);
      }
      if( jTuesday.isSelected() == true){
          jTuesday.setSelected(false);
      }
      if( jWendnesday.isSelected() == true){
          jWendnesday.setSelected(false);
      }
      if( jThursday.isSelected() == true){
          jThursday.setSelected(false);
      }
      if( jFriday.isSelected() == true){
          jFriday.setSelected(false);
      }
      if( jSatureday.isSelected() == true){
          jSatureday.setSelected(false);
      }
      if( jSunday.isSelected() == true){
          jSunday.setSelected(false);
      }
     
       
    }//GEN-LAST:event_jResetbtnActionPerformed

    private void jWorkingDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWorkingDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jWorkingDayActionPerformed

    private void jUpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdatebtnActionPerformed
        //update button implementation
        String noWorkingDays = (String)jWorkingDay.getSelectedItem(); 
        int monday = 0;
        int tuesday  = 0;
        int wednesday = 0;
        int thursday = 0;
        int friday = 0;
        int saturday = 0;
        int sunday = 0;
        if(jMonday.isSelected()){
            monday = 1;
        }
         if(jTuesday.isSelected()){
            tuesday = 1;
        } 
         if(jWendnesday.isSelected()){
            wednesday = 1;
        }
          if(jThursday.isSelected()){
            thursday = 1;
        }
           if(jFriday.isSelected()){
            friday = 1;
        }
            if(jSatureday.isSelected()){
            saturday = 1;
        }
             if(jSunday.isSelected()){
            sunday = 1;
        }
        String hours = (String)jHours.getSelectedItem(); 
        String minutes = (String)jMinutes.getSelectedItem();
        String workdayid =(String)jSelectID.getSelectedItem();
        try{
              con = (Connection) DBconnection.getConnection();
              stmt = con.createStatement();
              String sql = "UPDATE management_system.workingdays SET NoDays='"+noWorkingDays+"',monday='"+monday+"',tuesday='"+tuesday+"',wendnesday='"+wednesday+"',thursday='"+thursday+"',friday='"+friday+"',satureday='"+saturday+"',sunday='"+sunday+"',hour='"+hours+"',minute='"+minutes+"' WHERE workingDaysID = '"+workdayid+"'";
             
              stmt.executeUpdate(sql);
              JOptionPane.showMessageDialog(null, "Successfully Updated");
              setVisible(false);
              new WorkingDaysHours().setVisible(true);
              
              
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "unsuccess");
              setVisible(false);
              new WorkingDaysHours().setVisible(true);
              e.printStackTrace();
        }
        
        
        
        
        
        
    }//GEN-LAST:event_jUpdatebtnActionPerformed

    private void jSelectIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectIDActionPerformed
        
    }//GEN-LAST:event_jSelectIDActionPerformed

    private void jSearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchbtnActionPerformed
        // TODO add your handling code here:
      String workdayid = jSelectID.getSelectedItem().toString();
          try{
              con = (Connection) DBconnection.getConnection();
              stmt = con.createStatement();
              String sql = "SELECT workingdays.* FROM management_system.workingdays WHERE workingDaysID = '"+workdayid+"'";
              rs = stmt.executeQuery(sql);
              
              if(rs.next() == true){
                  
                  jWorkingDay.setSelectedItem(rs.getString(2));
                  jHours.setSelectedItem(rs.getString(10));
                  jMinutes.setSelectedItem(rs.getString(11));
                  int value = rs.getInt(3);
                  int value2 = rs.getInt(4);
                  int value3 = rs.getInt(5);
                  int value4 = rs.getInt(6);
                  int value5 = rs.getInt(7);
                  int value6 = rs.getInt(8);
                  int value7 = rs.getInt(9);
                  
                  if(1 == value){
                      jMonday.setSelected(true);
                  }
                  else{
                      jMonday.setSelected(false);
                  }
                  
                  if(1 == value2){
                      jTuesday.setSelected(true);
                  }
                  else{
                      jTuesday.setSelected(false);
                  }
                  if(1 == value3){
                      jWendnesday.setSelected(true);
                  }
                  else{
                      jWendnesday.setSelected(false);
                  }
                  if(1 == value4){
                      jThursday.setSelected(true);
                  }
                  else{
                      jThursday.setSelected(false);
                  }
                  if(1 == value5){
                      jFriday.setSelected(true);
                  }
                  else{
                      jFriday.setSelected(false);
                  }
                  if(1 == value6){
                      jSatureday.setSelected(true);
                  }
                  else{
                      jSatureday.setSelected(false);
                  }
                  if(1 == value7){
                      jSunday.setSelected(true);
                  }
                  else{
                      jSunday.setSelected(false);
                  }
              }
             
              
              
        }catch(Exception e){
           e.printStackTrace();
        }
       
     
    }//GEN-LAST:event_jSearchbtnActionPerformed

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
            java.util.logging.Logger.getLogger(WorkingDaysHours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkingDaysHours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkingDaysHours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkingDaysHours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkingDaysHours().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddbtn;
    private javax.swing.JCheckBox jFriday;
    private javax.swing.JComboBox<String> jHours;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jMinutes;
    private javax.swing.JCheckBox jMonday;
    private javax.swing.JButton jResetbtn;
    private javax.swing.JCheckBox jSatureday;
    private javax.swing.JButton jSearchbtn;
    private javax.swing.JComboBox<String> jSelectID;
    private javax.swing.JCheckBox jSunday;
    private javax.swing.JCheckBox jThursday;
    private javax.swing.JCheckBox jTuesday;
    private javax.swing.JButton jUpdatebtn;
    private javax.swing.JCheckBox jWendnesday;
    private javax.swing.JComboBox<String> jWorkingDay;
    // End of variables declaration//GEN-END:variables
}
