package com.example.LearnSpringBootRestAPIs.userManagement.dto;

import lombok.Data;

@Data
public class UserResDto {
    private String name;
    private String email;
    private String mobileNumber;
    private String address;
    private String gender;
}
