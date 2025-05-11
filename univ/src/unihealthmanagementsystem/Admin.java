package unihealthmanagementsystem;

import unihealthmanagementsystem.User.Login;
import static java.lang.System.exit;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Admin extends javax.swing.JFrame {

    public static Admin getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
    public Admin() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\LoginIcoSm.png");
        this.setIconImage(img.getImage());
    }
    
    DbClass db = new DbClass();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUser = new javax.swing.JTextField();
        passPass = new javax.swing.JPasswordField();
        BtnOk = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnAdminMode = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        setMinimumSize(new java.awt.Dimension(430, 230));
        setResizable(false);
        getContentPane().setLayout(null);

        txtUser.setBackground(new java.awt.Color(148, 180, 193));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser);
        txtUser.setBounds(140, 70, 180, 30);

        passPass.setBackground(new java.awt.Color(148, 180, 193));
        passPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passPassActionPerformed(evt);
            }
        });
        getContentPane().add(passPass);
        passPass.setBounds(140, 110, 180, 30);

        BtnOk.setBackground(new java.awt.Color(148, 180, 193));
        BtnOk.setText("Ok");
        BtnOk.setToolTipText("Ok to proceed");
        BtnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOkActionPerformed(evt);
            }
        });
        getContentPane().add(BtnOk);
        BtnOk.setBounds(150, 150, 70, 23);

        btnCancel.setText("Cancel");
        btnCancel.setToolTipText("Cancel to Exit");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(230, 150, 80, 23);

        btnAdminMode.setBackground(new java.awt.Color(148, 180, 193));
        btnAdminMode.setText("User Mode");
        btnAdminMode.setToolTipText("Go to Admin Mode");
        btnAdminMode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdminMode.setFocusPainted(false);
        btnAdminMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminModeActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminMode);
        btnAdminMode.setBounds(300, 10, 110, 20);

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADMIN LOGIN");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 30, 240, 30);

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 120, 110, 20);

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 70, 110, 20);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/bg2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-200, -210, 800, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminModeActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAdminModeActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void BtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOkActionPerformed
        try {
            db.Connect();
            ResultSet rs = db.findUsername(txtUser.getText(), "adminLogin");
            if(txtUser.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the username");
            } else if(rs == null){
                JOptionPane.showMessageDialog(null, "User not Found", "Error", JOptionPane.ERROR_MESSAGE);                
            } else if(passPass.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Password");
            } else if(rs.getString(3).equals(passPass.getText())) {
                AdminPanel au = new AdminPanel();
                au.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Password Incorrect", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_BtnOkActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMouseClicked

    private void passPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passPassActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnOk;
    private javax.swing.JButton btnAdminMode;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField passPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
