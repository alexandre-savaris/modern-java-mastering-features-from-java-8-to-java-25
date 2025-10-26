package com.learnJava.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {

        int i = 0;

// Error (using the local variable i as an argument for the lambda expression)!
//        Consumer<Integer> consumer = (i) -> {
//            System.out.println(i);
//        };
        Consumer<Integer> consumer = (i1) -> {
            System.out.println(i);
        };

        consumer.accept(5);
    }
}
