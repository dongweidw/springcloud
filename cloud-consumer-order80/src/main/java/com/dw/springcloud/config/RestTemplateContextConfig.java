package com.dw.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author dw
 * @date 2021/5/20 19:57
 * @Description
 */
@Configuration
public class RestTemplateContextConfig {

    @Bean
    @LoadBalanced     //负载均衡注解
    public RestTemplate  getRestTemplate(){
        return new RestTemplate();
    }
}
