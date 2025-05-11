package unihealthmanagementsystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import unihealthmanagementsystem.DbClass;

public class DeleteUser extends javax.swing.JFrame {

    DbClass dc = new DbClass();
    
    public DeleteUser() {
        initComponents();
        btnDelete.disable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnDetails = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDet = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete User");
        setMinimumSize(new java.awt.Dimension(400, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255,204,204,100));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        jLabel3.setText("Enter Username:");

        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        btnDetails.setBackground(new java.awt.Color(148, 180, 193));
        btnDetails.setText("Details");
        btnDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDetailsMouseClicked(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 153, 153));
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtDet.setEditable(false);
        txtDet.setColumns(20);
        txtDet.setRows(5);
        jScrollPane1.setViewportView(txtDet);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 90, 400, 400);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_10024521.png"))); // NOI18N
        jLabel2.setText("  DELETE USER");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 350, 70);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        AdminPanel ap = new AdminPanel();
        ap.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetailsMouseClicked
        dc.Connect();
        ResultSet rs = dc.findUsername(txtUser.getText(), "UserLogin");
        try {
            if(rs == null){
                JOptionPane.showMessageDialog(null, "User not found!");
            }
            txtDet.setText("ID: \t" + rs.getString(1) + "\nUsername: \t" + rs.getString(2)
            + "\nPassword: \t" + rs.getString(3) + "\nEmail: \t" + rs.getString(4)
            + "\nSalary: \t" + rs.getString(7) + "\nAddress: \t" + rs.getString(5)
            + "\nMobile: \t" + rs.getString(6));
            btnDelete.enable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
        }
    }//GEN-LAST:event_btnDetailsMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete user?");
        System.out.println(a);
        if (a == 0) {
            dc.Connect();
            boolean val = dc.deleteUser(txtUser.getText(), "userLogin");
            if(!val){
                JOptionPane.showMessageDialog(null, "Deleted Successfully!");
                txtDet.setText("");
            } else{
                JOptionPane.showMessageDialog(null, "Error Deletin!g");
            }
        } else if(a == 2){
            txtDet.setText("");
        } else if(a == 1){
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

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
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetails;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDet;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
