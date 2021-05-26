package com.dw.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.dw.springcloud.dao")
public class PaymentSpringboot8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentSpringboot8001.class,args);
    }
}
