package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jiusen Guo
 * @date 2021/1/22 0:33
 */
@Configuration
public class GateWayConfig
{
    /**
     * 配置了一个 id 为route-name的路由规则。
     *
     * 当访问地址 http://localhost:9527/guonei 时会自动转发到地址：http://news.baidu.com/guonei
     * @param builderuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builderuilder) {
        RouteLocatorBuilder.Builder routes = builderuilder.routes();

        routes.route("path_route_atguigu",
                r  -> r.path("/guonei")
                .uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }
}
