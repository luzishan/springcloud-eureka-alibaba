package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 主启动类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/11 16:05
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class CloudConsumerOrderOpenfeignHystrix80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrderOpenfeignHystrix80.class, args);
    }
}
