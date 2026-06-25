package com.example.demo.iocdi;

import org.springframework.stereotype.Service;

@Service
public class Car {

    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public String drive() {
        return engine.start();
    }
}