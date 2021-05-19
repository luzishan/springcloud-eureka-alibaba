package com.snym.springcloud.service;

import com.snym.springcloud.result.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE",fallback = PaymentHystrixFallbackService.class)
public interface PaymentOpenfeignService {

    @GetMapping(value = "/provider/getById/{id}")
    CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/provider/getTimeout/{id}")
    CommonResult getTimeout(@PathVariable("id") Long id);
}
