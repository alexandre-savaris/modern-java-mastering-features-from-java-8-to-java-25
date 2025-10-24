package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a: " + a + ", b: " + b);
        biConsumer.accept("java7", "java8");

        System.out.println("===================================================");

        BiConsumer<Integer, Integer> multiply =
            (a, b) -> System.out.println("Multiplication is: " + a * b);
        BiConsumer<Integer, Integer> divide =
            (a, b) -> System.out.println("Division is: " + a / b);
        multiply.andThen(divide).accept(10, 5);

        System.out.println("===================================================");

        BiConsumer<String, List<String>> biConsumer1 =
            (name, activities) -> System.out.println(name + " : " + activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student) -> biConsumer1.accept(student.getName(), student.getActivities()));
    }
}
