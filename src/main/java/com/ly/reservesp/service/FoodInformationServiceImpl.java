package com.ly.reservesp.service;


import com.ly.reservesp.dao.FoodInformationMapper;
import com.ly.reservesp.entity.FoodInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodInformationServiceImpl implements FoodInformationService {

    @Autowired
    FoodInformationMapper fim;

}
