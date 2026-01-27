package com.example.configdriven.engine;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("electricEngine")
@Scope("prototype")
public class ElectricEngine implements Engine {

    @Value("${electric.engine.voltage:400}")
    private int voltage;

    public ElectricEngine() {
        System.out.println("ElectricEngine constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("ElectricEngine @PostConstruct | voltage = " + voltage);
    }

    @Override
    public void start() {
        System.out.println("Electric Engine started with voltage " + voltage);
    }
}

