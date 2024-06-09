package com.raymind.design.pattern.strategy;

import org.springframework.stereotype.Component;

/**
 * @Author: RayMind
 * @Date: 2024/6/9 0:50
 * @Description:
 */
@Component("BUY")
public class BuyOrder implements OrderInterface {
    @Override
    public void createOrder() {
        System.out.println("创建新购订单");
    }
}
