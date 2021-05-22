package com.priyesh.mywebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FirstController {

    @RequestMapping("/home")
    public ModelAndView getWelcome(){
        ModelAndView view = new ModelAndView("welcome");
        return view;
        //return "Hello world";
    }

}
