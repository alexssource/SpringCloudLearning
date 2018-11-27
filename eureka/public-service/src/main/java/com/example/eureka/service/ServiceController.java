package com.example.eureka.service;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/service")
public class ServiceController {

    @RequestMapping(value = "/method", method = RequestMethod.GET)
    public String method() {
        return "method invoked";
    }

}
