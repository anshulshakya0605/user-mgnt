package com.example.LearnSpringBootRestAPIs.userManagement.controller;

import com.example.LearnSpringBootRestAPIs.userManagement.dto.UserReqDto;
import com.example.LearnSpringBootRestAPIs.userManagement.dto.UserResDto;
import com.example.LearnSpringBootRestAPIs.userManagement.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @PostMapping()
    public ResponseEntity<UserResDto> createUser(@RequestBody UserReqDto userReqDto){
        userService
        return
    }
}
