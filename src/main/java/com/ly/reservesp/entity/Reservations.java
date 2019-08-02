package com.ly.reservesp.entity;


import lombok.Data;

import java.util.Date;

@Data
public class Reservations {

    /**
     *预约编号
     */
    private int  reserveId;
    /**
     *预约人
     */
    private String  reserveName;
    /**
     *联系方式
     */
    private String tel;
    /**
     *餐桌(外键)
     */
    private Dinnertable  dinnertable ;
    /**
     *预约人数
     */
    private int reserveNum;
    /**
     *预约时间
     */
    private Date reserveTime;

}
