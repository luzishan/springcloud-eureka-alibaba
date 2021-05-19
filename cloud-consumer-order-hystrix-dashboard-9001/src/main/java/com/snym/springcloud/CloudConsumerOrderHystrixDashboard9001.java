package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 主启动类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/11 16:38
 */
@SpringBootApplication
@EnableHystrixDashboard
public class CloudConsumerOrderHystrixDashboard9001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrderHystrixDashboard9001.class,args);
    }
}
