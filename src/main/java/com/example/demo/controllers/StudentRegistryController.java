package com.example.demo.controllers;

import com.example.demo.students.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StudentRegistryController {

    @PostMapping("/register")
    public void registerStudent(Student student)
    {
        log.info(student.getName());
    }

}
