package com.example.configdriven.config;

import com.example.configdriven.engine.Engine;
import com.example.configdriven.engine.PetrolEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.example.configdriven")
public class AppConfig {

    @Bean
    @Primary
    public Engine engine() {
        return new PetrolEngine();
    }

    @Bean
    public String appName() {
        return "Config Driven Spring IOC";
    }
}
