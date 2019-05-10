package com.codegym.DemoSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controllerHello {
    @GetMapping("/hello")
    public ModelAndView Hello(){
        return new ModelAndView("greeting","name","Word");
    }

}
