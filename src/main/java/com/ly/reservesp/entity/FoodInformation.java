package com.ly.reservesp.entity;

import lombok.Data;

/**
 * 食品信息
 */
@Data
public class FoodInformation {

    /**
     *食品信息编号
     */
    private int foodInfoId;
    /**
     *食品名称
     */
    private String foodInfoName;
    /**
     *食品价格
     */
    private double price;
    /**
     *会员价
     */
    private double memberPrice;
    /**
     *食品分类编号
     */
    private FoodType foodType;
    /**
     *食品描述
     */
    private String foodDescribe;
    /**
     *食品单位
     */
    private String foodUnit;
    /**
     *售卖时间(售卖时间表外键)
     */
    private sellingTime sellingTime;
    /**
     *食品状态(01)
     */
    private int foodStatus;
    /**
     *点菜数量
     */
    private int quantity;
    /**
     *售出数量
     */
    private int SellingCount;
    /**
     *图标路径
     */
    private String icouUrl;

}
