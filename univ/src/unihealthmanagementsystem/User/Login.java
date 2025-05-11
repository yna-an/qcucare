package unihealthmanagementsystem.User;

import unihealthmanagementsystem.Admin;
import java.awt.HeadlessException;
import java.sql.*;
import static java.lang.System.exit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import unihealthmanagementsystem.DbClass;

public class Login extends javax.swing.JFrame{
    
// Variables and Objects
        DbClass dbClass = DbClass.getInstance();

    // Constructor
    public Login() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\AdminIcoSm.png");
        this.setIconImage(img.getImage());
    }
    
    // Creating Instance
    private static Login instance = null;
    public static Login getInstance() {
        if(instance == null)
            instance = new Login();
        return instance;
    }
    
    // Swing Generated Code
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(430, 230));
        setResizable(false);
        getContentPane().setLayout(null);

        txtUser.setBackground(new java.awt.Color(148, 180, 193));
        getContentPane().add(txtUser);
        txtUser.setBounds(160, 70, 180, 30);

        passPass.setBackground(new java.awt.Color(148, 180, 193));
        getContentPane().add(passPass);
        passPass.setBounds(160, 110, 180, 30);

        BtnOk.setBackground(new java.awt.Color(148, 180, 193));
        BtnOk.setText("Ok");
        BtnOk.setToolTipText("Ok to proceed");
        BtnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnOk.setSelected(true);
        BtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOkActionPerformed(evt);
            }
        });
        getContentPane().add(BtnOk);
        BtnOk.setBounds(170, 150, 70, 23);

        btnCancel.setText("Cancel");
        btnCancel.setToolTipText("Cancel to Exit");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(250, 150, 80, 23);

        btnAdminMode.setBackground(new java.awt.Color(148, 180, 193));
        btnAdminMode.setText("Admin Mode");
        btnAdminMode.setToolTipText("Go to Admin Mode");
        btnAdminMode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdminMode.setFocusPainted(false);
        btnAdminMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminModeActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminMode);
        btnAdminMode.setBounds(300, 10, 100, 23);

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("USER LOGIN");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 30, 210, 30);

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 120, 90, 20);

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 70, 100, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/BG.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-20, -50, 450, 270);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // btnAdminModeActionPerformed Action Event
    private void btnAdminModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminModeActionPerformed
        
       Admin adminPanel = new Admin();
adminPanel.setVisible(true);
       
        
    }//GEN-LAST:event_btnAdminModeActionPerformed

    // BtnOkActionPerformed Action Event
    private void BtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOkActionPerformed
            
        dbClass.Connect();
        ResultSet rs = dbClass.findUsername(txtUser.getText(), "userLogin");
        String hello = txtUser.getText();
        
        try {
            if(txtUser.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the username");
            } 
            else if(rs == null){
                JOptionPane.showMessageDialog(null, "User not Found", "Error", JOptionPane.ERROR_MESSAGE);                
            }
            else if(passPass.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Password");
            } 
            else if(rs.getString(3).equals(passPass.getText())) {
                PatientPanel patientPanel = PatientPanel.getInstance();
                patientPanel.setVisible(true);
                this.setVisible(false);
                txtUser.setText("");
                passPass.setText("");
                this.dispose();
                DiagnosisSystem.setNameFor(hello);
            } 
            else {
                JOptionPane.showMessageDialog(null, "Password Incorrect", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
     
    }//GEN-LAST:event_BtnOkActionPerformed

    // btnCancelActionPerformed Action Event
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        
        exit(0);
        
    }//GEN-LAST:event_btnCancelActionPerformed

    // Main Mehtod
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnOk;
    private javax.swing.JButton btnAdminMode;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField passPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
