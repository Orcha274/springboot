package com.example.first.app.Student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/** @noinspection ALL*/

@Service
public class StudentService {
    private static StudentRepository studentRepository ;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public static void addNewStudent(student student) {

        Optional<student> studentOptional= studentRepository.findstudentByEmail(student.getEmail());
                if(studentOptional.isPresent()){
                    throw new IllegalStateException("email taken");
                }

      studentRepository.save(student);
    }

    public  List<student> getStudents(){

        return studentRepository.findAll();

    };

    public void deletestudent(Long studentId) {

        boolean exixts = studentRepository.existsById(studentId);
        if(!exixts){
            throw new  IllegalStateException("student with id" +studentId +"does not exist");
        }
        studentRepository.deleteById(studentId);
    }
    @Transactional
    public void updateStudent(Long studentId,
                              String name,
                              String email) {
        student student =studentRepository.findById(studentId)
                .orElseThrow(()-> new IllegalStateException("student with id" + " " + studentId +"does not exist"));

        if (name != null && name.length()> 0 && !Objects.equals(student.getName(), name)){
            student.setName(name);
        }

        if (email != null && !email.isEmpty() && !Objects.equals(student.getEmail(), email)) {
            Optional<student> studentOptional = studentRepository.findstudentByEmail(email);
            if (studentOptional.isPresent() && !Objects.equals(studentOptional.get().getId(), studentId)) {
                throw new IllegalStateException("email taken");
            }

            student.setEmail(email);
        }

    }
}

