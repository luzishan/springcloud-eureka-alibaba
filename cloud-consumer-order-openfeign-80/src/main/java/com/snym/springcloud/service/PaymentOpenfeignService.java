package com.snym.springcloud.service;

import com.snym.springcloud.entities.Payment;
import com.snym.springcloud.result.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentOpenfeignService {

    @GetMapping(value = "/provider/getById/{id}")
    CommonResult getPaymentById(@PathVariable("id") Long id);

    @PostMapping (value = "/provider/add")
    CommonResult addPayment(@RequestBody Payment payment);

    @GetMapping(value = "/provider/getTimeout/{id}")
    CommonResult getTimeout(@PathVariable("id") Long id);
}
