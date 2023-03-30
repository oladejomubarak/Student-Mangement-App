package com.mubarak.myProject.data;

import com.mubarak.myProject.data.models.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDataAccessService {

    public List<Student> selectAllStudents(){
        return List.of(
        );
    }
}
