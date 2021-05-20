package com.snym.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.snym.springcloud.entities.Payment;
import com.snym.springcloud.result.CommonResult;
import com.snym.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/20 17:02
 */
@RestController
@RequestMapping("consumer")
public class OrderController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("getById/{id}")
    @SentinelResource(value = "fallback", fallback = "fallBackHandle", blockHandler = "blockHandler")
    public CommonResult<Payment> getById(@PathVariable("id") Long id) {
        return paymentService.getById(id);
    }

    public CommonResult<Payment> fallBackHandle(@PathVariable("id") Long id) {
        return new CommonResult<>(500, "fallBackHandle " + id, null);
    }

    public CommonResult<Payment> blockHandler(@PathVariable("id") Long id, BlockException exception) {
        return new CommonResult<>(600, "blockHandler " + id, null);
    }

}
