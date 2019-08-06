package com.pruebadeconcepto.mtls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class UserController {

    @RequestMapping(value = "/user")
    public String user(Model model, Principal principal){

        return "user";
    }

}
