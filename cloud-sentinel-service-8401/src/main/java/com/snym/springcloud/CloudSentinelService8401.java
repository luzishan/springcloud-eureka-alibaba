package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 主启动类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/14 11:08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudSentinelService8401 {
    public static void main(String[] args) {
        SpringApplication.run(CloudSentinelService8401.class, args);
    }
}
