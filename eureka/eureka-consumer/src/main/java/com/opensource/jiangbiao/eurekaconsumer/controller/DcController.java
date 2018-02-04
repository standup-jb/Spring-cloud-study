package com.opensource.jiangbiao.eurekaconsumer.controller;

import com.opensource.jiangbiao.eurekaconsumer.Service.ConsumerService;
import com.opensource.jiangbiao.eurekaconsumer.client.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {



    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DcClient dcClient;

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc(){

        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

    @GetMapping("/consumerFeign")
    public String dcFeign(){
        return dcClient.consumer();
    }

    @GetMapping("/consumerHystrix")
    public String dcHystrix(){
        return consumerService.consumer();
    }
}
