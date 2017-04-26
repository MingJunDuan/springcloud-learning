package com.mjduan.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by duan on 2017/4/26.
 */
@RestController
public class GreetingController {
    @Autowired
    private HelloWorldClient helloWorldClient;

    @RequestMapping("/greeting")
    public String greeting(){
        System.out.println("greeting method");
        return helloWorldClient.hello();
    }
}
