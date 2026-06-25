package com.example.demo.basics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Rest Controller";
    }
}