package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ojas/emps")
public class HelloController {
    
    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello to Ojas";
    }

 

}
