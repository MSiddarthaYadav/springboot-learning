package com.example.demo.iocdi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IoCExample {

    private final IoCCar car;

    public IoCExample(IoCCar car) {
        this.car = car;
    }

    @GetMapping("/ioc")
    public String show() {
        return car.drive();
    }
}