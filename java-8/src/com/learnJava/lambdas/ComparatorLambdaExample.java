package com.learnJava.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    static void main() {

        // Before Java 8.
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Before Java 8 = " + comparator.compare(3, 2));

        // After Java 8.
        Comparator<Integer> comparatorLambda = (a, b) -> a.compareTo(b);
        System.out.println("After Java 8 = " + comparatorLambda.compare(2, 3));
    }
}
