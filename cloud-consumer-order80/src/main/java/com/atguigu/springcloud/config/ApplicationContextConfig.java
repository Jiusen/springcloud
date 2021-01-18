package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jiusen Guo
 * @date 2021/1/15 21:06
 */
@Configuration
public class ApplicationContextConfig
{
    @Bean
//    @LoadBalanced   //使用@LoadBalance注解赋予ResrTemplate负载均衡的能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
