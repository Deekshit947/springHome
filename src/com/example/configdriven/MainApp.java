package com.example.configdriven;

import com.example.configdriven.config.AppConfig;
import com.example.configdriven.vehicle.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = context.getBean(Car.class);
        car.drive();

//        String appName = context.getBean(String.class);
//        System.out.println(appName);
    }
}
