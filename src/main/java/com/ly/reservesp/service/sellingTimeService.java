package com.ly.reservesp.service;

import com.ly.reservesp.entity.sellingTime;
import lombok.Data;

import java.util.List;


public interface sellingTimeService {
    /**
     * 查找预定时间段
     * @param sellingTime
     * @return 时间段集合
     */
    public List<sellingTime> findSellingTime(sellingTime sellingTime);


}
