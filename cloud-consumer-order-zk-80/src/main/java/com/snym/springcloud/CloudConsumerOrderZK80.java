package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/10 16:53
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerOrderZK80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrderZK80.class, args);
    }
}
