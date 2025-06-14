package main.java.com.example.test_reailway.controllers;

@RestController
@RequestMapping("test")
public class TestController {
    
    @GetMapping("")
    public String saludar(){
        return "Hola, este es un test de Spring Boot en Railway!";
    }
}
