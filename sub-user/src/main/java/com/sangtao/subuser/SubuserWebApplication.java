package com.sangtao.subuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.sangtao.subuser.*","com.sangtao.*.api"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.sangtao.*.api")
public class SubuserWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(SubuserWebApplication.class, args);
    }
}
