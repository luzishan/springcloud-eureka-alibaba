package com.snym.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.snym.springcloud.entities.Payment;
import com.snym.springcloud.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/20 14:28
 */
@RestController
@RequestMapping("/consumer")
public class OrderController {

    public static final String URL = "http://cloud-sentinel-provider/provider";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("getById/{id}")
    @SentinelResource(value = "fallback", fallback = "fallBackHandle", blockHandler = "blockHandler")
    public CommonResult<Payment> getById(@PathVariable("id") Long id) {
        int i = 1 / 0;
        CommonResult forObject = restTemplate.getForObject(URL + "/getById/" + id, CommonResult.class);
        return forObject;

    }

    public CommonResult<Payment> fallBackHandle(@PathVariable("id") Long id) {
        return new CommonResult<>(500, "fallBackHandle " + id, null);
    }

    public CommonResult<Payment> blockHandler(@PathVariable("id") Long id,BlockException exception) {
        return new CommonResult<>(600, "blockHandler " + id, null);
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
    public String testHotKey() {
        //int age = 10/0;
        return "------testHotKey";
    }

    //兜底方法
    public String deal_testHotKey(BlockException exception) {
        return "------deal_testHotKey,o(╥﹏╥)o";

    }
}
