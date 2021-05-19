package com.snym.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.snym.springcloud.entities.Payment;
import com.snym.springcloud.result.CommonResult;
import com.snym.springcloud.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * 支付controller
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/7 16:05
 */
@Slf4j
@RestController
@RequestMapping("/provider")
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("add")
    public CommonResult<Payment> insert(@RequestBody Payment payment) {
        int insert = paymentService.insert(payment);
        if (insert > 0) {
            return new CommonResult(200, "新增支付成功！" + serverPort, insert);
        } else {
            return new CommonResult(500, "新增支付失败！" + serverPort, insert);
        }
    }

    @GetMapping("getById/{id}")
    public CommonResult<Payment> getById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getById(id);
        if (payment != null) {
            return new CommonResult(200, "查询支付成功！" + serverPort, payment);
        } else {
            return new CommonResult(500, "查询支付失败！" + serverPort, null);
        }
    }

    @GetMapping("getTimeout/{id}")
    @HystrixCommand(fallbackMethod = "hystrixHandler",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),// 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),// 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")// 失败率达到多少后跳闸
    })
    public CommonResult<Payment> getTimeout(@PathVariable("id") Long id) {
        log.info("请求参数是："+id);
        Payment payment = paymentService.getById(id);
        if (payment != null) {
            return new CommonResult(200, "新增支付成功！" + serverPort, payment);
        } else {
            throw new RuntimeException("查询的数据不存在");
            //return new CommonResult(500, "新增支付失败！" + serverPort, payment);
        }
    }

    public CommonResult<Payment> hystrixHandler(@PathVariable("id") Long id) {
        return new CommonResult<>(500, "新增支付失败，hystrix处理失败请求！" + serverPort, null);
    }

    @GetMapping("getTimeout2/{id}")
    @HystrixCommand(fallbackMethod = "hystrixHandler2",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),// 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),// 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")// 失败率达到多少后跳闸
    })
    public CommonResult<Payment> getTimeout2(@PathVariable("id") Long id) {
        log.info("请求参数是："+id);
        Payment payment = paymentService.getById(id);
        if (payment != null) {
            return new CommonResult(200, "新增支付成功！" + serverPort, payment);
        } else {
            throw new RuntimeException("查询的数据不存在");
            //return new CommonResult(500, "新增支付失败！" + serverPort, payment);
        }
    }

    public CommonResult<Payment> hystrixHandler2(@PathVariable("id") Long id) {
        return new CommonResult<>(500, "新增支付失败，hystrix处理失败请求！" + serverPort, null);
    }
}
