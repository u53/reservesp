package com.ly.reservesp.service;

import com.ly.reservesp.dao.merchantsMapper;
import com.ly.reservesp.entity.merchants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class merchantsServiceImpl implements  merchantsService {

    @Autowired
    merchantsMapper mM;

    @Override
    public int merchantsCount(merchants merchants) {
        return mM.merchantsCount(merchants);
    }
}
