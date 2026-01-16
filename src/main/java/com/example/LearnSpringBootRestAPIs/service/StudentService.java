package com.example.LearnSpringBootRestAPIs.service;

import com.example.LearnSpringBootRestAPIs.dto.StudentDto;
import com.example.LearnSpringBootRestAPIs.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    Student saveStudent(StudentDto studentDto);
    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student updateStudent(Long id, StudentDto studentDto);

    void deleteStudent(Long id);
}
