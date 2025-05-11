package unihealthmanagementsystem.User;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import unihealthmanagementsystem.DbClass;


public class AddPStu extends javax.swing.JFrame {

    // Objects, Instances and Variables
    DbClass dbClass = DbClass.getInstance();
    PatientPanel patientPanel = PatientPanel.getInstance();
    
    // Constructor
   AddPStu() {
    initComponents(); 
    setLocationRelativeTo(null);
    setVisible(true);
}
  
    
    // Creating Instance
    private static AddPStu instance = null;
    public static AddPStu getInstance() {
        if(instance == null)
            instance = new AddPStu();
        return instance;
    }
    
    // Email Validation Method
    private static boolean isEmailValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
    
    // Selection Method

    
    // Swing Generated Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtGuard = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        comGen = new javax.swing.JComboBox<>();
        txtAddress = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        comPsyco = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtLandline = new javax.swing.JTextField();
        txtDob = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtDepart = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        comBlood1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Faculty Member");
        setMinimumSize(new java.awt.Dimension(955, 855));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel21.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        jLabel21.setText("Enter Date of Birth:");

        txtGuard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        jLabel22.setText("Enter Department:");

        jLabel23.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        jLabel23.setText("Enter Patient Name:");

        jLabel27.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        jLabel27.setText("Select Gender:");

        comGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        comGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comGenActionPerformed(evt);
            }
        });

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        jLabel31.setText("Enter Address:");

        jLabel32.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        jLabel32.setText("Enter Mobile No:");

        txtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(204, 204, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 102));
        jLabel15.setText("+63");

        comPsyco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));

        jLabel37.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        jLabel37.setText("Psycologically Fit?");

        jLabel38.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        jLabel38.setText("Enter Landline No:");

        txtLandline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLandlineActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("* Please fill as specified: House No, Street No, City, State");

        txtDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        jLabel45.setText("Enter Emergency Contact:");

        jLabel43.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        jLabel43.setText("Enter Email:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        btnOk.setBackground(new java.awt.Color(148, 180, 193));
        btnOk.setText("Add");
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        jLabel40.setText("Enter Blood Group:");

        comBlood1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(453, 453, 453))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLandline, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGuard, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(189, 189, 189)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comPsyco, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(74, 74, 74)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(750, 750, 750)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comBlood1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comGen, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(372, 372, 372))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGuard, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comGen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comBlood1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)))
                .addComponent(jLabel9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comPsyco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLandline, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 60, 950, 430);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD FACULTY:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, 0, 954, 76);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // btnCancelMouseClicked Mouse Event
    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        
        AddPatient addPatient = AddPatient.getInstance();
        addPatient.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_btnCancelMouseClicked

    // btnOkMouseClicked Mouse Event
    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
        
        dbClass.Connect();
        ResultSet rs = dbClass.findUsername(txtName.getText() ,"patientDetails");
        
if (txtName.getText().equals("") || 
    txtGuard.getText().equals("") ||  
    txtDepart.getText().equals("") || 
    txtDob.getDate() == null ||    
    txtAddress.getText().equals("") || 
    txtEmail.getText().equals("") || 
    txtMobile.getText().equals("") ||  
    comGen.getSelectedItem().toString().equals("Select") || 
    comPsyco.getSelectedItem().toString().equals("Select")) {
    
    JOptionPane.showMessageDialog(null, "All fields are mandatory");

} else if (rs != null) {
    JOptionPane.showMessageDialog(null, "Patient already exists");

} else {
    try {

        if (!isEmailValid(txtEmail.getText())) {
            JOptionPane.showMessageDialog(null, "Please enter your email according to standards");
        } else if (txtMobile.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Please check entered mobile No. 10 digits are required");
        } else {
            Date d = txtDob.getDate();
            SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
            String dob = df.format(d);

            boolean val = dbClass.addPatient(
                txtName.getText(), 
                txtGuard.getText(),
                comGen.getSelectedItem().toString(), 
                txtDepart.getText(), 
                txtAddress.getText(), 
                Long.parseLong(txtMobile.getText()), 
                txtEmail.getText(), 
                comBlood1.getSelectedItem().toString(), 
                comPsyco.getSelectedItem().toString(), 
                dob
            );

            if (!val) {
                JOptionPane.showMessageDialog(null, "Error Adding data", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Successfully added");
                this.setVisible(false);
                patientPanel.setVisible(true);
                this.dispose();
            }
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Please enter numeric value in mobile field");
    }
}

    }//GEN-LAST:event_btnOkMouseClicked

    private void txtMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtLandlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLandlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLandlineActionPerformed

    private void txtGuardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuardActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void comGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comGenActionPerformed

    private void txtDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartActionPerformed

    // Main Method
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new AddPStu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> comBlood1;
    private javax.swing.JComboBox<String> comGen;
    private javax.swing.JComboBox<String> comPsyco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDepart;
    private com.toedter.calendar.JDateChooser txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGuard;
    private javax.swing.JTextField txtLandline;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
