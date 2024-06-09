package com.raymind.design.pattern.strategy;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: RayMind
 * @Date: 2024/6/9 0:57
 * @Description:
 */
@RestController
@RequestMapping("/strategy")
@AllArgsConstructor
public class StrategyController {
    private final CreateOrderStrategy createOrderStrategy;

    @GetMapping("/createOrder/{type}")
    public void createOrder(@PathVariable("type") OrderTypeEnum orderType)
    {
        OrderInterface order = createOrderStrategy.autoCreateOrder(orderType);
        order.createOrder();
    }
}
