package unihealthmanagementsystem.User;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AddPatient extends javax.swing.JFrame {
    
    // Constructor
    public AddPatient() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\AdminIcoSm.png");
        this.setIconImage(img.getImage());
    }
    
    // Creating Instance
    private static AddPatient instance = null;
    public static AddPatient getInstance() {
        if(instance == null)
            instance = new AddPatient();
        return instance;
    }

    // Swing Generated Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnPro = new javax.swing.JButton();
        comSel = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText("Enter Address:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Patient");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        btnPro.setBackground(new java.awt.Color(148, 180, 193));
        btnPro.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        btnPro.setText("Proceed");
        btnPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProMouseClicked(evt);
            }
        });
        btnPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProActionPerformed(evt);
            }
        });

        comSel.setBackground(new java.awt.Color(148, 180, 193));
        comSel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Student", "Faculty", "Worker" }));

        jLabel2.setFont(new java.awt.Font("Dubai Light", 0, 20)); // NOI18N
        jLabel2.setText(" Category:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADD PATIENT PANEL:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(comSel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comSel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 200));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // btnBackMouseClicked Mouse Event
    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        
        PatientPanel patientPanel = PatientPanel.getInstance();
        patientPanel.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_btnBackMouseClicked
    
    // btnProMouseClicked Mouse Event
    private void btnProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProMouseClicked
        
        String selection = comSel.getSelectedItem().toString();
        switch (selection) {
            case "Student":
                AddPStu ap = new AddPStu();
                ap.setVisible(true);
                this.setVisible(false);
                break;
            case "Faculty":
                AddPFa af = new AddPFa();
                af.setVisible(true);
                this.setVisible(false);
                break;
            case "Worker":
                AddPWo aw = new AddPWo();
                aw.setVisible(true);
                this.setVisible(false);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please make a selection");
                break;
        }
        
    }//GEN-LAST:event_btnProMouseClicked

    private void btnProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProActionPerformed

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
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new AddPatient().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPro;
    private javax.swing.JComboBox<String> comSel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
