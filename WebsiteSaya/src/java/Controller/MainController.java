/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.DbKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

/**
 *
 * @author Ghufran Tripa
 */
public class MainController {
    public boolean preparedStatement(Map<Integer, Object> map, String sql){
        try
        {
            DbKoneksi dcon = new DbKoneksi();
            Connection con = dcon.open();
            PreparedStatement ps = con.prepareStatement(sql);
            
            for(Map.Entry<Integer, Object> entry : map.entrySet())
            {
                ps.setString(entry.getKey(), entry.getValue().toString());
            }
            
            int rows = ps.executeUpdate();
            System.out.println("Data Berhasil Tersimpan!!!");
            con.close();
            return rows !=0;
            
        }
        catch(SQLException e) {
    
        return false;
    }
    } 
}