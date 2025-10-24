package com.learnJava.methodReference;

import com.learnJava.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    public static void main(String[] args) {

        Supplier<Student> supplier = Student::new;
        System.out.println("Constructor result: " + supplier.get());

        System.out.println("===================================================");

        Function<String, Student> function = Student::new;
        System.out.println("Constructor result: " + function.apply("java8"));
    }
}
