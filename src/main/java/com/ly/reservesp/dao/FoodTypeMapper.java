package com.ly.reservesp.dao;


import com.ly.reservesp.entity.FoodType;
import lombok.Data;

import java.util.List;


public interface FoodTypeMapper {

    /**
     * 查询商品类别
     * @return
     */
    public List<FoodType> foodTypeList();

}
