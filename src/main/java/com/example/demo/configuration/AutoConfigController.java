package com.example.demo.configuration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoConfigController {

    @GetMapping("/auto")
    public String show() {
        return "Spring Boot Auto-Configuration Working!";
    }
}