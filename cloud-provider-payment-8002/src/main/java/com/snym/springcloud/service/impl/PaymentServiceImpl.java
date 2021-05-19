package com.snym.springcloud.service.impl;

import com.snym.springcloud.mapper.PaymentMapper;
import com.snym.springcloud.service.IPaymentService;
import com.snym.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 支付业务实现类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/7 16:03
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int insert(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment getById(Long id) {
        return paymentMapper.getById(id);
    }
}
