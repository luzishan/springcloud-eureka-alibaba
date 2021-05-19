package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lzs
 * @version 1.0
 * @date 2021/5/7 17:07
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer7001 {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7001.class, args);
    }
}
