package com.hz.security03.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

  /*  @RequestMapping("/login")

    public String login(){
        return "redirect:index.html";
    }*/


    @RequestMapping("/toMain")
    //根据角色判断
   /* @Secured("ROLE_abc")*/
    //执行之前判断 access表达式
    @PreAuthorize("hasRole('ROLE_abc')")
    public String login(){
        return "redirect:index.html";
    }

    @RequestMapping("/toError")
    public String error(){
        return "redirect:error.html";
    }

    @RequestMapping("/demo")
    public String demo(){
        return "redirect:demo.html";
    }

    @RequestMapping("/showLogin")
    public String showLogin(){
        return "login";
    }

    @RequestMapping("/showLogin")
    public String showLogin3(){
        return "login";
    }
}
