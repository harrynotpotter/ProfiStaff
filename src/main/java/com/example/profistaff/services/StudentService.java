package com.example.profistaff.services;

import com.example.profistaff.models.entities.Student;
import com.example.profistaff.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void delteStudentById(int id) {
        studentRepository.deleteById(id);
    }

}
