package com.ly.reservesp.controller;

import com.ly.reservesp.entity.FoodType;
import com.ly.reservesp.entity.sellingTime;
import lombok.Data;

/**
 * 食品信息
 */
@Data
public class FoodInformationController {

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
    private FoodType foodTypeId;
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
    private sellingTime sellingTimeId;
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
