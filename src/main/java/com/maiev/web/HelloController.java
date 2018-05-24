package com.maiev.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maievshabu on 2018/5/23.
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Value("${book.name}")
    private String name;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/hello")
    public String hello(){
        ServiceInstance serviceInstance = client.getLocalServiceInstance();
        logger.info("/hello,host:" + serviceInstance.getHost() + " ,service_id:" + serviceInstance.getServiceId());
        return "hello world" + name;
    }
}
