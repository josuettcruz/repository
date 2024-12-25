/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ead.senac.tds.Projeto.controller;

import ead.senac.tds.Projeto.model.Data;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author josue
 */

@Controller
public class ControllerAll {
    
    @GetMapping("/index")
    public String Index(Model model){
        
        model.addAttribute("title", new Data().DataAbreviada());
        
        model.addAttribute("top", new Data().DataCompleta());
        
        return "index";
        
    }//Index(Model model)
    
    @GetMapping("/")
    public String RedirectIndex(){
        
        return "redirect:/index";
        
    }//Index(Model model)
    
}