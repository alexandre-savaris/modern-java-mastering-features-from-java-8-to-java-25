package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFindFirstExample {

    public static void main(String[] args) {

        Optional<Student> optionalFindAny = StudentDataBase.getAllStudents().stream()
            .filter((student) -> student.getGpa() >= 3.9)
            .findAny();
        if (optionalFindAny.isPresent()) {
            System.out.println(optionalFindAny.get());
        }

        System.out.println("===================================================");

        Optional<Student> optionalFindFirst = StudentDataBase.getAllStudents().stream()
            .filter((student) -> student.getGpa() >= 3.9)
            .findFirst();
        if (optionalFindFirst.isPresent()) {
            System.out.println(optionalFindFirst.get());
        }
    }
}
