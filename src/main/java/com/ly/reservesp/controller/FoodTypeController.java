package com.ly.reservesp.controller;


import lombok.Data;

/**
 * 食品类别
 */
@Data
public class FoodTypeController {

    /**
     * 商品分裂Id
     */
    private int foodTypeId;

    /**
     * 商品类别
     */
    private String foodTypeName;

}
