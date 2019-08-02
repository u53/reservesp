package com.ly.reservesp.controller;

import com.ly.reservesp.service.sellingTimeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class sellingTimeController {

    @Autowired
    sellingTimeService sts;

}
