package unihealthmanagementsystemAdmin;

import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import unihealthmanagementsystem.DbClass;

public class AddUser extends javax.swing.JFrame {

    // Objects, instances and Variables
    DbClass dbClass = DbClass.getInstance();
    
    // Constructor
    public AddUser() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\LoginIcoSm.png");
        this.setIconImage(img.getImage());
    }
    
    // Creating Instance
    private static AddUser instance = null;
    public static AddUser getInstance() {
        if(instance == null)
            instance = new AddUser();
        return instance;
    }
    
    // Email Validation Method
    static boolean isEmailValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
    
    // Swing Generated Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        txtConfPass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAdd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add User");
        setMinimumSize(new java.awt.Dimension(403, 615));
        setPreferredSize(new java.awt.Dimension(403, 615));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD USER");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 330, 41);

        jPanel2.setBackground(new java.awt.Color(255,51,255,0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dubai Light", 0, 16)); // NOI18N
        jLabel3.setText("Enter Username:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 28, 131, 31));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 165, 31));

        jLabel4.setFont(new java.awt.Font("Dubai Light", 0, 16)); // NOI18N
        jLabel4.setText("Create Password:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 85, 131, 31));
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 85, 165, 31));
        jPanel2.add(txtConfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 146, 165, 31));

        jLabel5.setFont(new java.awt.Font("Dubai Light", 0, 16)); // NOI18N
        jLabel5.setText("Confirm Password:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 146, 131, 31));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 207, 165, 31));

        jLabel6.setFont(new java.awt.Font("Dubai Light", 0, 16)); // NOI18N
        jLabel6.setText("Enter Email:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 207, 131, 31));

        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });
        jPanel2.add(txtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 165, 31));

        jLabel8.setFont(new java.awt.Font("Dubai Light", 0, 16)); // NOI18N
        jLabel8.setText("Enter Address:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 131, 31));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("* Please fill as specified: House No, Street No, City, State");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 306, -1));
        jPanel2.add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 130, 30));

        jLabel11.setFont(new java.awt.Font("Dubai Light", 0, 16)); // NOI18N
        jLabel11.setText("Enter Mobile No.");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 131, 31));

        btnCancel.setText("Cancel");
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
        jPanel2.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 80, 40));

        btnOk.setBackground(new java.awt.Color(148, 180, 193));
        btnOk.setText("Add");
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
        });
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        jPanel2.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 90, 40));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, -1, -1));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 40, 14));

        jLabel15.setBackground(new java.awt.Color(204, 204, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 102));
        jLabel15.setText("+63");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 30, 30));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 70, 326, 514);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // btnCancelMouseClicked Mouse Event
    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        
    
    }//GEN-LAST:event_btnCancelMouseClicked

    // btnOkMouseClicked Mouse Event
    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
      
    }//GEN-LAST:event_btnOkMouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        
        double sal;
        long mob;
        dbClass.Connect();        
        ResultSet rs = dbClass.findUsername(txtName.getText(), "userLogin");
        
        if(txtName.getText().equals("") || txtPass.getText().equals("") || txtConfPass.getText().equals("") || txtEmail.getText().equals("") || txtAdd.getText().equals("")  || txtMobile.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
        } 
        else if(rs != null){
                JOptionPane.showMessageDialog(null, "User alredy exist");
        } 
        else if(!txtPass.getText().equals(txtConfPass.getText())){
            JOptionPane.showMessageDialog(null, "Password does not match");
        } 
        else if(txtName.getText() != ""){
            try{
               
                mob = Long.parseLong(txtMobile.getText());
            } 
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Please Do not enter strings in decimal fields");
                return;
            }
            boolean value = isEmailValid(txtEmail.getText());
            if(!value){
                JOptionPane.showMessageDialog(null, "Please enter your email according to standards");
            } else if(txtMobile.getText().length() != 10){
                JOptionPane.showMessageDialog(null, "Please check entered mobile No. 10 digits are required");
            }
            else{
                boolean val = dbClass.addUser(txtName.getText(), txtPass.getText(), txtEmail.getText(),  txtAdd.getText(), mob);
                if (val) {
                    JOptionPane.showMessageDialog(null, "Error Adding data", "Error", JOptionPane.ERROR_MESSAGE);
                } 
                else{
                    AdminPanel adminPanel = AdminPanel.getInstance();
                    JOptionPane.showMessageDialog(null, "Successfully added");
                    this.setVisible(false);
                    adminPanel.setVisible(true);
                    this.dispose();
                } 
            }
        } 
        
    }//GEN-LAST:event_btnOkActionPerformed

    private void txtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        AdminPanel ap = AdminPanel.getInstance();
        ap.setVisible(true);
        this.setVisible(false);
        txtName.setText("");
        txtAdd.setText("");
        txtConfPass.setText("");
        txtEmail.setText("");
        txtMobile.setText("");
        txtPass.setText("");
    
        this.dispose();
        
    }//GEN-LAST:event_btnCancelActionPerformed

    // Main Method
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new AddUser().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtConfPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    // End of variables declaration//GEN-END:variables
}
