/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.warehouse;

/**
 *
 * @author INDUL
 */
public class manager extends javax.swing.JFrame {

    /**
     * Creates new form manager
     */
    public manager() {
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        backgroundimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Backgroundpanel.setBackground(new java.awt.Color(0, 102, 153));
        Backgroundpanel.setPreferredSize(new java.awt.Dimension(950, 540));
        Backgroundpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wh small W.png"))); // NOI18N
        Backgroundpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 150, 130));

        jLabel3.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome Manager");
        Backgroundpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 360, 100));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reg u 15.png"))); // NOI18N
        jButton1.setText("Register User");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Backgroundpanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 200, 30));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete 15.png"))); // NOI18N
        jButton2.setText("Delete User");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Backgroundpanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 200, 30));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/op 15.png"))); // NOI18N
        jButton3.setText("Create Operator");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Backgroundpanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 200, 30));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/c sto 15.png"))); // NOI18N
        jButton4.setText("Add  New Storage Job");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Backgroundpanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 200, 30));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rs 15.png"))); // NOI18N
        jButton5.setText("Close Existing Storage Job");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Backgroundpanel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 200, 30));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/c mb 15.png"))); // NOI18N
        jButton6.setText("Calculate the Bill of Storage Job");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Backgroundpanel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 200, 30));

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/c stb 15.png"))); // NOI18N
        jButton7.setText("Calculate the Monthly Report");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Backgroundpanel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 200, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mana 200.png"))); // NOI18N
        Backgroundpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 220, 200));

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit 20.png"))); // NOI18N
        jButton8.setText("Log Out");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Backgroundpanel.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 100, 30));

        backgroundimg.setBackground(new java.awt.Color(0, 51, 204));
        backgroundimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bg.jpg"))); // NOI18N
        Backgroundpanel.add(backgroundimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 960, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backgroundpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Backgroundpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(966, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        reg_user Y1 =new reg_user();
                Y1.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        delete_user Y1 =new delete_user();
                Y1.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        add_operator Y1 =new add_operator();
                Y1.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        add_n_s_j Y1 =new add_n_s_j();
                Y1.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        close_e_s_j Y1 =new close_e_s_j();
                Y1.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        calculate_bill_of_storage_job Y1 = new calculate_bill_of_storage_job();
            Y1.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        calculate_monthly_bill Y1 =new calculate_monthly_bill();
            Y1.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        m_login Y1 =new m_login();
                Y1.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backgroundpanel;
    private javax.swing.JLabel backgroundimg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
