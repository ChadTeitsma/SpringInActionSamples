package com.springinaction.pizza.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping({"/", "/homepage"})
public class HomeController {

    public HomeController() {
        System.out.println("Loaded Home Controller");
    }

    @RequestMapping(method=GET)
    public String redirectToFlow() {
        return "redirect:/pizza-flow";
    }




}