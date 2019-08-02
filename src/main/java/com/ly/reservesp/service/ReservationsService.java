package com.ly.reservesp.service;

import com.ly.reservesp.entity.Reservations;

import java.util.List;

public interface ReservationsService {

    /**
     * 查询预约信息
     * @param reservations 预约信息
     * @return 预约信息集合
     */
    public List<Reservations> findReservationsInfo(Reservations reservations);
}
