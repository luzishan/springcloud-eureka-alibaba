package com.snym.springcloud.controller;

import com.snym.springcloud.service.IPaymentService;
import com.snym.springcloud.entities.Payment;
import com.snym.springcloud.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * 支付controller
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/7 16:05
 */
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
            return new CommonResult(200, "新增支付成功！"+serverPort, insert);
        } else {
            return new CommonResult(500, "新增支付失败！"+serverPort, insert);
        }
    }

    @GetMapping("getById/{id}")
    public CommonResult<Payment> getById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getById(id);
        if (payment != null) {
            return new CommonResult(200, "查询支付成功！"+serverPort, payment);
        } else {
            return new CommonResult(500, "查询支付失败！"+serverPort, null);
        }
    }

    @GetMapping("getTimeout/{id}")
    public CommonResult<Payment> getTimeout(@PathVariable("id") Long id){
        Payment payment = paymentService.getById(id);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (payment != null) {
            return new CommonResult(200, "新增支付成功！" + serverPort, payment);
        } else {
            return new CommonResult(500, "新增支付失败！" + serverPort, payment);
        }
    }
}
