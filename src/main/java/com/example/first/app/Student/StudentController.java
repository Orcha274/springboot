package com.example.first.app.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/** @noinspection SpellCheckingInspection*/
@RestController
@RequestMapping(path ="api/v1/student")
public class StudentController {


    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public List<student> getAllStudents(){

        return studentService.getStudents();
    }

    @PostMapping
    public ResponseEntity<String> registerNewStudent(@RequestBody student student) {
        try {
            studentService.addNewStudent(student);
            return ResponseEntity.status(HttpStatus.CREATED).body("Student added successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add student");
        }
    }
    @DeleteMapping(path="{studentId}")
    public void deletestudent(@PathVariable("studentId") Long studentId){
        studentService.deletestudent(studentId);
    }
    @PutMapping(path ="{studentId}")
       public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email){
                studentService.updateStudent(studentId, name, email);
            }


}
