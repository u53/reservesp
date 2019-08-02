package com.ly.reservesp.service;


import com.ly.reservesp.dao.FoodTypeMapper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodTypeServiceImpl implements  FoodTypeService{

    @Autowired
    FoodTypeMapper ftm;

}
