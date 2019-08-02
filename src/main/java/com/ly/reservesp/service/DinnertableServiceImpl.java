package com.ly.reservesp.service;

import com.ly.reservesp.dao.DinnertableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DinnertableServiceImpl implements  DinnertableService {

    @Autowired
    DinnertableMapper dm;

}
