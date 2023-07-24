package com.example.demo.sign.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class SiteUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true) // 중복된 값을 방지하려고
    private String username;
    private String password;

    @Column(unique = true)
    private String email;

    //private String code;


}
