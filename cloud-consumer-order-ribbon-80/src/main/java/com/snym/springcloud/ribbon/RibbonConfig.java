package com.snym.springcloud.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ribbon配置类,配合restTemplate使用时，restTemplate配置类要添加@LoadBalanced
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/11 10:30
 */
@Configuration
public class RibbonConfig {

    /**
     * 随机
     */
    //@Bean
    public IRule randomRule() {
        return new RandomRule();
    }

    @Bean
    public IRule roundRobinRule() {
        return new RoundRobinRule();
    }
}
