package unihealthmanagementsystem;


import unihealthmanagementsystem.User.DiagnosisSystem;
import unihealthmanagementsystem.User.DiagnosticDetails;

public class PatientPanel extends javax.swing.JFrame {

    public PatientPanel() {
        initComponents();
    }

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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(380, 380));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204,255,255,100));
        jPanel2.setForeground(new java.awt.Color(51, 255, 204));

        pp4.setBackground(new java.awt.Color(148, 180, 193));
        pp4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pp4.setForeground(new java.awt.Color(102, 0, 255));
        pp4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtPp4.setBackground(new java.awt.Color(204, 255, 204));
        txtPp4.setFont(new java.awt.Font("Dubai Light", 1, 19)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPp4)
                .addGap(114, 114, 114))
        );
        pp4Layout.setVerticalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp4Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(txtPp4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pp1.setBackground(new java.awt.Color(148, 180, 193));
        pp1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pp1.setForeground(new java.awt.Color(102, 0, 255));
        pp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtPp1.setBackground(new java.awt.Color(148, 180, 193));
        txtPp1.setFont(new java.awt.Font("Dubai Light", 1, 19)); // NOI18N
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
            .addGroup(pp1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtPp1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pp1Layout.setVerticalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPp1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pp3.setBackground(new java.awt.Color(148, 180, 193));
        pp3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pp3.setForeground(new java.awt.Color(102, 0, 255));
        pp3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtPp3.setBackground(new java.awt.Color(0, 0, 0));
        txtPp3.setFont(new java.awt.Font("Dubai Light", 1, 19)); // NOI18N
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
            .addGroup(pp3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtPp3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pp3Layout.setVerticalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtPp3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pp4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 50, 390, 240);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 39)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PATIENT PANEL");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 375, 45);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPp1MouseClicked
        AddPatient ap = new AddPatient();
        ap.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_txtPp1MouseClicked

    private void txtPp3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPp3MouseClicked
        DiagnosisSystem ds = new DiagnosisSystem();
        ds.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_txtPp3MouseClicked

    private void txtPp4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPp4MouseClicked
   DiagnosticDetails dd = new DiagnosticDetails();
        dd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_txtPp4MouseClicked

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
            java.util.logging.Logger.getLogger(PatientPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
