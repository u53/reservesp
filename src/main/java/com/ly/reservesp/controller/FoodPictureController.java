package com.ly.reservesp.controller;

import com.ly.reservesp.entity.FoodInformation;
import com.ly.reservesp.entity.FoodPicture;
import com.ly.reservesp.service.FoodPictureService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/FoodPicture")
public class FoodPictureController {


    @Autowired
    FoodPictureService fps;

    @RequestMapping("/foodPictureList")
    public List<FoodPicture> FoodPictureList(FoodPicture FoodPicture){
        //直接赋值报500
       // FoodPicture.getFoodInfo().setFoodInfoId(2);
        return fps.FoodPictureList(FoodPicture);

    }

}
