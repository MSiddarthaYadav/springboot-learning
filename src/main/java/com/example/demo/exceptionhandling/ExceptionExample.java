package com.example.demo.exceptionhandling;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionExample {

    @GetMapping("/divide/{a}/{b}")
    public String divide(@PathVariable int a,
                         @PathVariable int b) {

        try {

            int result = a / b;

            return "Result = " + result;

        }

        catch (Exception e) {

            return "Cannot divide by zero";
        }

        finally {

            System.out.println("Request Completed");
        }
    }
}