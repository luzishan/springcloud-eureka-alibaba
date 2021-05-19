package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/10 16:42
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudProviderPaymentZK8003 {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPaymentZK8003.class, args);
    }
}
