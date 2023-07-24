package com.example.demo.register.repository;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Getter
@Setter
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 이게 무슨 코드일까?
    private Long id;
    private String name;
    private String discountRate;
    private String validPeriod;
    private String quantity;

    // 생성자, getter, setter 등 생략
}
