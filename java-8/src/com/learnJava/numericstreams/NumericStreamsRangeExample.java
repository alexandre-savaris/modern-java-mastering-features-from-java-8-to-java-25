package com.learnJava.numericstreams;

import java.util.stream.IntStream;

public class NumericStreamsRangeExample {

    static void main(String[] args) {

        IntStream intStream = IntStream.range(1, 50);
        System.out.println(intStream.count());

        System.out.println("===================================================");

        IntStream.range(1, 50).forEach((value -> System.out.print(value + ",")));

        System.out.println("\n===================================================");

        IntStream.rangeClosed(1, 50).forEach((value -> System.out.print(value + ",")));

        System.out.println("\n===================================================");

        IntStream.range(1, 50).asDoubleStream().forEach((value -> System.out.print(value + ",")));
    }
}
