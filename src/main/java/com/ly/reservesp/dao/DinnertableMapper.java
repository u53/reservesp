package com.ly.reservesp.dao;

import com.ly.reservesp.entity.Dinnertable;

import java.util.List;

public interface DinnertableMapper {

    /**
     * 查询餐桌信息
     * @param Dinnertable
     * @return 返回餐桌信息 知道其是否预定 或者单独查询餐桌状态
     */
    public List<Dinnertable> DinnertableList(Dinnertable Dinnertable);

}
