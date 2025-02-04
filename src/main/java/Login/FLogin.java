/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerri
 */
public class FLogin extends javax.swing.JFrame {

    /**
     * Creates new form FLogin
     */
    public FLogin() {
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

        Cancel = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        JUsername = new javax.swing.JTextField();
        JPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InvApp");
        setMaximumSize(new java.awt.Dimension(620, 347));
        setMinimumSize(new java.awt.Dimension(620, 347));
        setPreferredSize(new java.awt.Dimension(620, 347));
        getContentPane().setLayout(null);

        Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Cancel.png"))); // NOI18N
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelMouseClicked(evt);
            }
        });
        getContentPane().add(Cancel);
        Cancel.setBounds(240, 170, 30, 30);

        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Login.png"))); // NOI18N
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(290, 170, 40, 30);

        JUsername.setBackground(new java.awt.Color(204, 255, 204));
        JUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JUsername.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(126, 196, 121), null, null));
        JUsername.setMinimumSize(new java.awt.Dimension(64, 21));
        JUsername.setPreferredSize(new java.awt.Dimension(73, 20));
        JUsername.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                JUsernameComponentHidden(evt);
            }
        });
        getContentPane().add(JUsername);
        JUsername.setBounds(195, 100, 180, 22);
        JUsername.getAccessibleContext().setAccessibleName("");

        JPassword.setBackground(new java.awt.Color(204, 255, 204));
        JPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(JPassword);
        JPassword.setBounds(195, 140, 180, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Backgroun_login.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JUsernameComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_JUsernameComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_JUsernameComponentHidden

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        String user = JUsername.getText();
        String pwd = String.valueOf(JPassword.getPassword());
        
        if(user.equals("Admin") && pwd.equals("Admin123")) {
            JOptionPane.showMessageDialog(rootPane, "Login Berhasil!!");
        }else{
            JOptionPane.showMessageDialog(rootPane, " Tidak dapat Login!!");
        }
    }//GEN-LAST:event_LoginMouseClicked

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
        dispose();
    }//GEN-LAST:event_CancelMouseClicked

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
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cancel;
    private javax.swing.JPasswordField JPassword;
    private javax.swing.JTextField JUsername;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
