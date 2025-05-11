package unihealthmanagementsystem.User;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import unihealthmanagementsystem.DbClass;
import unihealthmanagementsystem.oop.UniDReader;

public class DiagnosticDetails extends javax.swing.JFrame {
    
    // Objects, Variables and Instances
    DbClass dbClass = DbClass.getInstance();
    
    // Constructor
    public DiagnosticDetails() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\AdminIcoSm.png");
        this.setIconImage(img.getImage());
        fetchData();
    }
    
    // Creating Instance
    private static DiagnosticDetails instance = null;
    public static DiagnosticDetails getInstance() {
        if(instance == null)
            instance = new DiagnosticDetails();
        return instance;
    }
    
    // fetchData Method
    private void fetchData(){
        dbClass.Connect();
        ResultSet rs = dbClass.getDiaDetails();
        tblShow.updateUI();
        tblShow.setModel(DbUtils.resultSetToTableModel(rs));
    }

    // Swing Generated Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblShow = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diagnostic Details");
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setToolTipText("Click to View Details");

        tblShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Username", "Password", "Email", "Salary", "Address", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblShowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblShow);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 130, 980, 490);

        jPanel1.setBackground(new java.awt.Color(204,0,204,150));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/diagnosis_17085217.png"))); // NOI18N
        jLabel1.setText("DIAGNOSTIC DETAILS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 980, 40);

        btnBack.setBackground(new java.awt.Color(140, 180, 193));
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(50, 70, 90, 30);
        jPanel1.add(txtSearch);
        txtSearch.setBounds(630, 70, 250, 30);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/searcIco.png"))); // NOI18N
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(880, 70, 50, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 110);

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

    // btnSearchMouseClicked Mouse Event
    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        
        try{
            if(txtSearch.getText().equals("")){
                fetchData();
            } 
            else{
                dbClass.Connect();
                ResultSet res = dbClass.getDiaDetails(txtSearch.getText(), txtSearch.getText());
                if(res != null){
                    DefaultTableModel model = (DefaultTableModel)this.tblShow.getModel();
                    model.setRowCount(0);
                    tblShow.setModel(DbUtils.resultSetToTableModel(res));
                } 
                else if(res == null){
                    JOptionPane.showMessageDialog(null, "User not found");
                    fetchData();
                }
            } 
        } 
        catch(HeadlessException ex){ 
           JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_btnSearchMouseClicked

    // tblShowMouseClicked Mouse Event
    private void tblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowMouseClicked
        
        int index = tblShow.getSelectedRow();
        TableModel model = tblShow.getModel();
        String val1 = (String) model.getValueAt(index, 2);
        String val2 = (String) model.getValueAt(index, 9);
        UniDReader uniReader = UniDReader.getInstance();
        
      
    }//GEN-LAST:event_tblShowMouseClicked

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
            java.util.logging.Logger.getLogger(DiagnosticDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new DiagnosticDetails().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblShow;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
