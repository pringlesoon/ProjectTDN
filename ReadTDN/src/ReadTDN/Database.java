package ReadTDN;

import java.sql.*;
import java.util.ArrayList;
/*import java.util.logging.Level;
import java.util.logging.Logger;*/

public class Database { //Kelas & Objek

    Database database;

    public Connection conn; //Kelas & Objek, adalah objek yang mewakili koneksi ke database.

    //SEMUA FORM YANG INSTANTIATE CLASS INI (Database) BISA MENGAKSES 3 VARIABLE DIBAWAH INI.
    public static String loggedInUser = ""; //Enkapsulasi, HARUS STATIC KARENA DIPAKAI DI BANYAK CLASS LAIN.
    public static String loggedInNamaUser = ""; //Enkapsulasi, HARUS STATIC KARENA DIPAKAI DI BANYAK CLASS LAIN.
    public static String role = ""; //Enkapsulasi, HARUS STATIC KARENA DIPAKAI DI BANYAK CLASS LAIN.

    public void Database() { //Constructor:
        /*try {
            Class.forName("com.mysql.jdbc.Driver"); //Kelas ini menggunakan JDBC untuk berkomunikasi dengan database MySQL, dengan mengandalkan driver com.mysql.jdbc.Driver 
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/readtdn", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        connectDatabase();
        
    }

    public boolean connectDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/readtdn", "root", "");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ResultSet getRS(String sql) { //Result Set
        try {
            if (conn == null) {
                connectDatabase();
            }

            Statement st = this.conn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException err) {
            err.printStackTrace();
            return null;
        }
    }

    public boolean Execute(String sql) { //Method ini mengeksekusi pernyataan SQL seperti INSERT, UPDATE, atau DELETE, dan mengembalikan true jika satu atau lebih record dipengaruhi oleh pernyataan tersebut.
        try {
            if (conn == null) {
                connectDatabase();
            }

            Statement st = this.conn.createStatement();
            int numberOfAffectedRecord = st.executeUpdate(sql);
            return numberOfAffectedRecord == 1;
        } catch (SQLException err) {
            System.out.println(err.getMessage());
            return false;
        }
    }

    public String getSettingValue(String namaParam) {
        String hasil = "";
        try {
            String sql = "SELECT nilai_param FROM setting WHERE nama_param = '" + namaParam + "'";
            ResultSet rs = (ResultSet) this.getRS(sql);
            rs.next();
            hasil = rs.getString("nilai_param");
        } catch (Exception e) {
        }
        return hasil;
    }

    /*Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/readtdn", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    Database getDatabase() {
        if (database == null) {
            database = this;
        }
        return database;
    }

    com.mysql.jdbc.PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

}

//Kelas Database ini menunjukkan penggunaan dasar dari konsep-konsep OOP untuk mengelola koneksi database dan eksekusi query SQL di dalam aplikasi Java.
