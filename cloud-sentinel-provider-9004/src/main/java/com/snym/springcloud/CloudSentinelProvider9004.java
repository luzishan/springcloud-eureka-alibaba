package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/20 14:09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudSentinelProvider9004 {
    public static void main(String[] args) {
        SpringApplication.run(CloudSentinelProvider9004.class, args);
    }
}
