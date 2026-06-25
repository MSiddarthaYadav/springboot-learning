package com.example.demo.iocdi;

import org.springframework.stereotype.Service;

@Service
public class IoCCar {

    private final IoCEngine engine;

    public IoCCar(IoCEngine engine) {
        this.engine = engine;
    }

    public String drive() {
        return engine.start();
    }
}