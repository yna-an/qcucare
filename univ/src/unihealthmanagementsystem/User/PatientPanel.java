package unihealthmanagementsystem.User;

import javax.swing.ImageIcon;

public class PatientPanel extends javax.swing.JFrame {

    // Constructor
    public PatientPanel() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\AdminIcoSm.png");
        this.setIconImage(img.getImage());
    }
    
    // Creating Instance
    private static PatientPanel instance = null;
    public static PatientPanel getInstance() {
        if(instance == null)
            instance = new PatientPanel();
        return instance;
    }

    // Swing Generated Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pp4 = new javax.swing.JPanel();
        txtPp4 = new javax.swing.JLabel();
        pp1 = new javax.swing.JPanel();
        txtPp1 = new javax.swing.JLabel();
        pp3 = new javax.swing.JPanel();
        txtPp3 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Panel");
        setMinimumSize(new java.awt.Dimension(390, 450));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204,255,255,100));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setForeground(new java.awt.Color(51, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pp4.setBackground(new java.awt.Color(148, 180, 193));
        pp4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pp4.setForeground(new java.awt.Color(148, 180, 193));
        pp4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtPp4.setBackground(new java.awt.Color(51, 51, 51));
        txtPp4.setFont(new java.awt.Font("Dubai Light", 1, 19)); // NOI18N
        txtPp4.setForeground(new java.awt.Color(51, 51, 51));
        txtPp4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPp4.setText("View Diagnostic Details");
        txtPp4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtPp4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPp4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pp4Layout = new javax.swing.GroupLayout(pp4);
        pp4.setLayout(pp4Layout);
        pp4Layout.setHorizontalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPp4, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );
        pp4Layout.setVerticalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPp4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel2.add(pp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 185, -1, -1));

        pp1.setBackground(new java.awt.Color(148, 180, 193));
        pp1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pp1.setForeground(new java.awt.Color(148, 180, 193));
        pp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtPp1.setBackground(new java.awt.Color(0, 102, 51));
        txtPp1.setFont(new java.awt.Font("Dubai Light", 1, 19)); // NOI18N
        txtPp1.setForeground(new java.awt.Color(51, 51, 51));
        txtPp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPp1.setText("Add Patient");
        txtPp1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtPp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPp1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pp1Layout = new javax.swing.GroupLayout(pp1);
        pp1.setLayout(pp1Layout);
        pp1Layout.setHorizontalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPp1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );
        pp1Layout.setVerticalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPp1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel2.add(pp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 37, 329, -1));

        pp3.setBackground(new java.awt.Color(148, 180, 193));
        pp3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pp3.setForeground(new java.awt.Color(148, 180, 193));
        pp3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtPp3.setBackground(new java.awt.Color(51, 51, 51));
        txtPp3.setFont(new java.awt.Font("Dubai Light", 1, 19)); // NOI18N
        txtPp3.setForeground(new java.awt.Color(51, 51, 51));
        txtPp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPp3.setText("Diagnose");
        txtPp3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtPp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPp3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pp3Layout = new javax.swing.GroupLayout(pp3);
        pp3.setLayout(pp3Layout);
        pp3Layout.setHorizontalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPp3, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );
        pp3Layout.setVerticalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPp3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel2.add(pp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 107, 329, -1));

        btnBack2.setBackground(new java.awt.Color(0, 204, 204));
        btnBack2.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        btnBack2.setText("Logout");
        btnBack2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBack2MouseClicked(evt);
            }
        });
        jPanel2.add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 140, 30));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, 70, 410, 410);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/health-support_18274217.png"))); // NOI18N
        jLabel2.setText("PATIENT PANEL");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 375, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // txtPp1MouseClicked Mouse Event
    private void txtPp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPp1MouseClicked
        
        AddPatient addPatient = AddPatient.getInstance();
        addPatient.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_txtPp1MouseClicked

    // txtPp4MouseClicked Mouse Event
    private void txtPp4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPp4MouseClicked
        
        DiagnosticDetails diagnosticDetails = DiagnosticDetails.getInstance();
        diagnosticDetails.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_txtPp4MouseClicked

    // txtPp3MouseClicked Mouse Event
    private void txtPp3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPp3MouseClicked
        
        DiagnosisSystem diagnosisSystem = DiagnosisSystem.getInstance();
        diagnosisSystem.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_txtPp3MouseClicked

    private void btnBack2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack2MouseClicked

        Login login = Login.getInstance();
        login.setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_btnBack2MouseClicked

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
            java.util.logging.Logger.getLogger(PatientPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new PatientPanel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pp1;
    private javax.swing.JPanel pp3;
    private javax.swing.JPanel pp4;
    private javax.swing.JLabel txtPp1;
    private javax.swing.JLabel txtPp3;
    private javax.swing.JLabel txtPp4;
    // End of variables declaration//GEN-END:variables
}
