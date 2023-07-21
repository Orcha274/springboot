package com.example.first.app.Student;


//import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


/** @noinspection ALL*/
@Repository
public interface StudentRepository extends  JpaRepository <student, Long>
        {
                @Query("SELECT s FROM student s WHERE s.email=?1")

                Optional<student> findstudentByEmail(String email);
}
