package com.ly.reservesp.entity;

import lombok.Data;

import java.util.Date;


/**
 *餐桌
 */
@Data
public class Dinnertable {

    /**
     *餐桌编号
     */
    private int tableId;

    /**
     *餐桌名称
     */
    private String tableName;

    /**
     *餐桌状态(0未预定 1已预定)
     */
    private String tableStatus;

    /**
     *商家(外键)
     */
    private merchants merchants;


}
