package com.white.learn.param;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UserInfoParam {
    private String userId;
    @NotEmpty(message = "user name can not be empty")
    private String userName;
}
