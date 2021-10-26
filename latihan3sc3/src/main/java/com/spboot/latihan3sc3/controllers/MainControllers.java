/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.latihan3sc3.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Ghufran Tripa
 */
public class MainControllers {
      @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/hello")
    public String hello(
            @RequestParam(value="name", required=false) String name, 
            Model model
    ) {
        model.addAttribute("name", name);
        return "hello";
    }
}
