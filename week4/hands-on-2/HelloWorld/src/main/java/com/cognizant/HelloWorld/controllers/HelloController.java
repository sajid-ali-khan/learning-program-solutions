package com.cognizant.HelloWorld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping("/")
    public String sayHome(){
        return "Nothing to see here. Try /hello instead.";
    }
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }
}
