package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> gradeLevelPredicate = (student) -> student.getGradeLevel() >= 3;
        Predicate<Student> gpaPredicate = (student) -> student.getGpa() >= 3.9;

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().parallelStream()
            .peek((student) -> System.out.println("peek1: " + student))
            .filter(gradeLevelPredicate)
            .peek((student) -> System.out.println("peek2: " + student))
            .filter(gpaPredicate)
            .peek((student) -> System.out.println("peek3: " + student))
            .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);
    }
}
