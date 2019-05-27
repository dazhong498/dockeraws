package com.dazhong.MyHelloWorld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/myWorld")
    public String myHello(){
        return "This is Hello World.";
    }
}
