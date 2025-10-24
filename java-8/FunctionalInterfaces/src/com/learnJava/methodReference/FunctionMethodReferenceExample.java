package com.learnJava.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    public static void main(String[] args) {

        Function<String, String> functionLambda = (s) -> s.toUpperCase();
        Function<String, String> functionMethodReference = String::toUpperCase;

        System.out.println("Lambda result: " + functionLambda.apply("java8"));
        System.out.println("Method reference result: " + functionMethodReference.apply("java8"));
    }
}
