package com.ly.reservesp.service;

import com.ly.reservesp.dao.OrderFormMapper;
import com.ly.reservesp.entity.OrderForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderFormServiceImpl implements  OrderFormService {

    @Autowired
    OrderFormMapper ofm;

    @Override
    public List<OrderForm> findOrderFormInfo(OrderForm orderForm) {
        return ofm.findOrderFormInfo(orderForm);
    }
}
