package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Jiusen Guo
 * @date 2021/1/20 23:44
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService
{
    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "------PaymentHystrixService fall back-paymentInfo_OK, o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "------PaymentHystrixService fall back-paymentInfo_TimeOut, o(╥﹏╥)o";
    }
}
