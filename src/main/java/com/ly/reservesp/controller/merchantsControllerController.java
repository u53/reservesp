package com.ly.reservesp.controller;

import com.ly.reservesp.entity.merchants;
import com.ly.reservesp.service.merchantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class merchantsControllerController {

    @Autowired
    merchantsService ms;

    @RequestMapping("/login")
    public int merchantsCount(merchants merchants){

        return ms.merchantsCount(merchants);

    }

}
