package com.ly.reservesp.service;

import com.ly.reservesp.dao.ReservationsMapper;
import com.ly.reservesp.entity.Reservations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationsServiceImpl implements ReservationsService {

    @Autowired
    ReservationsMapper rm;

    @Override
    public List<Reservations> findReservationsInfo(Reservations reservations) {
        return rm.findReservationsInfo(reservations);
    }
}
