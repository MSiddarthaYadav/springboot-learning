package com.example.demo.basics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestMappingExample {

    @RequestMapping("/home")
    public String home() {
        return "Request Mapping Working";
    }
}