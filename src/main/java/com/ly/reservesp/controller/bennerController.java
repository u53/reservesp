package com.ly.reservesp.controller;


import com.ly.reservesp.entity.Benner;
import com.ly.reservesp.service.BennerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Benner")
public class bennerController {

    @Autowired
    BennerService bs;

    @RequestMapping("/bennerList")
    public List<Benner> BennerList(){

        return bs.bennerList();

    }

}
