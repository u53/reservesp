package com.ly.reservesp.controller;

import com.ly.reservesp.entity.FoodInformation;
import lombok.Data;

/**
 * 食品图片
 */
@Data
public class FoodPictureController {

    /**
     *食品图片编号
     */
    private int pictureId;
    /**
     *食品图片路径
     */
    private String pictureUrl;
    /**
     *食品信息编号
     */
    private FoodInformation foodInfoId;

}
