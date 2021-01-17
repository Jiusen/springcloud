package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jiusen Guo
 * @date 2021/1/17 21:49
 */
@SpringBootApplication
@EnableDiscoveryClient          //该注解用于向consul或者zookeeper作为注册中心时注册服务
public class OrderZKMain80
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderZKMain80.class, args);
    }
}
