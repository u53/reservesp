package com.ly.reservesp.service;


import com.ly.reservesp.dao.BennerMapper;
import com.ly.reservesp.entity.Benner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BennerServiceImpl implements BennerService {

    @Autowired
    BennerMapper bm;


    /**
     * 实现横幅查询
     * @return
     */
    @Override
    public List<Benner> bennerList() {
        return bm.bennerList();
    }
}
