package com.atguigu.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * @author Jiusen Guo
 * @date 2021/1/29 18:24
 */
public class CustomerBlockHandler
{
    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(4444,"按客户自定义， global handlerException----------1");
    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(4444,"按客户自定义， global handlerException----------2");
    }
}
