package com.ly.reservesp.service;

import com.ly.reservesp.dao.merchantsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class merchantsServiceImpl implements  merchantsService {

    @Autowired
    merchantsMapper mM;


}
