package com.dw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author dw
 * @date 2021/5/23 16:45
 * @Description
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringBootEureka7002 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootEureka7002.class,args);
    }
}
