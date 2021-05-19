package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/11 9:38
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudProviderPaymentConsul8004 {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPaymentConsul8004.class, args);
    }
}
