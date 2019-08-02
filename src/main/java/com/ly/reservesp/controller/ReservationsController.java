package com.ly.reservesp.controller;


import com.ly.reservesp.service.ReservationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReservationsController {

    @Autowired
    ReservationsService rs;

}
