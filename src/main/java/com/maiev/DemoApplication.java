package com.maiev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by maievshabu on 2018/5/24.
 */

@EnableDiscoveryClient
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args){
        SpringApplication.run(DemoApplication.class, args);
    }
}
