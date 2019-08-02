package com.ly.reservesp.dao;

import com.ly.reservesp.entity.Benner;

import java.util.List;

public interface BennerMapper {

    /**
     * 查询横幅
     * @return返回横幅内容集合
     */
    public List<Benner> bennerList();

}
