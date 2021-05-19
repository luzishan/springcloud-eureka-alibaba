package com.snym.springcloud.service;

import com.snym.springcloud.result.CommonResult;
import org.springframework.stereotype.Component;

/**
 * 对失败的请求进行处理
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/11 16:11
 */
@Component
public class PaymentHystrixFallbackService implements PaymentOpenfeignService {

    @Override
    public CommonResult getPaymentById(Long id) {
        return new CommonResult(500, "获取支付信息失败", null);
    }

    @Override
    public CommonResult getTimeout(Long id) {
        return new CommonResult(500, "获取支付信息失败,原因是超时", null);
    }
}
