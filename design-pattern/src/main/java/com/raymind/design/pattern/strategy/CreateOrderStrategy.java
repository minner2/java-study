package com.raymind.design.pattern.strategy;

import lombok.AllArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author: RayMind
 * @Date: 2024/6/9 0:54
 * @Description:
 */
@Component
@AllArgsConstructor
public class CreateOrderStrategy {
    private final Map<String,OrderInterface> orderMap;

    public OrderInterface autoCreateOrder(OrderTypeEnum orderTypeEnum){
        return orderMap.get(orderTypeEnum.name());
    }
}
