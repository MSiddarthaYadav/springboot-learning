package com.example.demo.iocdi;

import org.springframework.stereotype.Service;

@Service
public class Engine {

    public String start() {
        return "Engine Started";
    }
}