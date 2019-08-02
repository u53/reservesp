package com.ly.reservesp.controller;

import com.ly.reservesp.entity.sellingTime;
import com.ly.reservesp.service.sellingTimeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
    @RequestMapping("/sellingTime")
public class sellingTimeController {

    @Autowired
    sellingTimeService sts;


    /**
     * 查找预定时间段
     * @param sellingTime
     * @return 时间段集合
     */
    @RequestMapping("/sellingTimeList")
    public List<sellingTime> findSellingTime(sellingTime sellingTime){

        

        return sts.findSellingTime(sellingTime);
    }

}
