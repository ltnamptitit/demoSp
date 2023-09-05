package com.spcof.nam.controller;

// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
    @RequestMapping(value="/")
    public  String homePage(){
        return "home";
    }

    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String loginPage() {
        return "login";
    }
    
}
