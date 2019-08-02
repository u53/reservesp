package com.ly.reservesp.service;


import com.ly.reservesp.dao.FoodPictureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodPictureServiceImpl implements FoodPictureService{

    @Autowired
    FoodPictureMapper fpm;

}
