package com.example.first.app.Student;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "student")
public class student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private long id;
    private String name;
    private String email;
    private LocalDate dob;
    @Transient
    private Integer age;


    public student() {
    }

    public student(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public student(String cynthia, String s, LocalDate of) {

    }

    // Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dob, currentDate).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // toString() method

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
