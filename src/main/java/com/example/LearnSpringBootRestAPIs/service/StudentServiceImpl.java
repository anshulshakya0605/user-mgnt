package com.example.LearnSpringBootRestAPIs.service;

import com.example.LearnSpringBootRestAPIs.dto.StudentDto;
import com.example.LearnSpringBootRestAPIs.entity.Student;
import com.example.LearnSpringBootRestAPIs.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setName(studentDto.getName());
        student.setEmail(studentDto.getEmail());
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElseThrow(()-> new RuntimeException("Student Not Found"));
    }

    @Override
    public Student updateStudent(Long id, StudentDto studentDto){
        Student exitingStudent = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student Not Found"));
        exitingStudent.setName(studentDto.getName());
        exitingStudent.setEmail(studentDto.getEmail());
        return studentRepository.save(exitingStudent);
    }

    @Override
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}
