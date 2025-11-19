package com.learnJava.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = integerList.stream()
            .reduce(0, (x, y) -> x + y);
        System.out.println(sum);

        System.out.println("===================================================");

        sum = IntStream.rangeClosed(1, 6).sum();
        System.out.println(sum);
    }
}
