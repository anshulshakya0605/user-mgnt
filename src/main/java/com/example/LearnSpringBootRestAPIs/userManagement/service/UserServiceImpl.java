package com.example.LearnSpringBootRestAPIs.userManagement.service;

import com.example.LearnSpringBootRestAPIs.userManagement.dto.UserReqDto;
import com.example.LearnSpringBootRestAPIs.userManagement.dto.UserResDto;
import com.example.LearnSpringBootRestAPIs.userManagement.entity.User;
import com.example.LearnSpringBootRestAPIs.userManagement.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResDto createUser(UserReqDto userReqDto){
        User user = new User();
        user.setName(userReqDto.getName());



        userRepository.save(user);

        UserResDto resDto = new UserResDto();
        resDto.setName(user.getName());


        return resDto;
    }
}
