package com.test.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWOrldController {
    //HTTP Get Request
    //http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String helloWOrld() {
        return "Hello World...!";
    }
}
