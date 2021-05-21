package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 主启动类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/21 16:33
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudSeataOrderService2001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudSeataOrderService2001.class, args);
    }
}
