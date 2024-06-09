package com.raymind.design.pattern.strategy;

import org.springframework.stereotype.Component;

/**
 * @Author: RayMind
 * @Date: 2024/6/9 0:51
 * @Description:
 */
@Component("RENEW")
public class RenewOrder implements OrderInterface {
    @Override
    public void createOrder() {
        System.out.println("创建续费订单");
    }
}
