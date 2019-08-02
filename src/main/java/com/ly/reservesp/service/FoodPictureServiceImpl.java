package com.ly.reservesp.service;


import com.ly.reservesp.dao.FoodPictureMapper;
import com.ly.reservesp.entity.FoodPicture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodPictureServiceImpl implements FoodPictureService{

    @Autowired
    FoodPictureMapper fpm;

    /**
     * 查询图片路径集合
     * @param FoodPicture
     * @return 返回图片路径集合
     */
    @Override
    public List<FoodPicture> FoodPictureList(FoodPicture FoodPicture) {
        return fpm.FoodPictureList(FoodPicture);
    }
}
