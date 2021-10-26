/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Ghufran Tripa
 */
@ManagedBean(name="product")
@SessionScoped
public class Product {
    
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public String add() {
        System.out.println("Product added: "+ this.getName());
        return "success";
    }
}
