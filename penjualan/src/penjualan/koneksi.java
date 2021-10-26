/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Ghufran Tripa
 */
public class koneksi {
   public static Connection con;
    public static Statement stm;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    try {
            String url ="jdbc:mysql://localhost/penjualan";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil; ");
        } catch (Exception e) {
            System.err.println("koneksi gagal-- " +e.getMessage());
        }
    }
}
