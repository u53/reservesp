package com.ly.reservesp.controller;


import com.ly.reservesp.service.OrderFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderFormController {

    @Autowired
    OrderFormService ofs;

}
