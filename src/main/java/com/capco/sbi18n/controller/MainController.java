package com.capco.sbi18n.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@CrossOrigin
@Controller
public class MainController {
 
    @RequestMapping(value = "/{locale:en|fr|vi|th}/login2")
    public String login2(Model model) {
        return "login2";
    }
 
}