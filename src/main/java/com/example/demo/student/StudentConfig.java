package com.example.demo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student anoop = new Student(
                    "Anoop",
                    LocalDate.of(2000, Month.JANUARY, 5) ,
                    "anoop@acme.org",
                    21
            );


            Student bruno = new Student(
                    "Bruno",
                    LocalDate.of(2000, Month.JANUARY, 5) ,
                    "anoop@acme.org",
                    2
            );

            studentRepository.saveAll(
                    Arrays.asList(anoop, bruno)
            );
        };
    }
}
