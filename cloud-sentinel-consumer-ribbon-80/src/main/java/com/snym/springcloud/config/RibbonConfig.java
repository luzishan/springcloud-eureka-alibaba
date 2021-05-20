package com.snym.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/20 14:25
 */
@Configuration
public class RibbonConfig {

    @Bean
    public IRule roundRobinRule(){
        return new RoundRobinRule();
    }
}
