package com.microorder.orderservice.ordermanager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
class OrderManagerConfiguration
{
    @Bean
    OrderManagerFacade orderManagerFacade(final OrderRepository orderRepository)
    {
        return new OrderManager(orderRepository);
    }
}
