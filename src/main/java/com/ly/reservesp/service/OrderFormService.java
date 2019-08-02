package com.ly.reservesp.service;

import com.ly.reservesp.entity.OrderForm;

import java.util.List;

public interface OrderFormService {

    /**
     * 查看订单
     * @param orderForm 订单信息
     * @return
     */
    public List<OrderForm> findOrderFormInfo(OrderForm orderForm);

}
