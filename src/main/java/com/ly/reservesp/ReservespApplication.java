package com.ly.reservesp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "com.ly.reservesp.dao")
public class ReservespApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservespApplication.class, args);
    }

}
