package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

public class StreamsFilterExample {

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents().stream()
            .filter((student -> student.getGender().equals("female")))
            .filter((student -> student.getGpa() >= 3.9))
            .toList();
        studentList.forEach(System.out::println);
    }
}
