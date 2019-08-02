package com.ly.reservesp.service;

import com.ly.reservesp.entity.FoodInformation;
import lombok.Data;

import java.util.List;


public interface FoodInformationService {

    public List<FoodInformation> findFoodInfo();
}
