package com.raymind.design.pattern.strategy;

/**
 * @Author: RayMind
 * @Date: 2024/6/9 0:53
 * @Description:
 */
public enum OrderTypeEnum {
    BUY("buy", "购买订单"),
    RENEW("renew", "续费订单"),
    UNSUBSCRIBE("unsubscribe", "退订订单");

    private String code;
    private String desc;

    OrderTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }
}
