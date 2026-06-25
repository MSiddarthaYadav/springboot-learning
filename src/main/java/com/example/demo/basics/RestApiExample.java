package com.example.demo.basics;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;  

@RestController
public class RestApiExample {

    @GetMapping("/get")
    public String getData() {
        return "Getting Data";
    }

    @PostMapping("/post")
    public String postData() {
        return "Data Added";
    }

    @PutMapping("/put")
    public String updateData() {
        return "Data Updated";
    }

    @DeleteMapping("/delete")
    public String deleteData() {
        return "Data Deleted";
    }
}