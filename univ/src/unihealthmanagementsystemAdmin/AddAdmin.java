package unihealthmanagementsystemAdmin;

import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import unihealthmanagementsystem.DbClass;

public class AddAdmin extends javax.swing.JFrame {
    
    // Objects, instances and variables
    DbClass dbClass = DbClass.getInstance();

    // Constructor
    public AddAdmin() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\LoginIcoSm.png");
        this.setIconImage(img.getImage());
    }
    
    // Creating Instance
    private static AddAdmin instance = null;
    public static AddAdmin getInstance() {
        if(instance == null)
            instance = new AddAdmin();
        return instance;
    }
    
    // Email Validation Method
    static boolean isEmailValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Admin");
        setMinimumSize(new java.awt.Dimension(380, 355));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jLabel3.setText("Enter Username:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 100, 140, 30);
        getContentPane().add(txtUser);
        txtUser.setBounds(170, 100, 180, 30);
        getContentPane().add(txtPass);
        txtPass.setBounds(170, 150, 180, 30);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(170, 200, 180, 30);

        jLabel5.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jLabel5.setText("Enter Email:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 200, 140, 30);

        jLabel4.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jLabel4.setText("Create Password:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 150, 140, 30);

        btnAdd.setBackground(new java.awt.Color(148, 180, 193));
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(240, 260, 90, 40);

        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(120, 260, 90, 40);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD ADMIN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 364, 55);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // btnBackMouseClicked Mouse Event
    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        
        AdminPanel adminPanel = AdminPanel.getInstance();
        adminPanel.setVisible(true);
        this.setVisible(false);
        txtEmail.setText("");
        txtPass.setText("");
        txtUser.setText("");
        this.dispose();
        
    }//GEN-LAST:event_btnBackMouseClicked

//    btnAddMouseClicked Mouse Event
    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
       
        dbClass.Connect();
        ResultSet rs = dbClass.findUsername(txtUser.getText(), "adminLogin");
        
        if(txtUser.getText().equals("") || txtPass.getText().equals("") || txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
        } 
        else if(rs != null){
                JOptionPane.showMessageDialog(null, "User alredy exist");
        } 
        else if(txtUser.getText() != ""){
            boolean value = isEmailValid(txtEmail.getText());
            if(!value){
                JOptionPane.showMessageDialog(null, "Please enter your email according to standards");
            } 
            else{
                boolean val = dbClass.addAdmin(txtUser.getText(), txtPass.getText(), txtEmail.getText());
                if (val) {
                    JOptionPane.showMessageDialog(null, "Error Adding data", "Error", JOptionPane.ERROR_MESSAGE);
                } 
                else{
                    JOptionPane.showMessageDialog(null, "Successfully added");
                    txtUser.setText("");
                    txtPass.setText("");
                    txtEmail.setText("");
                }
            }
        }
        
    }//GEN-LAST:event_btnAddMouseClicked

    // Main method
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new AddAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
