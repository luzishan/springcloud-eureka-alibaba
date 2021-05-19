package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 主启动类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/8 9:10
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer7002 {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7002.class, args);
    }
}
