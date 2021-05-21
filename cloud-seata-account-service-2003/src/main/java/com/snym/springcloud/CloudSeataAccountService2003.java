package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/21 16:28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudSeataAccountService2003 {
    public static void main(String[] args) {
        SpringApplication.run(CloudSeataAccountService2003.class, args);
    }
}
