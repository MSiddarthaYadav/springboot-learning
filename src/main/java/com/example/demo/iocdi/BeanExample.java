package com.example.demo.iocdi;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanExample {

    @Service
    public static class StudentService {

        public String student() {
            return "Student Bean Created";
        }
    }

    private final StudentService service;

    public BeanExample(StudentService service) {
        this.service = service;
    }

    @GetMapping("/bean")
    public String show() {
        return service.student();
    }
}