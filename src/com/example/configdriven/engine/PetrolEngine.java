package com.example.configdriven.engine;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("petrolEngine")
@Primary
@Scope("singleton")
public class PetrolEngine implements Engine {

    @Value("${petrol.engine.power:150}")
    private int power;

    public PetrolEngine() {
        System.out.println("PetrolEngine constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("PetrolEngine @PostConstruct | power = " + power);
    }

    @Override
    public void start() {
        System.out.println("Petrol Engine started with power " + power);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PetrolEngine @PreDestroy called");
    }
}
