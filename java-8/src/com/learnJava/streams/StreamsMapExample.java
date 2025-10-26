package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class StreamsMapExample {

    public static void main(String[] args) {

        List<String> studentList = StudentDataBase.getAllStudents().stream()
            .map(Student::getName)
            .map(String::toUpperCase)
            .toList();
        System.out.println(studentList);

        System.out.println("===================================================");

        Set<String> studentList1 = StudentDataBase.getAllStudents().stream()
            .map(Student::getName)
            .map(String::toLowerCase)
            .collect(toSet());
        System.out.println(studentList1);
    }
}
