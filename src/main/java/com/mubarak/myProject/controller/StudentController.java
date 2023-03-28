package com.mubarak.myProject.controller;

import com.mubarak.myProject.models.Gender;
import com.mubarak.myProject.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents(){
        return List.of(
                new Student("Oladejo", "Mubarak", "oladejomubarak@gmail.com",
                UUID.randomUUID(), Gender.MALE), new Student("Ola", "Aisha",
                "oladejomubarak@yahoo.com",
                UUID.randomUUID(), Gender.FEMALE)
        );

    }
}
