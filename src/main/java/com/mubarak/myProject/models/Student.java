package com.mubarak.myProject.models;

import java.util.UUID;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String emailName;
    private final UUID studentId;
    private final Gender gender;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailName() {
        return emailName;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public Gender getGender() {
        return gender;
    }

    public Student(String firstName, String lastName, String emailName, UUID studentId, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailName = emailName;
        this.studentId = studentId;
        this.gender = gender;
    }


}
