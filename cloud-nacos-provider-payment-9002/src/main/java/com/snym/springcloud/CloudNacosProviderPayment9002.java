package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/12 11:08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudNacosProviderPayment9002 {
    public static void main(String[] args) {
        SpringApplication.run(CloudNacosProviderPayment9002.class, args);
    }
}
