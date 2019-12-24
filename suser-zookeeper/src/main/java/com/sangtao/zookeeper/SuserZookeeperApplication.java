package com.sangtao.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SuserZookeeperApplication {
    public static void main(String[] args) {
        SpringApplication.run(SuserZookeeperApplication.class,args);
    }
}
