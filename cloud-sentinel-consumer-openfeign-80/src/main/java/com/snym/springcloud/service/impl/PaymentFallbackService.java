package com.snym.springcloud.service.impl;

import com.snym.springcloud.entities.Payment;
import com.snym.springcloud.result.CommonResult;
import com.snym.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/20 17:06
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> getById(Long id) {
        return new CommonResult<>(501,"服务降级返回,---PaymentFallbackService");
    }
}
