package com.mjduan.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by duan on 2017/4/26.
 */
@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class HelloWorldClient {

    @FeignClient(name = "HelloWorld")
    interface TheClient{
        @RequestMapping(path = "/hello")
        @ResponseBody
        String hello();
    }

    @Autowired
    private TheClient theClient;

    public String hello(){
        System.out.println("consumer:hello method");
        return theClient.hello();
    }

}
