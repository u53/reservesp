package com.ly.reservesp.controller;

import com.ly.reservesp.service.sellingTimeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class sellingTimeController {

    @Autowired
    sellingTimeService sts;

}
