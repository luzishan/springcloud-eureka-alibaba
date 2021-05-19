package com.snym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 主启动类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/11 17:35
 */
@SpringBootApplication
@EnableZuulProxy
public class CloudCommonZuul9527 {
    public static void main(String[] args) {
        SpringApplication.run(CloudCommonZuul9527.class,args);
    }
}
