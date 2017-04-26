package com.mjduan.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by duan on 2017/4/26.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("service-prodiver: hello method");
        return "Hello World!";
    }

}
