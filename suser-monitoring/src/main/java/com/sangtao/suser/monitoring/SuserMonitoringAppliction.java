package com.sangtao.suser.monitoring;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableAdminServer

public class SuserMonitoringAppliction {
    public static void main(String[] args) {
        SpringApplication.run(SuserMonitoringAppliction.class,args);
    }
}
