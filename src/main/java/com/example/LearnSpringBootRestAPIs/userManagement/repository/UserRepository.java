package com.example.LearnSpringBootRestAPIs.userManagement.repository;

import com.example.LearnSpringBootRestAPIs.userManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User ,Long> {

}
