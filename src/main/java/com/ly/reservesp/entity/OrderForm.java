package com.ly.reservesp.entity;


import lombok.Data;

import java.util.Date;

@Data
public class OrderForm {
    /**
     *定单编号
     */
    private int orderId;
    /**
     *订单编码
     */
    private String orderFormCode;
    /**
     *订单时间
     */
    private Date orderTime;
    /**
     *订单状态
     */
    private int orderStatus;
    /**
     *食品信息编号
     */
    private FoodInformation   foodInformation;
    /**
     *总金额
     */
    private Double amount;
    /**
     *预约(外键)
     */
    private  Reservations  reservations;
    /**
     *商家(外键)
     */
    private merchants  merchants;

}
