package com.opensource.jiangbiao.eurekaclient.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc(){
        String services = "Services: "+discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
