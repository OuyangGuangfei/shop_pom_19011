package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/tologin")
    public String tologin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(){
        return "index";
    }

}
