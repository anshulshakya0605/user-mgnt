package com.example.LearnSpringBootRestAPIs.userManagement.dto;


import lombok.Data;

@Data
public class LoginRequestDto {

    private String email;
    private String password;
}
