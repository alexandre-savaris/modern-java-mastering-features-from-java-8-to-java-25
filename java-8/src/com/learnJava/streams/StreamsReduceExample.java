package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 3, 5, 7);

        int result = integerList.stream()
            .reduce(1, (a, b) -> a * b);
        System.out.println(result);

        System.out.println("===================================================");

        Optional<Integer> optionalResult = integerList.stream()
            .reduce((a, b) -> a * b);
        System.out.println(optionalResult.get());

        System.out.println("===================================================");

        Optional<Student> optionalMaxGpaStudent = StudentDataBase.getAllStudents().stream()
            .reduce((a, b) -> a.getGpa() > b.getGpa() ? a : b);
        optionalMaxGpaStudent.ifPresent(
            (student -> System.out.println("Student with max Gpa: " + optionalMaxGpaStudent.get()))
        );

        System.out.println("===================================================");

        Optional<Student> optionalMinGpaStudent = StudentDataBase.getAllStudents().stream()
            .reduce((a, b) -> a.getGpa() < b.getGpa() ? a : b);
        optionalMinGpaStudent.ifPresent(
            (student -> System.out.println("Student with min Gpa: " + optionalMinGpaStudent.get()))
        );
    }
}
