package com.ly.reservesp.controller;


import com.ly.reservesp.entity.FoodType;
import com.ly.reservesp.service.FoodTypeService;
import lombok.Data;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/FoodType")
public class FoodTypeController {

    @Autowired
    FoodTypeService fts;

    @RequestMapping("/foodTypeList")
    public List<FoodType> foodTypeList(){

        return fts.foodTypeList();
    }

}
