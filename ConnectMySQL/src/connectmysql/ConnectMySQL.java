/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectmysql;

/**
 *
 * @author Ghufran Tripa
 */

 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.SQLException;
 import java.sql.Statement; 

public class ConnectMySQL {

    public static Connection con;
    public static Statement stm;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    try {
            String url ="jdbc:mysql://localhost/Coffee Shop";
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
    
   

