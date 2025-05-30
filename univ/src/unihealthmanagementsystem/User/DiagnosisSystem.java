package unihealthmanagementsystem.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import unihealthmanagementsystem.DbClass;
import unihealthmanagementsystem.oop.*;

public class DiagnosisSystem extends javax.swing.JFrame{

    // Variable, Objects and Instances
    DbClass dbClass = DbClass.getInstance();
    Login login = Login.getInstance();
    private boolean flag;
    static String nameFor;
    private int hours=0, minutes=0, seconds=0;  
    private String timeString = ""; 
    private String[] a = new String[5];
    private ArrayList arr = new ArrayList();
    
    // Constructor
    public DiagnosisSystem() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\AdminIcoSm.png");
        this.setIconImage(img.getImage());
        fetchDatum();
        setPhy();
        new DigitalWatch();
        txtDate.setText(myDate());
      ;
        txtpid.disable();
        txtpid.setText("PID-" + atInitialize());
        flag = false;
        pDia.setVisible(false);
        txtGender.disable();
        txtPI.disable();
        txtPEmail.disable();
        txtPName.disable();
        txtBlood.disable();
        txtGender.disable();
        txtHandicap.disable();
        txtpsyco.disable();
        txtAge.disable();
        comD2.setVisible(false);
        comD3.setVisible(false);
        genNo();
    }
    
    // Creating Instance
    private static DiagnosisSystem instance = null;
    public static DiagnosisSystem getInstance() {
        if(instance == null)
            instance = new DiagnosisSystem();
        return instance;
    }
    
    // genNo method
    private String genNo(){
        return "Uni-" + atInitialize();
    }

    // setNameFor Method
    public static void setNameFor(String name){
        DiagnosisSystem.nameFor = name;
    }
    
    // atInitialize Method
    private String atInitialize(){
        dbClass.Connect();
        int resu = dbClass.returnResult("patientDiagnostic");
        return Integer.toString(resu);
    }
    
    // fetchDatum Method
    private void fetchDatum(){
        dbClass.Connect();
        ResultSet rs = dbClass.patientDetails();
        tblDet.updateUI();
        tblDet.setModel(DbUtils.resultSetToTableModel(rs));
    }

    // setPhy Method
    private void setPhy(){
       dbClass.Connect();
       ResultSet res = dbClass.SearchName(nameFor);
       if(res != null){
            try {
                res.first();
                txtPI.setText("PYID" + res.getString("ID"));
                txtPName.setText(res.getString("Username"));
                txtPEmail.setText(res.getString("Email"));
                a[0] = "PYID-" + res.getString("ID");
                a[1] = res.getString("Username");
                a[2] = res.getString("Email");
                a[3] = res.getString("Address");
                a[4] = res.getString("Mobile");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    } 
    
    // getAge Method
    private String getAge(String rs){
        if(rs != null){
            int year = Integer.parseInt(rs.split("/")[2]);
            LocalDate now = LocalDate.now();
            int nYear = now.getYear();
            String age = Integer.toString(nYear - year);
            return age;
        }
        return null;
    }
        
    // myDate Method
    private String myDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MMMM/yyyy");  
        Date date = new Date();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        String day = simpleDateformat.format(date);
        return day + ", " + formatter.format(date);
    }
    
    // arrayCheck Method
    private String arrayCheck(){
        int si = arr.size();
        String values;
        switch (si) {
            case 3:
                values = arr.get(0).toString()+ ", " + arr.get(1).toString()+ ",  "+ arr.get(2).toString();
                return values;
            case 2:
                values = arr.get(0).toString()+ ", " + arr.get(1).toString();
                return values;
            case 1:
                values = arr.get(0).toString();
                return values;
            default:
                break;
        }
        return null;
    }
    
    // bodyTemp Method
    private boolean bodyTemp(){
        String temp = btnDeg.getText();
        if(temp.equals("C")){
            if(Double.parseDouble(txtFever.getText()) < 34.5 || Double.parseDouble(txtFever.getText()) > 39.5){
                return false;
            } else{
                DecimalFormat df = new DecimalFormat("0.0");
                String fev = txtFever.getText();
                float f = Float.parseFloat(fev) * 9/5;
                f = f + 32;
                btnDeg.setText("F");
                txtFever.setText(df.format(f));
                return true;
            }
        } else if(temp.equals("F")){
            if(Double.parseDouble(txtFever.getText()) <= 94 || Double.parseDouble(txtFever.getText()) > 105){
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
    
    // splitUp Method
    private String splitUp(){
        String my;
        String s[] = txtRes.getText().split("\n");
        int a = s.length;
        my = s[0] + " ";
        for(int i = 1; i < a; i++){
            my += s[i] + " ";
        }
        return my;
    }
    
    // DigitalWatch inner class
    private class DigitalWatch implements Runnable{ 
        
        Thread t=null;  
        
        DigitalWatch(){
            t = new Thread(this);  
            t.start();  
        }  

        @Override
        public void run() {  
            try {  
                while (true) {  
                   String assign;
                   Calendar cal = Calendar.getInstance();  
                   hours = cal.get( Calendar.HOUR_OF_DAY );  
                   if(hours <= 12){
                       assign = "AM";
                   } else{
                       assign = "PM";
                   }
                   if ( hours > 12 ) hours -= 12;  
                   minutes = cal.get( Calendar.MINUTE );  
                   seconds = cal.get( Calendar.SECOND );  
                   SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
                   Date date = cal.getTime();  
                   timeString = formatter.format( date );
                   txtTime.setText("Time: " + timeString + " " + assign);
                   Thread.sleep( 1000 );  // interval given in milliseconds  
                }  
             }  
             catch (InterruptedException e) { }  
        } 
    } 

    // Swing Generated Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pDia = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFever = new javax.swing.JTextField();
        txtBlood = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtHandicap = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnDeg = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtpsyco = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnDiagnose = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        comCondition1 = new javax.swing.JComboBox<>();
        comD2 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSug = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRes = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        comD1 = new javax.swing.JComboBox<>();
        comD3 = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        pTbl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDet = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtPI = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPEmail = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        txtPName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtpid = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diagnosis System");
        setMinimumSize(new java.awt.Dimension(1400, 900));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(240,240,216,255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(null);

        pDia.setBackground(new java.awt.Color(240,240,216,255));
        pDia.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel9.setText("Temperature: ");
        pDia.add(jLabel9);
        jLabel9.setBounds(330, 50, 170, 40);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel10.setText(" Suggestions:");
        pDia.add(jLabel10);
        jLabel10.setBounds(30, 320, 140, 40);

        txtGender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pDia.add(txtGender);
        txtGender.setBounds(150, 130, 110, 40);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel11.setText("Condition:");
        pDia.add(jLabel11);
        jLabel11.setBounds(30, 50, 140, 40);

        txtFever.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pDia.add(txtFever);
        txtFever.setBounds(500, 50, 110, 40);

        txtBlood.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pDia.add(txtBlood);
        txtBlood.setBounds(490, 130, 70, 40);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel12.setText("Blood Group:");
        pDia.add(jLabel12);
        jLabel12.setBounds(320, 130, 170, 40);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel13.setText("Impairment");
        pDia.add(jLabel13);
        jLabel13.setBounds(630, 130, 140, 40);

        txtHandicap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pDia.add(txtHandicap);
        txtHandicap.setBounds(770, 130, 70, 40);

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtDate.setForeground(new java.awt.Color(204, 204, 255));
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pDia.add(txtDate);
        txtDate.setBounds(1000, 130, 270, 40);

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel14.setText("Date:");
        pDia.add(jLabel14);
        jLabel14.setBounds(910, 130, 90, 40);

        btnDeg.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btnDeg.setText("C");
        btnDeg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDegMouseClicked(evt);
            }
        });
        pDia.add(btnDeg);
        btnDeg.setBounds(610, 50, 50, 40);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel15.setText("Psycologically Fit:");
        pDia.add(jLabel15);
        jLabel15.setBounds(700, 50, 210, 40);

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel16.setText("Age :");
        pDia.add(jLabel16);
        jLabel16.setBounds(1110, 50, 70, 40);

        txtpsyco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pDia.add(txtpsyco);
        txtpsyco.setBounds(910, 50, 60, 40);

        txtAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pDia.add(txtAge);
        txtAge.setBounds(1180, 50, 90, 40);

        btnDiagnose.setBackground(new java.awt.Color(148, 180, 193));
        btnDiagnose.setText("Diagnose");
        btnDiagnose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDiagnoseMouseClicked(evt);
            }
        });
        pDia.add(btnDiagnose);
        btnDiagnose.setBounds(1160, 420, 120, 40);

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel17.setText("Gender:");
        pDia.add(jLabel17);
        jLabel17.setBounds(30, 130, 120, 40);

        comCondition1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Normal", "Worse", "Severe" }));
        pDia.add(comCondition1);
        comCondition1.setBounds(170, 50, 120, 40);

        comD2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Fever", "Flu", "Headace" }));
        comD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comD2ActionPerformed(evt);
            }
        });
        pDia.add(comD2);
        comD2.setBounds(370, 210, 180, 40);

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel18.setText("Disease:");
        pDia.add(jLabel18);
        jLabel18.setBounds(30, 210, 120, 40);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtSug.setColumns(20);
        txtSug.setRows(5);
        txtSug.setText("None");
        jScrollPane2.setViewportView(txtSug);

        pDia.add(jScrollPane2);
        jScrollPane2.setBounds(290, 280, 330, 120);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setEnabled(false);

        txtRes.setColumns(20);
        txtRes.setRows(5);
        jScrollPane3.setViewportView(txtRes);

        pDia.add(jScrollPane3);
        jScrollPane3.setBounds(940, 280, 340, 120);

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel19.setText("Diagnostic Results:");
        pDia.add(jLabel19);
        jLabel19.setBounds(710, 320, 250, 40);

        comD1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Fever", "Flu", "Headace" }));
        comD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comD1ActionPerformed(evt);
            }
        });
        pDia.add(comD1);
        comD1.setBounds(140, 210, 180, 40);

        comD3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Fever", "Flu", "Headace" }));
        comD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comD3ActionPerformed(evt);
            }
        });
        pDia.add(comD3);
        comD3.setBounds(590, 210, 180, 40);

        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        pDia.add(btnBack);
        btnBack.setBounds(1009, 420, 110, 40);

        jPanel2.add(pDia);
        pDia.setBounds(30, 270, 1320, 480);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblDet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Guardian", "Registration No.", "Gender", "Role", "Department", "Handicap", "Address", "Mobile", "Email", "Blood Group"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetMouseClicked(evt);
            }
        });
        tblDet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDetKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDet);
        if (tblDet.getColumnModel().getColumnCount() > 0) {
            tblDet.getColumnModel().getColumn(3).setHeaderValue("Registration No.");
            tblDet.getColumnModel().getColumn(5).setHeaderValue("Role");
        }

        javax.swing.GroupLayout pTblLayout = new javax.swing.GroupLayout(pTbl);
        pTbl.setLayout(pTblLayout);
        pTblLayout.setHorizontalGroup(
            pTblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTblLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pTblLayout.setVerticalGroup(
            pTblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTblLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(pTbl);
        pTbl.setBounds(70, 270, 1250, 430);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(10, 260, 1353, 10);

        jPanel5.setBackground(new java.awt.Color(240,240,255,255));
        jPanel5.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("NO.:");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(30, 30, 130, 30);

        txtPI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txtPI);
        txtPI.setBounds(140, 30, 70, 30);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Name:");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(290, 30, 80, 30);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText(" Email:");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(680, 30, 80, 30);

        txtPEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txtPEmail);
        txtPEmail.setBounds(770, 30, 190, 30);

        txtTime.setEditable(false);
        txtTime.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        txtTime.setForeground(new java.awt.Color(204, 204, 255));
        txtTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txtTime);
        txtTime.setBounds(990, 10, 290, 70);

        txtPName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txtPName);
        txtPName.setBounds(390, 30, 190, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(30, 20, 1310, 90);

        jPanel4.setBackground(new java.awt.Color(240,230,250,255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Diagnostic ID:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        txtpid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(txtpid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 90, 30));

        jPanel2.add(jPanel4);
        jPanel4.setBounds(30, 150, 290, 90);

        jPanel3.setBackground(new java.awt.Color(245,214,231,230));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Patient Name:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));

        btnCheck.setText("Check Info..");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });
        jPanel3.add(btnCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 130, 30));
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, 31));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(360, 160, 990, 75);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(10, 130, 1353, 10);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 1400, 800);

        jLabel2.setBackground(new java.awt.Color(240, 238, 56));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 60)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/diagnosis_17085217.png"))); // NOI18N
        jLabel2.setText("  DIAGNOSIS SYSTEM");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1390, 96);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // btnCheckActionPerformed Action Event
    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        
        if(txtName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fields are Mandatory");
        } 
        else if(flag == false){
            
            dbClass.Connect();
            ResultSet res = dbClass.findUsername(txtName.getText().trim(), "patientDetails");
            
            if(res != null){
                try {
                    
                    ResultSet res2 = dbClass.SearchName(txtName.getText(), "patientDetails");
                    
                    flag = true;
                    String age = getAge(res2.getString("Dob"));
                    txtName.disable();
                 
                    btnCheck.setText("Clear..");
                    pTbl.setVisible(false);
                    pDia.setVisible(true);
                    txtGender.setText(res2.getString("Gender"));
                    txtHandicap.setText(res2.getString("Handicap"));
                    txtpsyco.setText(res2.getString("isPsyFit"));
                    txtAge.setText(age + " Years");
                    txtBlood.setText(res2.getString("BloodGroup"));
                } 
                catch (SQLException ex) { 
                    System.out.println(ex.getCause());
                }
            } 
            else{
              
                int r = JOptionPane.showConfirmDialog(null, "Patient Name/Details not available \nDo you want to add Patient?");
                if(r == 0){
                    PatientPanel patientPanel = PatientPanel.getInstance();
                    patientPanel.setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                }
            }
        }
        else if(flag == true){
           
            txtName.enable();
         
            btnCheck.setText("Check Info..");
            flag = false;
            pTbl.setVisible(true);
            pDia.setVisible(false);
            txtBlood.setText("");
            txtGender.setText("");
            txtHandicap.setText("");
            txtFever.setText("");
            txtpsyco.setText("");
        }
        
    }//GEN-LAST:event_btnCheckActionPerformed

    // tblDetMouseClicked Mouse Event
    private void tblDetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetMouseClicked
        
        int index = tblDet.getSelectedRow();
        TableModel model = tblDet.getModel();
        String val1 = (String) model.getValueAt(index, 1);
        txtName.setText(val1);
     
        
    }//GEN-LAST:event_tblDetMouseClicked

    // tblDetKeyPressed Key Event
    private void tblDetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDetKeyPressed
        
        int index = tblDet.getSelectedRow();
        TableModel model = tblDet.getModel();
        String val1 = (String) model.getValueAt(index, 1);
        txtName.setText(val1);
 
        
    }//GEN-LAST:event_tblDetKeyPressed

    // btnDegMouseClicked Mouse Event
    private void btnDegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDegMouseClicked
        
        if(btnDeg.getText().trim().equals("C")){
            btnDeg.setText("F");
        } 
        else if(btnDeg.getText().trim().equals("F")){
            btnDeg.setText("C");
        }
        
    }//GEN-LAST:event_btnDegMouseClicked

    // btnDiagnoseMouseClicked Mouse Event
    private void btnDiagnoseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDiagnoseMouseClicked
        
        switch (btnDiagnose.getText()) {
            case "Diagnose":
                
                if(comCondition1.getSelectedItem().toString().equals("Select") || txtFever.getText().equals("") || comD1.getSelectedItem().toString().equals("Select")){
                    JOptionPane.showMessageDialog(null, "All fields are mandatory");
                } 
                else{
                    if(comCondition1.getSelectedItem().toString().equals("Select") || txtFever.getText().equals("") || comD1.getSelectedItem().toString().equals("Select")){
                        JOptionPane.showMessageDialog(null, "All fields are mandatory");
                    } 
                    else {
                        boolean fl = bodyTemp();
                        if(fl == false){
                            JOptionPane.showMessageDialog(null, "Please Enter a valid body temperature");
                        } 
                        else{
                            if(!comD1.getSelectedItem().toString().trim().equals("Select")){
                                arr.add(comD1.getSelectedItem());
                            } 
                            if(!comD2.getSelectedItem().toString().trim().equals("Select")){
                                arr.add(comD2.getSelectedItem());
                            } 
                            if(!comD3.getSelectedItem().toString().trim().equals("Select")){
                                arr.add(comD3.getSelectedItem());
                            }
                            DiseaseFinder diseaseFinder = new DiseaseFinder(comCondition1.getSelectedItem().toString(), txtFever.getText(), arr);
                            txtRes.setText(diseaseFinder.diagnoseResult());
                            btnDiagnose.setText("Save");
                            btnBack.setVisible(false);
                        }
                    }
                }   break;
            case "Save":
                dbClass.Connect();
                ResultSet res = dbClass.SearchName(txtName.getText());
                
                try {
                    String resStr = res.getString("Role");
                    switch (res.getString("Role").trim()) {
                        case "Student":
                        {
                            PhyInfo phyInfo = new PhyInfo(genNo(), a[0], a[1], a[2], a[3], a[4]);
                            Student student = new Student(res.getString("pName"), res.getString("GuardianName"), res.getString("RegistrationNo"), res.getString("Cnic"), res.getString("Mobile"), res.getString("Gender"), res.getString("Dob"), res.getString("Handicap"), res.getString("Address"), res.getString("Email"), res.getString("BloodGroup"), res.getString("Nationality"), res.getString("trackRecord"), res.getString("isPsyFit"), res.getString("Shift"), res.getString("JoiningDate"), res.getString("LandLine"), res.getString("hasMedIns"), res.getString("Department"), res.getString("isCivil"), res.getString("Semester"), res.getString("SemDuration"), res.getString("Days"), res.getString("SemFees"));
                            Diagnostic1 diagnostic1 = new Diagnostic1("PID-" + atInitialize(), comCondition1.getSelectedItem().toString(), arr,txtFever.getText(), txtSug.getText(), splitUp(), txtTime.getText(), txtDate.getText());
                            UniDWriter uniWriter = new UniDWriter();
                            uniWriter.StuWrite(phyInfo, student, diagnostic1);
                            dbClass.Connect();
                            dbClass.patientDiaDetails("PID-"+atInitialize(), txtName.getText(),  comCondition1.getSelectedItem().toString(), txtFever.getText(), arrayCheck(), txtDate.getText(), txtTime.getText(), resStr);
                            break;
                        }
                        case "Faculty":
                        {
                            PhyInfo phyInfo = new PhyInfo(genNo(), a[0], a[1], a[2], a[3], a[4]);
                            Faculty faculty = new Faculty(res.getString("pName"), res.getString("GuardianName"), res.getString("RegistrationNo"), res.getString("Mobile"),res.getString("Cnic"), res.getString("Gender"), res.getString("Dob"), res.getString("Handicap"), res.getString("Address"), res.getString("Email"), res.getString("BloodGroup"), res.getString("Nationality"), res.getString("trackRecord"), res.getString("isPsyFit"), res.getString("JoiningDate"), res.getString("LandLine"), res.getString("hasMedIns"), res.getString("Shift"), res.getString("Department"), res.getString("Post"), res.getString("Salary"));
                            Diagnostic1 diagnostic1 = new Diagnostic1("PID-" + atInitialize(), comCondition1.getSelectedItem().toString(), arr,txtFever.getText(), txtSug.getText(), splitUp(), txtTime.getText(), txtDate.getText());
                            UniDWriter uniWriter = new UniDWriter();
                            uniWriter.FacWrite(phyInfo, faculty, diagnostic1);
                            dbClass.Connect();
                            dbClass.patientDiaDetails("PID-"+atInitialize(), txtName.getText(), genNo(), comCondition1.getSelectedItem().toString(), txtFever.getText(), arrayCheck(), txtDate.getText(), txtTime.getText(), resStr);
                            break;
                        }
                        case "Worker":
                        {
                            PhyInfo PhyInfo = new PhyInfo(genNo(), a[0], a[1], a[2], a[3], a[4]);
                            Worker worker = new Worker(res.getString("pName"), res.getString("GuardianName"), res.getString("RegistrationNo"), res.getString("Cnic"), res.getString("Mobile"), res.getString("Gender"), res.getString("Dob"), res.getString("Handicap"), res.getString("Address"), res.getString("Email"), res.getString("BloodGroup"), res.getString("Nationality"), res.getString("trackRecord"), res.getString("isPsyFit"), res.getString("JoiningDate"), res.getString("LandLine"), res.getString("hasMedIns"), res.getString("Shift"), res.getString("work"), res.getString("Salary"));
                            Diagnostic1 diagnostic1 = new Diagnostic1("PID-" + atInitialize(), comCondition1.getSelectedItem().toString(), arr,txtFever.getText(), txtSug.getText(), splitUp(), txtTime.getText(), txtDate.getText());
                            UniDWriter uniWriter = new UniDWriter();
                            uniWriter.WorWrite(PhyInfo, worker, diagnostic1);
                            dbClass.Connect();
                            dbClass.patientDiaDetails("PID-"+atInitialize(), txtName.getText(), comCondition1.getSelectedItem().toString(), txtFever.getText(), arrayCheck(), txtDate.getText(), txtTime.getText(), resStr);
                            break;
                        }
                        default:
                            break;
                    }
                } 
                catch (SQLException ex) {
                    System.out.println(ex);
                }   btnDiagnose.setText("Exit");
                break;
            case "Exit":
                comCondition1.setSelectedIndex(0);
                txtFever.setText("");
                comD1.setSelectedIndex(0);
                comD2.setSelectedIndex(0);
                comD3.setSelectedIndex(0);
                txtFever.setText("");
                txtSug.setText("None");
                txtRes.setText("");
                btnBack.setVisible(true);
                btnDiagnose.setText("Diagnose");
           
                txtName.enable();
              
                btnCheck.setText("Check Info..");
                flag = false;
                pTbl.setVisible(true);
                pDia.setVisible(false);
                txtName.setText("");
           
                PatientPanel patientPanel = PatientPanel.getInstance();
                patientPanel.setVisible(true);
                this.setVisible(false);
                this.dispose();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnDiagnoseMouseClicked

    // comD1ActionPerformed Action Method
    private void comD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comD1ActionPerformed
        
        if(comD1.getSelectedItem().toString().trim().equals("Select")){
            comD2.setSelectedIndex(0);
            comD3.setSelectedIndex(0);
            comD2.setVisible(false);
            comD3.setVisible(false);
        } 
        else if(!comD1.getSelectedItem().toString().trim().equals("Select")){
            if(comD1.getSelectedIndex() == comD2.getSelectedIndex() || comD1.getSelectedIndex() == comD3.getSelectedIndex()){
                JOptionPane.showMessageDialog(null, "You cannot select previously selected field");
                comD1.setSelectedIndex(0);
            } 
            else {
                comD2.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_comD1ActionPerformed

    // comD2ActionPerformed Action Method
    private void comD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comD2ActionPerformed
        
        if(comD2.getSelectedItem().toString().trim().equals("Select")){
            comD3.setSelectedIndex(0);
            comD3.setVisible(false);
        } 
        else if(!comD2.getSelectedItem().toString().trim().equals("Select")){
            if(comD1.getSelectedIndex() == comD2.getSelectedIndex() || comD3.getSelectedIndex() == comD2.getSelectedIndex()){
                JOptionPane.showMessageDialog(null, "You cannot select previously selected field");
                comD2.setSelectedIndex(0);
            } 
            else {
                comD3.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_comD2ActionPerformed

    // comD3ActionPerformed Action Method
    private void comD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comD3ActionPerformed
       
        if(!comD2.getSelectedItem().toString().trim().equals("Select")){
            if(comD1.getSelectedIndex() == comD3.getSelectedIndex() || comD2.getSelectedIndex() == comD3.getSelectedIndex()){
                JOptionPane.showMessageDialog(null, "You cannot select previously selected field");
                comD3.setSelectedIndex(0);
            } 
            else {
                comD3.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_comD3ActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        
        comCondition1.setSelectedIndex(0);
        txtFever.setText("");
        comD1.setSelectedIndex(0);
        comD2.setSelectedIndex(0);
        comD3.setSelectedIndex(0);
        PatientPanel patientPanel = PatientPanel.getInstance();
        patientPanel.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_btnBackMouseClicked
    
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
            java.util.logging.Logger.getLogger(DiagnosisSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new DiagnosisSystem().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnDeg;
    private javax.swing.JButton btnDiagnose;
    private javax.swing.JComboBox<String> comCondition1;
    private javax.swing.JComboBox<String> comD1;
    private javax.swing.JComboBox<String> comD2;
    private javax.swing.JComboBox<String> comD3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pDia;
    private javax.swing.JPanel pTbl;
    private javax.swing.JTable tblDet;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBlood;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFever;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHandicap;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPEmail;
    private javax.swing.JTextField txtPI;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextArea txtRes;
    private javax.swing.JTextArea txtSug;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtpid;
    private javax.swing.JTextField txtpsyco;
    // End of variables declaration//GEN-END:variables
}
