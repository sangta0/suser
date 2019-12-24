package com.sangtao.subuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.sangtao.*.api")
public class SubuserWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(SubuserWebApplication.class, args);
    }
}
