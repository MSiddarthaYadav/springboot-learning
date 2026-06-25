package com.example.demo.requesthandling;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableExample {

    @GetMapping("/student/{id}")
    public String student(@PathVariable int id) {

        return "Student ID is: " + id;
    }
}