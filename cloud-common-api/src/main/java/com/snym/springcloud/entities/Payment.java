package com.snym.springcloud.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * 支付实体类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/7 15:47
 */
@Data
public class Payment implements Serializable {

    private Long id;

    private String serial;
}
