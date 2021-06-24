package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Christine",
                        "ondiek@gmail.com",
                        LocalDate.of(1997, Month.MAY,1),
                        21

                )
        );
    }
}
