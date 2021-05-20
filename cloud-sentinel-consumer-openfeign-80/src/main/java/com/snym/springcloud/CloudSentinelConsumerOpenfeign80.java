package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * TODO
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/20 16:55
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudSentinelConsumerOpenfeign80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudSentinelConsumerOpenfeign80.class, args);
    }
}
