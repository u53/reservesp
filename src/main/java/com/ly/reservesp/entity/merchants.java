package com.ly.reservesp.entity;

import lombok.Data;

/**
 * 商家信息表
 */
@Data
public class merchants {

    /**
     * 商家编号
     */
    private int merchantsId;
    /**
     * 商家登录用户
     */
    private String merchantsName;
    /**
     * 商家登录密码
     */
    private String  mergechantsPassword;

}
