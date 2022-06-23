/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author elias
 */
@Controller

public class HomeController {
    
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("mensaje", "El mundo es ancho y ajeno");
        return "index";
        
    }
    
}
