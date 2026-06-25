package com.example.demo.iocdi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependencyInjection {

    private final Car car;

    public DependencyInjection(Car car) {
        this.car = car;
    }

    @GetMapping("/di")
    public String show() {
        return car.drive();
    }
}