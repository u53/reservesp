package com.ly.reservesp.controller;


import com.ly.reservesp.service.BennerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class bennerController {

    @Autowired
    BennerService bs;

}
