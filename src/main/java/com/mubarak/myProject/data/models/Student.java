package com.mubarak.myProject.data.models;

import java.util.UUID;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final UUID studentId;
    private final Gender gender;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public Gender getGender() {
        return gender;
    }

    public Student(String firstName, String lastName, String email, UUID studentId, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.studentId = studentId;
        this.gender = gender;
    }


}
