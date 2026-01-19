package com.example.LearnSpringBootRestAPIs.userManagement.dto;

import lombok.Data;

import java.util.Date;
@Data
public class UserReqDto {
    private String name;
    private String email;
    private String password;
    private String mobileNumber;
    private String address;
    private String gender;
    private String language;
}
