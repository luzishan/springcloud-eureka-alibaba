package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lzs
 * @version 1.0
 * @date 2021/5/12 9:43
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudCommonGateway9527 {

    public static void main(String[] args) {
        SpringApplication.run(CloudCommonGateway9527.class, args);
    }
}
