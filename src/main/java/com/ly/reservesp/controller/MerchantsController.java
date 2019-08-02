package com.ly.reservesp.controller;

import com.ly.reservesp.entity.merchants;
import com.ly.reservesp.service.merchantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class MerchantsController {

    @Autowired
    merchantsService ms;

    /**
     * 登录入口
     *商家登录验证
     * @param merchants
     * @return
     */
    @RequestMapping("/login")
    public int merchantsCount(merchants merchants){

        merchants.setMerchantsName("cmx");
        merchants.setMergechantsPassword("778899");
        return ms.merchantsCount(merchants);

    }



}
