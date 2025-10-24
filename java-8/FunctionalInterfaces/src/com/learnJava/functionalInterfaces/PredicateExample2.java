package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();

        Predicate<Student> predicate = (s) -> s.getGradeLevel() >= 3;
        studentList.forEach((s) -> {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        });

        System.out.println("===================================================");

        Predicate<Student> predicate1 = (s) -> s.getGpa() >= 3.9;
        studentList.forEach((s) -> {
            if (predicate1.test(s)) {
                System.out.println(s);
            }
        });

        System.out.println("===================================================");

        studentList.forEach((s) -> {
            if (predicate.and(predicate1).test(s)) {
                System.out.println(s);
            }
        });
    }
}
