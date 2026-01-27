package com.example.configdriven.vehicle;

import com.example.configdriven.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private final Engine engine;

    @Autowired
    public Car(@Qualifier("petrolEngine") Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}
