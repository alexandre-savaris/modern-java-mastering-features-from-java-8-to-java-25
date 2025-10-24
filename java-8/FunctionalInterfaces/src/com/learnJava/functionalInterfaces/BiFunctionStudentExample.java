package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionStudentExample {

    public static void main(String[] args) {

        Predicate<Student> predicate = (student) -> student.getGpa() >= 3.9;

        BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, predicateArg) -> {

            Map<String, Double> map = new HashMap<>();

            students.forEach((student) -> {
                if (predicateArg.test(student)) {
                    map.put(student.getName(), student.getGpa());
                }
            });

            return map;
        };

        System.out.println("BiFunction example: " + biFunction.apply(StudentDataBase.getAllStudents(), predicate));
    }
}
