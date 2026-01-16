package com.example.LearnSpringBootRestAPIs.repository;

import com.example.LearnSpringBootRestAPIs.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
