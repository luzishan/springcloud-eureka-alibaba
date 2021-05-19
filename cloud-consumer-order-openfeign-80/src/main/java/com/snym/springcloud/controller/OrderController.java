package com.snym.springcloud.controller;

import com.snym.springcloud.entities.Payment;
import com.snym.springcloud.result.CommonResult;
import com.snym.springcloud.service.PaymentOpenfeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private PaymentOpenfeignService paymentOpenfeignService;

    @PostMapping("add")
    public CommonResult<Payment> insert(@RequestBody Payment payment) {
        return paymentOpenfeignService.addPayment(payment);
    }

    @GetMapping("getById")
    public CommonResult<Payment> getById(Long id) {
        return paymentOpenfeignService.getPaymentById(id);
    }

    @GetMapping("/getTimeout")
    public CommonResult getPaymentTimeout(Long id){
        return paymentOpenfeignService.getTimeout(id);
    }

}
