package com.ly.reservesp.dao;

import com.ly.reservesp.entity.FoodInformation;
import com.ly.reservesp.entity.sellingTime;
import lombok.Data;

import java.util.List;


public interface FoodInformationMapper {

    /**
     * 查找食品
     * @return 食品集合
     */
    public List<FoodInformation> findFoodInfo(FoodInformation FoodInformation);


}
