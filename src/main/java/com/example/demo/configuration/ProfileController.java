package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    private final String message;

    public ProfileController(@Value("${app.message}") String message) {
        this.message = message;
    }

    @GetMapping("/profile")
    public String show() {
        return message;
    }
}