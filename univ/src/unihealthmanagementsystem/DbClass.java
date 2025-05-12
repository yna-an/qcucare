package unihealthmanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;

public class DbClass {

    // Variables and Objects
    private Connection conn = null;
    private Statement st = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    boolean flag = false;

    // Creating Instance
    private static DbClass instance = null;

    public static DbClass getInstance() {
        if (instance == null) {
            instance = new DbClass();
        }
        return instance;
    }

    public Connection Connect() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn = DriverManager.getConnection("jdbc:ucanaccess://src\\Databases\\healthSystemDatabase.accdb");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connection to Database Failed Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }

    public boolean loginUser(String name, String pass, String tblName) {
        String login = "SELECT * FROM '" + tblName + "' WHERE Username = '" + name + "' and Password = '" + pass + "'";
        try {
            ps = Connect().prepareStatement(login);
            rs = ps.executeQuery();
            if (rs.next()) {
                flag = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return flag;
    }

    public int returnResult(String tbl) {
        try {
            st = Connect().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * FROM " + tbl;
            rs = st.executeQuery(sql);
            String abc = null;
            rs.last();
            abc = rs.getString(2);
            String sl = abc.split("-")[1];
            int num = Integer.parseInt(sl);
            return num + 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }

    public ResultSet findUsername(String name, String tbl) {
        try {
            st = Connect().createStatement();
            String sql = "SELECT * FROM " + tbl;
            rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString(2).equals(name)) {
                    return rs;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public ResultSet findUsername(String name, String RegNo, String tbl) {
        try {
            st = Connect().createStatement();
            String sql = "SELECT * FROM " + tbl;
            rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString("pName").equals(name) && rs.getString("RegistrationNo").equals(RegNo)) {
                    return rs;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public ResultSet SearchName(String name, String tbl) {
        try {
            st = Connect().createStatement();
            String sql = "SELECT * FROM " + tbl + " WHERE username = '" + name + "'";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                return rs;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public ResultSet SearchName(String name, String reg, String tbl) {
        try {
            st = Connect().createStatement();
            String sql = "SELECT * FROM " + tbl + " WHERE pName = '" + name + "' and RegistrationNo = '" + reg + "'";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                return rs;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public ResultSet SearchName(String name) {
        try {
            st = Connect().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM userLogin WHERE Username = '" + name + "'";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                return rs;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public boolean addUser(String name, String password, String email,  String address, long mobile) {
        try {
            st = Connect().createStatement();
            String sql = "INSERT INTO userLogin(Username, Password, Email, Salary, Address, Mobile) "
                    + "VALUES('" + name + "','" + password + "','" + email + "','" + address + "','" + mobile + "')";
            int result = st.executeUpdate(sql);
            if (result > 1) {
                flag = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return flag;
    }

    public boolean addAdmin(String name, String password, String email) {
        try {
            st = Connect().createStatement();
            String sql = "INSERT INTO adminLogin(Username, Password, Email) "
                    + "VALUES('" + name + "','" + password + "','" + email + "')";
            int result = st.executeUpdate(sql);
            if (result > 1) {
                flag = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return flag;
    }

    public ResultSet sall() {

        try {
            st = Connect().createStatement();
            String sql = "SELECT * FROM patientDetails";
            rs = st.executeQuery(sql);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + " ");
            }
            System.out.println();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + " ");
                }
                System.out.println();
            }
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public boolean deleteUser(String name, String tblname) {
        try {
            st = Connect().createStatement();
            String sql = "DELETE FROM " + tblname + " WHERE Username = '" + name + "'";
            int result = st.executeUpdate(sql);
            if (result > 1) {
                flag = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return flag;
    }

    public ResultSet userDetails() {
        try {
            st = Connect().createStatement();
            String sql = "SELECT * FROM userLogin";
            rs = st.executeQuery(sql);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + " ");
            }
            System.out.println();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + " ");
                }
                System.out.println();
            }
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public boolean addPatient(String name, String guardian, String gender, String depart, String address, Long mobile, String email, String blood, String psy, String dob) {
        try {
            st = Connect().createStatement();
            String sql = "INSERT INTO patientDetails(pName, GuardianName, Gender, Department, Address, Mobile, Email, BloodGroup, isPsyFit, Dob, REGISTRATIONNO, HANDICAP, CNIC, NATIONALITY, TRACKRECORD, LANDLINE, HASMEDINS, ISCIVILSEMESTER, SEMDURATION, DAYS, SEMFEES, POST, SHIFT, SALARY, WORK)"
                    + "VALUES('" + name + "','" + guardian + "','" + gender + "','" + depart + "','" + address + "','" + mobile + "','" + email + "','" + blood + "','" + psy + "','" + dob + null +null +null +null +null +null +null +null +null +null +null +null +null +null +null +"')";
            int result = st.executeUpdate(sql);
            if (result > 1) {
                flag = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return flag;
    }

    public ResultSet patientDetails() {
        try {
            st = Connect().createStatement();
            String sql = "SELECT ID, pName, GuardianName,  RegistrationNo, Gender, Role, Department, Handicap, Address, Mobile, Email FROM patientDetails";
            rs = st.executeQuery(sql);
             ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + " ");
            }
            System.out.println();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + " ");
                }
                System.out.println();
            }
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public boolean patientDiaDetails(String pId, String name, String reg, String fId, String con, String fev, String dis, String date, String time, String role) {
        try {
            st = Connect().createStatement();
            String sql = "INSERT INTO patientDiagnostic(PatientId, uName, reg, FileId, Condition, Fever, Disease, Date1, Time, Role)"
                    + "VALUES('" + pId + "','" + name + "','" + reg + "','" + fId + "','" + con + "','" + fev + "','" + dis + "','" + date + "','" + time + "','" + role + "')";
            int result = st.executeUpdate(sql);
            if (result > 1) {
                flag = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return flag;
    }

    public ResultSet getDiaDetails() {
        try {
            st = Connect().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT ID, PatientId, FileId, uName, Fever, Disease, Date1, Time, Role FROM patientDiagnostic";
            rs = st.executeQuery(sql);
             ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + " ");
            }
            System.out.println();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + " ");
                }
                System.out.println();
            }
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public ResultSet getDiaDetails(String str, String reg) {
        try {
            st = Connect().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT ID, PatientId, FileId, uName, reg, Fever, Disease, Date1, Time FROM patientDiagnostic Where uName = '" + str + "' OR " + "reg ='" + reg + "'";
            rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    boolean addPatient(String text, String text0, String text1, String toString, String toString0, String text2, String toString1, String text3, long parseLong, String text4, String toString2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean addUser(String text, String text0, String text1, long mob) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean addPatient(String text, String text0, String text1, String toString, String student, String text2, String toString0, String text3, long parseLong, String text4, String toString1, String toString2, String toString3, String toString4, String join, String text5, String toString5, String toString6, String toString7, String toString8, Object object, Object object0, Object object1, String dob) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean addPatient(String text, String text0, String text1, String toString, String student, String text2, String toString0, String text3, long parseLong, String text4, String toString1, String toString2, String toString3, String toString4, String join, String toString5, String toString6, Object object, Object object0, Object object1, String dob) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean addPatient(String text, String text0, String text1, String toString, String worker, Object object, String toString0, String text2, long parseLong, String text3, String toString1, String toString2, String join, String text4, String toString3, Object object0, Object object1, Object object2, Object object3, String toString4, Object object4, Object object5, String text5, String work, String dob) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean addPatient(String text, String text0, String text1, String toString, String worker, Object object, String toString0, String text2, long parseLong, String text3, String toString1, String toString2, String join, String text4, String toString3, Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, String work, String dob) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean addPatient(String text, String text0, String text1, String toString, String faculty, String text2, String toString0, String text3, long parseLong, String text4, String toString1, String toString2, String toString3, String toString4, String join, String text5, String toString5, Object object, Object object0, Object object1, Object object2, String toString6, Object object3, String post, String text6, Object object4, String dob) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean addPatient(String text, String text0, String text1, String toString, String faculty, String text2, String toString0, String text3, long parseLong, String text4, String toString1, String toString2, String toString3, String join, String text5, String toString4, Object object, Object object0, Object object1, Object object2, String toString5, Object object3, String post, String text6, Object object4, String dob) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//    public boolean addPatient(String text, String text0, String toString, String text1, String text2, long parseLong, String text3, String toString0, String toString1, String dob) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    public void patientDiaDetails(String string, String text, String toString, String text0, String arrayCheck, String text1, String text2, String resStr) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void patientDiaDetails(String string, String text, String genNo, String toString, String text0, String arrayCheck, String text1, String text2, String resStr) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
