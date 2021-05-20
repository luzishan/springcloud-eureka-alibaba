package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/20 14:08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudSentinelProvider9003 {
    public static void main(String[] args) {
        SpringApplication.run(CloudSentinelProvider9003.class, args);
    }
}
