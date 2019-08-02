package com.ly.reservesp.service;


import com.ly.reservesp.dao.FoodTypeMapper;
import com.ly.reservesp.entity.FoodType;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodTypeServiceImpl implements  FoodTypeService{

    @Autowired
    FoodTypeMapper ftm;

    @Override
    public List<FoodType> foodTypeList() {
        return ftm.foodTypeList();
    }
}
