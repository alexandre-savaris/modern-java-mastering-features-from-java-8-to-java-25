package com.learnJava.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println("BinaryOperator result: " + binaryOperator.apply(3, 4));

        System.out.println("===================================================");

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> binaryOperator1 = BinaryOperator.minBy(comparator);
        System.out.println("BinaryOperator minBy: " + binaryOperator1.apply(3, 5));

        System.out.println("===================================================");

        BinaryOperator<Integer> binaryOperator2 = BinaryOperator.maxBy(comparator);
        System.out.println("BinaryOperator maxBy: " + binaryOperator2.apply(3, 5));
    }
}
