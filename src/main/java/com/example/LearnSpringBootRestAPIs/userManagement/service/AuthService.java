package com.example.LearnSpringBootRestAPIs.userManagement.service;

import com.example.LearnSpringBootRestAPIs.userManagement.dto.LoginRequestDto;

public interface AuthService {
    String login(LoginRequestDto loginRequestDto);
}
