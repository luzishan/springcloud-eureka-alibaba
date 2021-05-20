package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * TODO
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/20 14:24
 */
@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(value = "cloud-sentinel-provider")
public class CloudSentinelConsumerRibbon80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudSentinelConsumerRibbon80.class, args);
    }
}
