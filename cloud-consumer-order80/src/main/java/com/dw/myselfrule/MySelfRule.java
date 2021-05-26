package com.dw.myselfrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dw
 * @date 2021/5/25 14:57
 * @Description
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule  getRandomRule(){
        return new RandomRule();
    }
}
