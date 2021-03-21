package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args ->{
            Student shubham = new Student(
                    1L,
                    "Shubham",
                    "Shubham.s.bhagwat@gmail.com",
                    LocalDate.of(1999, Month.JULY, 9)
            );
            Student nikhil = new Student(
                    "Nikhil",
                    "nikhil@gmail.com",
                    LocalDate.of(1999, Month.MARCH, 9)
            );

            repository.saveAll(
                    List.of(shubham, nikhil)
            );
        };
    }
}
