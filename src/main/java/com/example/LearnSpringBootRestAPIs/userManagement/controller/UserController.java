package com.example.LearnSpringBootRestAPIs.userManagement.controller;

import com.example.LearnSpringBootRestAPIs.userManagement.dto.UserReqDto;
import com.example.LearnSpringBootRestAPIs.userManagement.dto.UserResDto;
import com.example.LearnSpringBootRestAPIs.userManagement.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @PostMapping()
    public ResponseEntity<UserResDto> createUser(@RequestBody UserReqDto userReqDto){

        return new ResponseEntity<>(userService.createUser(userReqDto), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<UserResDto>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResDto> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResDto> updateUser(@PathVariable Long id, @RequestBody UserReqDto userReqDto){
        return ResponseEntity.ok(userService.updateUser(id, userReqDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
       userService.deleteUser(id);
       return ResponseEntity.noContent().build();
    }
}
