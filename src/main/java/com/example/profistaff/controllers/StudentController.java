package com.example.profistaff.controllers;

import com.example.profistaff.models.entities.Student;
import com.example.profistaff.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping(value = "/students")
    public String getStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        model.addAttribute("student");
        return "students";
    }

    @PostMapping(value = "/students/add")
    public String addStudent(@ModelAttribute(value = "student") Student student) {
        studentService.addStudent(student);
        return "redirect:/students";
    }

    @GetMapping(value = "/students/delete/{id}")
    public String deleteStudentById(@PathVariable int id) {
        studentService.delteStudentById(id);
        return "redirect:/students";
    }

}
