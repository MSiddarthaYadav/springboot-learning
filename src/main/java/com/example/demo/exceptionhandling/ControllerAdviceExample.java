package com.example.demo.exceptionhandling;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAdviceExample {

    @GetMapping("/advice/{a}/{b}")
    public String divide(@PathVariable int a,
                         @PathVariable int b) {

        int result = a / b;

        return "Result = " + result;
    }
}