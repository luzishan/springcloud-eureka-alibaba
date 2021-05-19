package com.snym.springcloud.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一返回实体类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/5/7 15:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private int code;

    private String message;

    private T data;

    public CommonResult(int code, String message) {
        this(code, message, null);
    }
}
