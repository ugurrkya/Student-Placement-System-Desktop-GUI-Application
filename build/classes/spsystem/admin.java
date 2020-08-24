/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Uğur
 */
public class admin extends javax.swing.JFrame {

  
    private login parentwindow;

    public admin (login parent ) {
         this.parentwindow = parent;
       initComponents();
       jTable1.setVisible(false);
       confirmBtn.setVisible(false);
       DeleteBtn.setVisible(false);
       retrieveBtn.setVisible(false);
       jScroll.setVisible(false);
       jScrolltwo.setVisible(false);
       jTable2.setVisible(false);
     
    }
    public admin() {
        initComponents();
    }
    
    private void retrieve()
    {
     DefaultTableModel dm = new DBUpdater().getData();
        jTable1.setModel(dm);   
        
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminlogout = new javax.swing.JButton();
        viewnewreports = new javax.swing.JButton();
        viewallreports = new javax.swing.JButton();
        jScroll = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        retrieveBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrolltwo = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        adminwelcome = new javax.swing.JLabel();
        adminbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Placement System");
        setMinimumSize(new java.awt.Dimension(1366, 768));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);

        adminlogout.setText("LOGOUT");
        adminlogout.setMaximumSize(new java.awt.Dimension(65, 23));
        adminlogout.setMinimumSize(new java.awt.Dimension(65, 23));
        adminlogout.setPreferredSize(new java.awt.Dimension(65, 23));
        adminlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(adminlogout);
        adminlogout.setBounds(1200, 600, 100, 23);

        viewnewreports.setText("View New Reports");
        viewnewreports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewnewreportsActionPerformed(evt);
            }
        });
        getContentPane().add(viewnewreports);
        viewnewreports.setBounds(10, 50, 140, 40);

        viewallreports.setText("View All Reports");
        viewallreports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewallreportsActionPerformed(evt);
            }
        });
        getContentPane().add(viewallreports);
        viewallreports.setBounds(220, 50, 140, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScroll.setViewportView(jTable1);

        getContentPane().add(jScroll);
        jScroll.setBounds(500, 200, 650, 402);

        retrieveBtn.setText("Retrieve");
        retrieveBtn.setPreferredSize(new java.awt.Dimension(65, 23));
        retrieveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(retrieveBtn);
        retrieveBtn.setBounds(410, 260, 80, 23);

        confirmBtn.setText("Confirm");
        confirmBtn.setPreferredSize(new java.awt.Dimension(65, 23));
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        getContentPane().add(confirmBtn);
        confirmBtn.setBounds(410, 200, 80, 23);

        DeleteBtn.setText("Delete");
        DeleteBtn.setPreferredSize(new java.awt.Dimension(65, 23));
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteBtn);
        DeleteBtn.setBounds(410, 230, 80, 23);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
            }
        ));
        jScrolltwo.setViewportView(jTable2);

        getContentPane().add(jScrolltwo);
        jScrolltwo.setBounds(500, 200, 650, 402);

        adminwelcome.setFont(new java.awt.Font("Times New Roman", 3, 22)); // NOI18N
        adminwelcome.setForeground(new java.awt.Color(255, 0, 51));
        adminwelcome.setText("WELCOME!");
        getContentPane().add(adminwelcome);
        adminwelcome.setBounds(0, 0, 190, 27);

        adminbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spsystem/adminpage.jpg"))); // NOI18N
        getContentPane().add(adminbackground);
        adminbackground.setBounds(0, 0, 700, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        adminbackground.setSize(this.getSize());
    }//GEN-LAST:event_formComponentResized

    private void adminlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminlogoutActionPerformed
            dispose();
            new login().setVisible(true);
    }//GEN-LAST:event_adminlogoutActionPerformed

    private void viewnewreportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewnewreportsActionPerformed
        jTable1.setVisible(true);
       confirmBtn.setVisible(true);
       DeleteBtn.setVisible(true);
       retrieveBtn.setVisible(true);
       jScroll.setVisible(true);
       jScrolltwo.setVisible(false);
       jTable2.setVisible(false);
       
    }//GEN-LAST:event_viewnewreportsActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String fullname = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String aged = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
         String cityname = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String countyname = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String schoolname = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String confirmst = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
    }//GEN-LAST:event_jTable1MouseClicked

    private void retrieveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveBtnActionPerformed
        retrieve();
    }//GEN-LAST:event_retrieveBtnActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        int index=jTable1.getSelectedRow();
        String id = jTable1.getValueAt(index, 0).toString();
        String csituation="Approved";
        
        
      if(new DBUpdater().update(id,csituation))
        {
        JOptionPane.showMessageDialog(null,"THE REPORT IS CONFIRMED");
         retrieve();
    }else
      {
          JOptionPane.showMessageDialog(null, "THE REPORT IS NOT CONFIRMED");
      }
        
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        String[] options = {"Yes", "No"};
        int answ = JOptionPane.showOptionDialog(null, "Sure To Delete??", "Delete Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (answ == 0) {
            int index = jTable1.getSelectedRow();
            String id = jTable1.getValueAt(index, 0).toString();
            if (new DBUpdater().delete(id)) {
                JOptionPane.showMessageDialog(null, "THE REPORT IS DELETED SUCCESSFULLY.");
            retrieve();
            } else 
            {
                JOptionPane.showMessageDialog(null, "THE REPORT IS NOT DELETED UNFORTUNATELY.");
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void viewallreportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewallreportsActionPerformed
        jTable1.setVisible(false);
       confirmBtn.setVisible(false);
       DeleteBtn.setVisible(false);
       retrieveBtn.setVisible(false);
       jScroll.setVisible(false);
       
       
      
       
       try {
        Connection cd = DriverManager.getConnection("jdbc:mysql://localhost:3306/placement?useUnicode=true&characterEncoding=UTF-8", "ugur", "1905");
        Statement st = (Statement) cd.createStatement();
        try(ResultSet rs = st.executeQuery("Select * from sending_report")) { //Veritabanındaki tabloya bağlandık
            int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
            DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
            for(int i = 1;i<=colcount;i++)
                tm.addColumn(rs.getMetaData().getColumnName(i)); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
            while(rs.next())
                {
                    Object[] row = new Object[colcount];
                    for(int i=1;i<=colcount;i++)
                        row[i-1] = rs.getObject(i);
                    tm.addRow(row);
                }
            jTable2.setModel(tm);
        }
        cd.close();
    } catch (SQLException ex) {
            Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE, null, ex);
    }
      jScrolltwo.setVisible(true);
      jTable2.setVisible(true); 
    }//GEN-LAST:event_viewallreportsActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JLabel adminbackground;
    private javax.swing.JButton adminlogout;
    private javax.swing.JLabel adminwelcome;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JScrollPane jScroll;
    private javax.swing.JScrollPane jScrolltwo;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton retrieveBtn;
    private javax.swing.JButton viewallreports;
    private javax.swing.JButton viewnewreports;
    // End of variables declaration//GEN-END:variables
}