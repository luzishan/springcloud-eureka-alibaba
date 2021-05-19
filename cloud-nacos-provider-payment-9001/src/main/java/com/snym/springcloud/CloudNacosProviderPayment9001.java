package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * TODO
 *l
 * @author lzs
 * @version 1.0
 * @date 2021/5/12 11:08
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class CloudNacosProviderPayment9001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudNacosProviderPayment9001.class, args);
    }
}
