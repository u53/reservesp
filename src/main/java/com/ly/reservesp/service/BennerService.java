package com.ly.reservesp.service;

import com.ly.reservesp.entity.Benner;

import java.util.List;

public interface BennerService {

    /**
     * 查询横幅
     * @return返回横幅内容集合
     */
    public List<Benner> bennerList();

}
