package com.mubarak.myProject.data.repository;

import com.mubarak.myProject.data.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}
