package com.ly.reservesp.controller;


import com.ly.reservesp.entity.Reservations;
import com.ly.reservesp.service.ReservationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Reservations")
public class ReservationsController {

    @Autowired
    ReservationsService rs;


    @RequestMapping("/ReservationsList")
    public List<Reservations> findInfo(Reservations reservations){


        return rs.findReservationsInfo(reservations);
    }
}
