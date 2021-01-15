package com.atguigu.springcloud.config;

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
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
