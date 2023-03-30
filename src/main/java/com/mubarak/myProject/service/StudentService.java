package com.mubarak.myProject.service;

import com.mubarak.myProject.data.StudentDataAccessService;
import com.mubarak.myProject.data.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentDataAccessService studentDataAccessService;
    @Autowired
    public StudentService(StudentDataAccessService studentDataAccessService) {
        this.studentDataAccessService = studentDataAccessService;
    }

    public List<Student> getAllStudents(){
        return studentDataAccessService.selectAllStudents();
    }
}
