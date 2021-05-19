package com.snym.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/13 15:49
 */
@RestController
@RequestMapping("config")
@RefreshScope
public class ConfigController {

    @Value("${spring.datasource.url}")
    private String configInfo;

    @GetMapping("/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
