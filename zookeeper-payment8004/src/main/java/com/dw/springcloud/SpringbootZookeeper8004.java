package com.dw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dw
 * @date 2021/5/24 17:42
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootZookeeper8004 {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootZookeeper8004.class,args);
    }
}
