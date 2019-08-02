package com.ly.reservesp.service;

import com.ly.reservesp.entity.Dinnertable;

import java.util.List;

public interface DinnertableService {


    /**
     * 查询餐桌信息
     * @param Dinnertable
     * @return 返回餐桌信息 知道其是否预定 或者单独查询餐桌状态
     */
    public List<Dinnertable> DinnertableList(Dinnertable Dinnertable);

}
