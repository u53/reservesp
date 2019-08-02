package com.ly.reservesp.service;

import com.ly.reservesp.dao.DinnertableMapper;
import com.ly.reservesp.entity.Dinnertable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DinnertableServiceImpl implements  DinnertableService {

    @Autowired
    DinnertableMapper dm;

    /**
     * 实现餐桌查询
     * @param Dinnertable
     * @return 返回餐桌查询查询结果集合
     */
    @Override
    public List<Dinnertable> DinnertableList(Dinnertable Dinnertable) {
        return dm.DinnertableList(Dinnertable);
    }
}
