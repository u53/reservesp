package com.ly.reservesp.service;

import com.ly.reservesp.dao.OrderFormMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderFormServiceImpl implements  OrderFormService {

    @Autowired
    OrderFormMapper ofm;

}
