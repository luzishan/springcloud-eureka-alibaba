package com.snym.springcloud;

import com.snym.springcloud.ribbon.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 主启动类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/11 10:22
 */
@SpringBootApplication
@EnableEurekaClient
//对那个微服务进行负载均衡
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = RibbonConfig.class)
public class CloudConsumerOrderRibbon80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrderRibbon80.class, args);
    }
}
