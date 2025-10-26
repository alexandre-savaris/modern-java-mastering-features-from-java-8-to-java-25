package com.learnJava.streams;

import com.learnJava.data.StudentDataBase;

public class StreamsMatchExample {

    public static void main(String[] args) {

        boolean allMatch = StudentDataBase.getAllStudents().stream()
            .allMatch((student) -> student.getGpa() >= 3.9);
        System.out.println("allMatch = " + allMatch);

        System.out.println("===================================================");

        boolean anyMatch = StudentDataBase.getAllStudents().stream()
            .anyMatch((student) -> student.getGpa() >= 3.9);
        System.out.println("anyMatch = " + anyMatch);

        System.out.println("===================================================");

        boolean noneMatch = StudentDataBase.getAllStudents().stream()
            .noneMatch((student) -> student.getGpa() >= 3.9);
        System.out.println("noneMatch = " + noneMatch);
    }
}
