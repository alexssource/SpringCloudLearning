package com.example.client.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @Value("${app.config.value}")
    private String configValue;

    @Value("${app.config.age}")
    private int configAge;


    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String show() {
        StringBuilder builder = new StringBuilder();
        builder.append("Config value: " + configValue + "<br/>");
        builder.append("Config age: " + configAge);
        return builder.toString();
    }

}
