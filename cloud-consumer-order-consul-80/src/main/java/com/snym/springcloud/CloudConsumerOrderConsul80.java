package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/11 9:48
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerOrderConsul80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrderConsul80.class, args);
    }
}
