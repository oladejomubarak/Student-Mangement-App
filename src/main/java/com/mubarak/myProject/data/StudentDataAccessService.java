package com.mubarak.myProject.data;

import com.mubarak.myProject.models.Gender;
import com.mubarak.myProject.models.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class StudentDataAccessService {

    public List<Student> selectAllStudents(){
        return List.of(
                new Student("Oladejo", "Mubarak", "oladejomubarak@gmail.com",
                        UUID.randomUUID(), Gender.MALE), new Student("Ola", "Aisha",
                        "oladejomubarak@yahoo.com",
                        UUID.randomUUID(), Gender.FEMALE)
        );
    }
}
