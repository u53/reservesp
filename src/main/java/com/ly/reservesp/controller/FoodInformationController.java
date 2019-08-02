package com.ly.reservesp.controller;

import com.ly.reservesp.entity.FoodInformation;
import com.ly.reservesp.entity.FoodType;
import com.ly.reservesp.entity.sellingTime;
import com.ly.reservesp.service.FoodInformationService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/FoodInformation")
public class FoodInformationController {

    @Autowired
    FoodInformationService fis;

    @RequestMapping("/list")
    public List<FoodInformation>  findFoodInfo(){


        return  fis.findFoodInfo();
    }





}
