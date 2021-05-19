package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/13 15:48
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConfigNacosClient3377 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigNacosClient3377.class, args);
    }
}
