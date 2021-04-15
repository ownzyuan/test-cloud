package com.zy.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class HelloController {
    @PostMapping( "/hello")
    public String sayHello(){
        return "hello";
    }
}
