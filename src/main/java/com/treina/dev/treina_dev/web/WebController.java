package com.treina.dev.treina_dev.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    
    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(){
        return "perfil";
    }
}
