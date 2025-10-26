package com.learnJava.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int value = 4;

    public static void main(String[] args) {

        Consumer<Integer> consumer = (i) -> {
            value++;
            System.out.println(value + i);
        };

        value = 6;

        consumer.accept(4);

        value = 7;
    }
}
