/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import Model.ModelInventory;

/**
 *
 * @author KH
 */
public class InventoryController {
    public boolean create(ModelInventory model){
      try
      { 
        String sql = "INSERT INTO dbo.product (name, product_type, stock, "
                + "price, expired) values (?,?,?,?,?)";
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getName());
        map.put(2, model.getType());
        map.put(3, model.getStock());
        map.put(4, model.getPrice());        
        map.put(5, model.getExpired());
        MainController mc = new  MainController();
        boolean res = mc.preparedStatement(map, sql);
        return res;
      }
      catch(Exception e)
      {
          System.out.println(e.getMessage());
          return false;
      }
   }

   
}