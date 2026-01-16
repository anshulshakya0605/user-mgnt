package com.example.LearnSpringBootRestAPIs.userManagement.service;

import com.example.LearnSpringBootRestAPIs.userManagement.dto.UserReqDto;
import com.example.LearnSpringBootRestAPIs.userManagement.dto.UserResDto;

public interface UserService {
    UserResDto createUser(UserReqDto userReqDto);
}
