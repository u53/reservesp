package com.ly.reservesp.controller;

import com.ly.reservesp.entity.FoodType;
import com.ly.reservesp.entity.sellingTime;
import com.ly.reservesp.service.FoodInformationService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FoodInformationController {

    @Autowired
    FoodInformationService fis;


}
