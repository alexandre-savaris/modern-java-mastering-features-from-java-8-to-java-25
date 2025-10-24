package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();

        Consumer<Student> consumer = (s) -> System.out.println(s);
        studentList.forEach(consumer);

        System.out.println("===================================================");

        Consumer<Student> consumer2 = (s) -> System.out.println(s.getName());
        Consumer<Student> consumer3 = (s) -> System.out.println(s.getActivities());
        studentList.forEach(consumer2.andThen(consumer3));

        System.out.println("===================================================");

        studentList.forEach((s) -> {
            if (s.getGradeLevel() >= 3 && s.getGpa() >= 3.9) {
                consumer2.andThen(consumer3).accept(s);
            }
        });
    }
}
