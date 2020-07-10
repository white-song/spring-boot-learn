package com.white.learn.model;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserInfo {
    private String id;
    private String userName;
    private String userType;
    private String password;
    private String email;
    private int age;
    private Date regTime;
    private String state;
}
