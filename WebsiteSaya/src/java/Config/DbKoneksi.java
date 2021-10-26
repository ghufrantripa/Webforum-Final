/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Ghufran Tripa
 */
public class DbKoneksi {
   public static Connection  open()
            {
        
        
        try{
            String dbName = "cobacoba";
            String username = "root";
            String password = "";
            
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName+"?useSSL=false",username,password);
            
            Statement stm = con.createStatement();
            System.out.println("Berhasil");
                 return con;   
        }
        catch(SQLException e){
         return null;
            
        } catch (ClassNotFoundException ex) {
           Logger.getLogger(DbKoneksi.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
   }
}
