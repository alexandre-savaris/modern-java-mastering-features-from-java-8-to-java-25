package com.learnJava.methodReference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    public static void main(String[] args) {

        Consumer<Student> consumer = System.out::println;
        Consumer<Student> consumer1 = Student::printListOfActivities;

        StudentDataBase.getAllStudents().forEach(consumer);

        System.out.println("===================================================");

        StudentDataBase.getAllStudents().forEach(consumer1);
    }
}
