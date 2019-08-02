package com.ly.reservesp.dao;

import com.ly.reservesp.entity.FoodPicture;
import lombok.Data;

import java.util.List;


public interface FoodPictureMapper {


    /**
     * 查询图片集合
     * @param FoodPicture
     * @return
     */
    public List<FoodPicture> FoodPictureList(FoodPicture FoodPicture);


}
