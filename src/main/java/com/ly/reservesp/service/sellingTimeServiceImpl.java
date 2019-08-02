package com.ly.reservesp.service;


import com.ly.reservesp.dao.sellingTimeMapper;
import com.ly.reservesp.entity.sellingTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class sellingTimeServiceImpl implements sellingTimeService{



    @Autowired
    sellingTimeMapper stm;

    /**
     * 查找预定时间段
     * @param sellingTime
     * @return 时间段集合
     */
    @Override
    public List<sellingTime> findSellingTime(sellingTime sellingTime) {
        return stm.findSellingTime(sellingTime);
    }
}
