package com.example.LearnSpringBootRestAPIs.userManagement.service;

import com.example.LearnSpringBootRestAPIs.security.JwtUtil;
import com.example.LearnSpringBootRestAPIs.userManagement.dto.LoginRequestDto;
import com.example.LearnSpringBootRestAPIs.userManagement.entity.User;
import com.example.LearnSpringBootRestAPIs.userManagement.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService{

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final JwtUtil jwtUtil;

    @Override
    public String login(LoginRequestDto loginRequestDto) {
        User user = userRepository.findByEmail(loginRequestDto.getEmail())
                .orElseThrow(() -> new RuntimeException("Credentials invalid"));

        if (!passwordEncoder.matches(loginRequestDto.getPassword(),user.getPassword())){
            throw new RuntimeException("Credentials invalid");
        }
        return jwtUtil.generateToken(user.getEmail());
    }
}
