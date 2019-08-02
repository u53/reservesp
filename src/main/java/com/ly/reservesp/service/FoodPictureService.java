package com.ly.reservesp.service;

import com.ly.reservesp.entity.FoodPicture;
import lombok.Data;

import java.util.List;


public interface FoodPictureService {

    /**
     * 查询图片集合
     * @param FoodPicture
     * @return
     */
    public List<FoodPicture> FoodPictureList(FoodPicture FoodPicture);

}
