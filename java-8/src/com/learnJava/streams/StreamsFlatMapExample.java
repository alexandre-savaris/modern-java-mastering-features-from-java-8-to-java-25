package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

public class StreamsFlatMapExample {

    public static void main(String[] args) {

        List<String> activitiesList = StudentDataBase.getAllStudents().stream()
            .map(Student::getActivities)
            .flatMap(List::stream)
            .toList();
        System.out.println(activitiesList);

        System.out.println("===================================================");

        List<String> activitiesList1 = StudentDataBase.getAllStudents().stream()
            .map(Student::getActivities)
            .flatMap(List::stream)
            .distinct()
            .toList();
        System.out.println(activitiesList1);

        System.out.println("===================================================");

        long activitiesListCount = StudentDataBase.getAllStudents().stream()
            .map(Student::getActivities)
            .flatMap(List::stream)
            .distinct()
            .count();
        System.out.println(activitiesListCount);

        System.out.println("===================================================");

        List<String> activitiesList2 = StudentDataBase.getAllStudents().stream()
            .map(Student::getActivities)
            .flatMap(List::stream)
            .distinct()
            .sorted()
            .toList();
        System.out.println(activitiesList2);

    }
}
