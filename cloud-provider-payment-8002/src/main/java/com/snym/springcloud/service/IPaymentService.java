package com.snym.springcloud.service;

import com.snym.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface IPaymentService {

    /**
     * @description: 新增
     * @param:  payment
     * @return: int
     * @author: lzs
     * @date: 2021/5/7 15:59
     */
    public int insert(Payment payment);

    /**
     * @description: 根据id查询
     * @param:  id
     * @return: com.snym.springcloud.entities.Payment
     * @author: lzs
     * @date: 2021/5/7 16:01
     */
    public Payment getById(@Param("id") Long id);
}
