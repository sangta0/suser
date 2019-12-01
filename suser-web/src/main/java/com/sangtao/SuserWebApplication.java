package com.sangtao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@MapperScan(basePackages = "com.sangtao.dao")
@PropertySource(value = {"classpath:application.properties"},encoding="UTF-8")
/**
 * 原因：druid监控页面是一个servlet，需要让SpingBoot支持servlet.在程序入口添加注解
 */
@ServletComponentScan
public class SuserWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(SuserWebApplication.class, args);
	}
}
