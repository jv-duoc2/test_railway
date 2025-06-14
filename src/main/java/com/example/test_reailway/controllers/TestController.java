package com.example.test_reailway.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    
    @GetMapping("")
    public String saludar(){
        return "Hola, este es un test de Spring Boot en Railway!";
    }
}
