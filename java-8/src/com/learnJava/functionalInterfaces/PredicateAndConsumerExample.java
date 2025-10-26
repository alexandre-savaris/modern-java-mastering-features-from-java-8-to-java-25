package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();

        Predicate<Student> predicate = (s) -> s.getGradeLevel() >= 3;
        Predicate<Student> predicate1 = (s) -> s.getGpa() >= 3.9;

        BiConsumer<String, List<String>> biConsumer =
            (name, activities) -> System.out.println(name + ": " + activities);

        Consumer<Student> consumer = (s) -> {
            if (predicate.and(predicate1).test(s)) {
                biConsumer.accept(s.getName(), s.getActivities());
            }
        };

        studentList.forEach(consumer);
    }
}
