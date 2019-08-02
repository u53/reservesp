package com.ly.reservesp.service;


import com.ly.reservesp.dao.BennerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BennerServiceImpl implements BennerService {

    @Autowired
    BennerMapper bm;
}
