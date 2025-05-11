package unihealthmanagementsystem;

import static java.lang.System.exit;
import unihealthmanagementsystem.User.Login;

public class LoadingWindow extends javax.swing.JFrame {
    
    // Constructor
    public LoadingWindow() throws InterruptedException {
        initComponents();
    }
    
    // Swing Generated Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        lblClose = new javax.swing.JLabel();
        proLoad = new javax.swing.JProgressBar();
        lblPic = new javax.swing.JLabel();
        lblLoad = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loading Window");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(552, 360));
        setResizable(false);
        getContentPane().setLayout(null);

        lblClose.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setText("X");
        lblClose.setToolTipText("Close");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        getContentPane().add(lblClose);
        lblClose.setBounds(520, 10, 20, 30);

        proLoad.setBackground(new java.awt.Color(255, 255, 255));
        proLoad.setFont(new java.awt.Font("Segoe Print", 0, 10)); // NOI18N
        proLoad.setForeground(new java.awt.Color(101, 119, 168));
        proLoad.setPreferredSize(new java.awt.Dimension(146, 10));
        getContentPane().add(proLoad);
        proLoad.setBounds(-10, 314, 590, 10);
        ;

        lblPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/loading....png"))); // NOI18N
        getContentPane().add(lblPic);
        lblPic.setBounds(0, -10, 552, 370);

        lblLoad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblLoad.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(lblLoad);
        lblLoad.setBounds(10, 310, 230, 20);

        setSize(new java.awt.Dimension(550, 356));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // lblCloseMouseClicked Mouse Event
    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        
        exit(0);
        
    }//GEN-LAST:event_lblCloseMouseClicked

    // Main Method
    public static void main(String args[]) throws InterruptedException {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        LoadingWindow loadingWindow = new LoadingWindow();
        java.awt.EventQueue.invokeLater(() -> {
            loadingWindow.setVisible(true);
        });
        
        try {
            for(int i = 0; i <= 100; i+=2){
                if(i <= 25){
                    Thread.sleep(150);
                    loadingWindow.proLoad.setValue(i);
                    loadingWindow.lblLoad.setText("Initializing...   " + i + " %");
                } 
                else if(i >= 50 && i <= 75){
                    Thread.sleep(60);
                    loadingWindow.proLoad.setValue(i);
                    loadingWindow.lblLoad.setText("Loading...   " + i + " %");
                } 
                else if(i > 75){
                    Thread.sleep(40);
                    loadingWindow.proLoad.setValue(i);
                    loadingWindow.lblLoad.setText("Bulding Components...   " + i + " %");
                }
            }
        } 
        catch (InterruptedException e) { }
        finally{
            Login login = Login.getInstance();
            login.setVisible(true);
            loadingWindow.setVisible(false);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblLoad;
    private javax.swing.JLabel lblPic;
    private javax.swing.JProgressBar proLoad;
    // End of variables declaration//GEN-END:variables
}
