package com.example.LearnSpringBootRestAPIs.userManagement.service;

import com.example.LearnSpringBootRestAPIs.userManagement.dto.UserReqDto;
import com.example.LearnSpringBootRestAPIs.userManagement.dto.UserResDto;
import com.example.LearnSpringBootRestAPIs.userManagement.entity.User;

import java.util.List;

public interface UserService {
    UserResDto createUser(UserReqDto userReqDto);

    List<UserResDto> getAllUsers();

    UserResDto getUserById(Long id);

    UserResDto updateUser(Long id, UserReqDto userReqDto);
    void deleteUser(Long id);
}
