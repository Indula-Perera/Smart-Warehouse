/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.warehouse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author INDUL
 */
public class add_operator extends javax.swing.JFrame {

    /**
     * Creates new form add_operator
     */
    public add_operator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Backgroundpanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        backgroundimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Backgroundpanel.setBackground(new java.awt.Color(0, 102, 153));
        Backgroundpanel.setPreferredSize(new java.awt.Dimension(950, 540));
        Backgroundpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wh small W.png"))); // NOI18N
        Backgroundpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 150, 130));

        jLabel3.setFont(new java.awt.Font("Bauhaus 93", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Create Operator Account");
        Backgroundpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 670, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");
        Backgroundpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 100, 20));

        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setBorder(null);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });
        Backgroundpanel.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 180, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        Backgroundpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 100, 30));

        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.setBorder(null);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });
        Backgroundpanel.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 180, 20));

        jButton2.setText("Add Operator");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Backgroundpanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 100, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user20.png"))); // NOI18N
        Backgroundpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 20, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lock20.png"))); // NOI18N
        Backgroundpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 20, 30));

        lbl_name.setForeground(new java.awt.Color(255, 255, 255));
        Backgroundpanel.add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 180, 20));

        lbl_pass.setForeground(new java.awt.Color(255, 255, 255));
        Backgroundpanel.add(lbl_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 180, 20));

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Backgroundpanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 100, 30));

        backgroundimg.setBackground(new java.awt.Color(204, 204, 204));
        backgroundimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bg.jpg"))); // NOI18N
        Backgroundpanel.add(backgroundimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 960, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backgroundpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Backgroundpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(950, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(name.getText().trim().isEmpty() && pass.getText().trim().isEmpty() ){
        lbl_name.setText("Needed Name.");
        lbl_pass.setText("Needed Password.");
        }
        else if(name.getText().trim().isEmpty()){
             lbl_name.setText("Needed Name.");
        }
        else if(pass.getText().trim().isEmpty()){
            lbl_pass.setText("Needed Password.");
        }
        else{
        try {
            // TODO add your handling code here:
            String username = name.getText();
            String password = pass.getText();
            name.requestFocus();
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/warehouse","root","");
            PreparedStatement pst = con.prepareStatement("insert into operator (username,password)values(?,?)");
            pst.setString(1, username);
            pst.setString(2, password);
            
            pst.executeUpdate();
            
            
            JOptionPane.showMessageDialog(this,"Operator Successfully Added.");
           
              name.setText("");
              pass.setText("");
              name.requestFocus(); 
              
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(autoIn.class.getName()).log(Level.SEVERE, null, ex);
            
        }   catch (SQLException ex) {
                Logger.getLogger(add_operator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        manager Y1 =new manager();
                Y1.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        // TODO add your handling code here:
        lbl_name.setText("");
    }//GEN-LAST:event_nameKeyReleased

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        // TODO add your handling code here:
        lbl_pass.setText("");
    }//GEN-LAST:event_passKeyReleased

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
            java.util.logging.Logger.getLogger(add_operator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_operator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_operator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_operator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new add_operator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backgroundpanel;
    private javax.swing.JLabel backgroundimg;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pass;
    // End of variables declaration//GEN-END:variables
}
