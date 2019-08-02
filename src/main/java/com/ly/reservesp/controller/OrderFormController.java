package com.ly.reservesp.controller;


import com.ly.reservesp.entity.OrderForm;
import com.ly.reservesp.service.OrderFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderForm")
public class OrderFormController {

    @Autowired
    OrderFormService ofs;

    @RequestMapping("/OrderFormList")
    public List<OrderForm> findOrderFormInfo(OrderForm orderForm){

        //订单表赋值有问题
        orderForm.getReservations().setReserveId(1);

        return ofs.findOrderFormInfo(orderForm);
    }

}
