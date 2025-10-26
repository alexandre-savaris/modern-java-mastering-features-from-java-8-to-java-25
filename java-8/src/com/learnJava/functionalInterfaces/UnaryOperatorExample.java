package com.learnJava.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {

        UnaryOperator<String> unaryOperator = (s) -> s.concat("Default");

        System.out.println("UnaryOperator result: " + unaryOperator.apply("java8"));
    }
}
