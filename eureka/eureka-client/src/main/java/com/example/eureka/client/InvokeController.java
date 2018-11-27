package com.example.eureka.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/invoke")
public class InvokeController {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/method", method = RequestMethod.GET)
    public String invokeMethod() {
        String url = "http://public-service/service/method";

        // Обратить внимание на аннотацию @LoadBalanced над бином RestTemplate
        String methodResult = restTemplate.getForObject(url, String.class);
        return "Result from public service: " + methodResult;
    }

}
