package com.ly.reservesp.controller;

import com.ly.reservesp.entity.Dinnertable;
import com.ly.reservesp.service.DinnertableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Dinnertable")
public class DinnertableController {

    @Autowired
    DinnertableService ds;

    @RequestMapping("/dinnertableList")
    public List<Dinnertable> DinnertableList(Dinnertable Dinnertable){
        Dinnertable.setTableId(1);
        return ds.DinnertableList(Dinnertable);

    }
}
