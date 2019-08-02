package com.ly.reservesp.service;


import com.ly.reservesp.dao.sellingTimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class sellingTimeServiceImpl implements sellingTimeService{

    @Autowired
    sellingTimeMapper stm;

}
