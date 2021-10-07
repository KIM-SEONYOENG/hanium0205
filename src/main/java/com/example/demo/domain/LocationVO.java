package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class LocationVO {
    private long _lid;
    private BigDecimal lan;
    private BigDecimal lat;
    private String address;
    private String dt;
    private int num;
    private long _uid;
}
