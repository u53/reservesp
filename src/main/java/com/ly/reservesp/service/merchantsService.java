package com.ly.reservesp.service;

import com.ly.reservesp.entity.merchants;

public interface merchantsService {

    /**
     * 商家登录验证
     * @param merchants
     * @return
     */
    public int merchantsCount(merchants merchants);
}
