package com.ly.reservesp.service;

import com.ly.reservesp.dao.ReservationsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationsServiceImpl implements ReservationsService {

    @Autowired
    ReservationsMapper rm;

}
