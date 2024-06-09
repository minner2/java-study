package com.raymind.design.pattern.strategy;

import org.springframework.stereotype.Component;

/**
 * @Author: RayMind
 * @Date: 2024/6/9 0:52
 * @Description:
 */
@Component("UNSUBSCRIBE")
public class UnsubscribeOrder implements OrderInterface {
    @Override
    public void createOrder() {
        System.out.println("创建退订订单");
    }
}
