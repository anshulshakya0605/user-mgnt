package com.example.LearnSpringBootRestAPIs.userManagement.service;

import com.example.LearnSpringBootRestAPIs.userManagement.dto.UserReqDto;
import com.example.LearnSpringBootRestAPIs.userManagement.dto.UserResDto;
import com.example.LearnSpringBootRestAPIs.userManagement.entity.User;
import com.example.LearnSpringBootRestAPIs.userManagement.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResDto createUser(UserReqDto userReqDto){
        User user = new User();
        user.setName(userReqDto.getName());
        user.setEmail(userReqDto.getEmail());
        user.setPassword(userReqDto.getPassword());
        user.setMobileNumber(userReqDto.getMobileNumber());
        user.setAddress(userReqDto.getAddress());
        user.setGender(userReqDto.getGender());
        user.setLanguage(userReqDto.getLanguage());
        user.setCreatedAt(new Date());
        user.setUpdatedAt(new Date());
        return mapToResDto(userRepository.save(user));
    }

    @Override
    public List<UserResDto> getAllUsers(){
        return userRepository.findAll().stream().map(this::mapToResDto).collect(Collectors.toList());
    }

    @Override
    public UserResDto getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(()->new RuntimeException("User not found"));
        return mapToResDto(user);
    }

    @Override
    public UserResDto updateUser(Long id, UserReqDto userReqDto) {
        User user = userRepository.findById(id).orElseThrow(()-> new RuntimeException("user not found"));
        user.setName(userReqDto.getName());
        user.setEmail(userReqDto.getEmail());
        user.setMobileNumber(userReqDto.getMobileNumber());
        user.setAddress(userReqDto.getAddress());
        user.setGender(userReqDto.getGender());
        user.setLanguage(userReqDto.getLanguage());
        user.setUpdatedAt(new Date());
        return mapToResDto(userRepository.save(user));
    }

    @Override
    public void deleteUser(Long id) {
        User user = userRepository.findById(id).orElseThrow(()-> new RuntimeException("user not found"));
        userRepository.delete(user);
    }


    // Entity -> Response Dto

    private UserResDto mapToResDto(User user){
        UserResDto userResDto = new UserResDto();
        userResDto.setName(user.getName());
        userResDto.setEmail(user.getEmail());
        userResDto.setMobileNumber(user.getMobileNumber());
        userResDto.setAddress(user.getAddress());
        userResDto.setGender(user.getGender());
        return userResDto;
    }
}
