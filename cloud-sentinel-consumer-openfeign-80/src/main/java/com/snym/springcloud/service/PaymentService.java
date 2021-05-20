package com.snym.springcloud.service;

import com.snym.springcloud.entities.Payment;
import com.snym.springcloud.result.CommonResult;
import com.snym.springcloud.service.impl.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "cloud-sentinel-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping("/provider/getById/{id}")
    CommonResult<Payment> getById(@PathVariable("id") Long id);
}
