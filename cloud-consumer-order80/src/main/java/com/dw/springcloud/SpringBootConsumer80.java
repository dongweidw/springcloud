package com.dw.springcloud;

import com.dw.myselfrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author dw
 * @date 2021/5/20 19:48
 * @Description
 */
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
@EnableEurekaClient
@SpringBootApplication
public class SpringBootConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsumer80.class,args);
    }
}
