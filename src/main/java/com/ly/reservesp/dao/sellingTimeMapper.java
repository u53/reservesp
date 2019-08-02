package com.ly.reservesp.dao;

import com.ly.reservesp.entity.sellingTime;
import lombok.Data;

import java.util.List;


public interface sellingTimeMapper {
    /**
     * 查找预定时间段
     * @param sellingTime
     * @return 时间段集合
     */
    public List<sellingTime> findSellingTime(sellingTime sellingTime);


}
