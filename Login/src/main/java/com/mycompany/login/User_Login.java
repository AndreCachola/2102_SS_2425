package com.mycompany.login;
import java.awt.event.*;
public class User_Login extends javax.swing.JFrame {

    /**
     * Creates new form User_Login
     */
    public User_Login() {
        initComponents();
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                centerPanel();
            }
        });
    }
 private void centerPanel() {
        int frameWidth = getWidth();
        int frameHeight = getHeight();
        int panelWidth = right.getPreferredSize().width;
        int panelHeight = right.getPreferredSize().height;

        // Set the panel's position to the center of the frame
        int x = (frameWidth - panelWidth) / 2;
        int y = (frameHeight - panelHeight) / 2;

       right.setLocation(x, y);
    }
        
        
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        right = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usernameLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passwordLogin = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        forgetPassword = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setSize(new java.awt.Dimension(800, 500));

        right.setBackground(new java.awt.Color(255, 255, 255));
        right.setPreferredSize(new java.awt.Dimension(800, 500));
        right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        right.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 22));

        usernameLogin.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        usernameLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        usernameLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameLoginActionPerformed(evt);
            }
        });
        right.add(usernameLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 300, 37));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        right.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 22));

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel4.setText("don't have an account yet?");
        right.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, 22));

        passwordLogin.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        passwordLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        passwordLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordLoginActionPerformed(evt);
            }
        });
        right.add(passwordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 300, 37));

        login.setBackground(new java.awt.Color(153, 153, 153));
        login.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        right.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 300, 40));

        register.setFont(new java.awt.Font("Montserrat", 2, 14)); // NOI18N
        register.setText("sign up");
        register.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        right.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel1.setText("Login to your account");
        right.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 271, 40));

        forgetPassword.setFont(new java.awt.Font("Montserrat", 2, 14)); // NOI18N
        forgetPassword.setText("forget password?");
        forgetPassword.setBorder(null);
        forgetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetPasswordActionPerformed(evt);
            }
        });
        right.add(forgetPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 150, -1));

        jButton1.setText("About");
        right.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jButton2.setText("Contact Us");
        right.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        jLabel9.setText("image");
        right.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        jLabel10.setText("name of spa and salon bago may icon na maliit");
        right.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        getContentPane().add(right, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        Register SignUpFrame = new Register();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_registerActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void passwordLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordLoginActionPerformed

    private void usernameLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameLoginActionPerformed

    private void forgetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetPasswordActionPerformed
        Forgot_Password ForgotFrame = new Forgot_Password();
        ForgotFrame.setVisible(true);
        ForgotFrame.pack();
        ForgotFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_forgetPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(User_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Login().setVisible(true);
                new User_Login().setLocationRelativeTo(null);


            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgetPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField passwordLogin;
    private javax.swing.JButton register;
    private javax.swing.JPanel right;
    private javax.swing.JTextField usernameLogin;
    // End of variables declaration//GEN-END:variables
}
