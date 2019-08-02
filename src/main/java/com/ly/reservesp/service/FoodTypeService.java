package com.ly.reservesp.service;


import com.ly.reservesp.entity.FoodType;
import lombok.Data;

import java.util.List;


public interface FoodTypeService {

    /**
     * 查询商品类别
     * @return
     */
    public List<FoodType> foodTypeList();

}
