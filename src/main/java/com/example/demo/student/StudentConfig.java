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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student chris = new Student(
                    "Christine",
                    "ondiek@gmail.com",
                    LocalDate.of(1997, Month.MAY,1)
            );
            Student ken = new Student(
                    "Ken",
                    "ken@gmail.com",
                    LocalDate.of(1965, Month.MAY,1)
            );
            repository.saveAll(
                    List.of(chris, ken)
            );
        };
    }
}
