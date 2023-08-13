package com.unejsi.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showLoginPage")
    public String showLoginPage(){
        return "fancy-login";
    }

    @GetMapping("/leaders")
    public String showManagerPage(){
        return "manager-page";
    }

    @GetMapping("/systems")
    public String showAdminsPage(){
        return "admin-page";
    }

    @GetMapping("/access-denied")
    public String showAccessDeniedPage(){
        return "access-denied-page";
    }

}
