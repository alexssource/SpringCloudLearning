package com.example.client.config;


import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

public class ClientBean {

    @Value("${app.config.value}")
    private String configValue;

    @Value("${app.config.age}")
    private int configAge;


    @PostConstruct
    public void init() {
        System.out.println("Config value: " + configValue);
        System.out.println("Config age: " + configAge);
    }
}
