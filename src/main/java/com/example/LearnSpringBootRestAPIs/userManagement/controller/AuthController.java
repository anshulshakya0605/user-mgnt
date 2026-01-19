package com.example.LearnSpringBootRestAPIs.userManagement.controller;

import com.example.LearnSpringBootRestAPIs.userManagement.dto.AuthResponseDto;
import com.example.LearnSpringBootRestAPIs.userManagement.dto.LoginRequestDto;
import com.example.LearnSpringBootRestAPIs.userManagement.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> login(@RequestBody LoginRequestDto loginRequestDto){
        String token = authService.login(loginRequestDto);
        return ResponseEntity.ok(new AuthResponseDto(token));
    }


}
