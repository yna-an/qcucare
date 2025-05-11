package unihealthmanagementsystem;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AddAdmin extends javax.swing.JFrame {
    
    static boolean isEmailValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    DbClass dc = new DbClass();
    
    public AddAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Admin");
        setBackground(new java.awt.Color(153, 204, 255));
        setMinimumSize(new java.awt.Dimension(380, 355));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        jLabel3.setText("Enter Username:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 100, 140, 30);
        getContentPane().add(txtUser);
        txtUser.setBounds(170, 100, 180, 30);
        getContentPane().add(txtPass);
        txtPass.setBounds(170, 140, 180, 30);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(170, 190, 180, 30);

        jLabel5.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        jLabel5.setText("Enter Email:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 190, 140, 30);

        jLabel4.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        jLabel4.setText("Create Password:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 140, 150, 30);

        btnAdd.setBackground(new java.awt.Color(148, 180, 193));
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(260, 240, 90, 30);

        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(170, 240, 80, 30);

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user_9797558.png"))); // NOI18N
        jLabel2.setText("  ADD ADMIN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 376, 70);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 320);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        AdminPanel ap = new AdminPanel();
        ap.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        AdminPanel ap = new AdminPanel();
        dc.Connect();
        ResultSet rs = dc.findUsername(txtUser.getText(), "adminLogin");
        if(txtUser.getText().equals("") || txtPass.getText().equals("") || txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
        } else if(rs != null){
                JOptionPane.showMessageDialog(null, "User alredy exist");
        } else if(txtUser.getText() != ""){
            boolean value = isEmailValid(txtEmail.getText());
            if(!value){
                JOptionPane.showMessageDialog(null, "Please enter your email according to standards");
            } else{
                boolean val = dc.addAdmin(txtUser.getText(), txtPass.getText(), txtEmail.getText());
                if (val) {
                    JOptionPane.showMessageDialog(null, "Error Adding data", "Error", JOptionPane.ERROR_MESSAGE);
                } else{
                    JOptionPane.showMessageDialog(null, "Successfully added");
                    txtUser.setText("");
                    txtPass.setText("");
                    txtEmail.setText("");
                }
            }
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
