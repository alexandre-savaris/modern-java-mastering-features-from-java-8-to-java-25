package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class StreamsComparatorExample {

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents().stream()
            .sorted(Comparator.comparing(Student::getName))
            .toList();
        System.out.println(studentList);

        System.out.println("===================================================");

        List<Student> studentList1 = StudentDataBase.getAllStudents().stream()
            .sorted(Comparator.comparing(Student::getGpa).reversed())
            .toList();
        System.out.println(studentList1);
    }
}
