package com.example.mytabloid.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String indexPage(){
        return "index";
    }

    @GetMapping("/strid-ved-ambassaden")
    public String stridVedAmbassaden(){
        return "stridVedAmbassaden";
    }


    @GetMapping("/det-skal-hun-nu")
    public String detSkalHunNu(){
        return "detSkalHunNu";
    }

}
