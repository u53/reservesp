package com.ly.reservesp.controller;

import lombok.Data;

/**
 * 订单时间状态
 */
@Data
public class sellingTimeController {

    /**
     * 食品时间段编号
     */
    private int sellingTimeId;

    /**
     * 售卖时间段名称
     */
    private String sellingTimeName;
}
