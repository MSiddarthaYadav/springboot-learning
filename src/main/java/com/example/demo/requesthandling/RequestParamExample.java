package com.example.demo.requesthandling;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamExample {

    @GetMapping("/details")
    public String details(@RequestParam int id) {

        return "Student ID is: " + id;
    }
}