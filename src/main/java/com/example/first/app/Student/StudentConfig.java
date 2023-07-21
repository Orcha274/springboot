package com.example.first.app.Student;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/** @noinspection ALL*/
@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner( @Qualifier("studentRepository")StudentRepository repository){
        return args -> {

            if (repository.count() == 0) {
                student Cynthia = new student(
                        "Cynthia",
                        "adhiambocynthia17@gmail.com",
                        LocalDate.of(2002, Month.FEBRUARY, 5)


                );

                student Felix = new student(
                        "Felix",
                        "felixodira99@gmail.com",
                        LocalDate.of(2001, Month.NOVEMBER, 21)
                );

                student Byrone = new student(
                        "Byrone",
                        "lutherbyrone254@gmail.com",
                        LocalDate.of(2002, Month.AUGUST, 6)
                );

                student Sylvia = new student(
                        "Sylvia",
                        "akinyisylvia45@gmail.com",
                        LocalDate.of(2003, Month.JULY, 26)
                );
                student Shanah = new student(
                        "Shanah",
                        "shanah26@gmail.com",
                        LocalDate.of(2001, Month.FEBRUARY, 26)
                );

                repository.saveAll(
                        List.of(Cynthia, Felix, Byrone, Sylvia,Shanah)
                );

        };
        };
    }
}
