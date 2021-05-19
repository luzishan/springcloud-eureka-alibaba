package com.snym.springcloud.controller;

import com.snym.springcloud.entities.Payment;
import com.snym.springcloud.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * 订单controller
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/7 16:34
 */
@RestController
@RequestMapping("order")
public class OrderController {

    //根据服务名称获取
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE/provider";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("add")
    public CommonResult<Payment> insert(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/add", payment, CommonResult.class);
    }

    @GetMapping("getById")
    public CommonResult<Payment> getById(Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/getById/" + id, CommonResult.class);

    }

}
