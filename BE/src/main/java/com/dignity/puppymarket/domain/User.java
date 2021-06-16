package com.dignity.puppymarket.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id @GeneratedValue
    private Long id;

    private String email;
    private String password;
    private String nickname;
    private int bitCategory;
    private String imagePath;
    private String tel;
    private String si;
    private String gu;
}