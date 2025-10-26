package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);

        Optional<Integer> optionalSum = integerList.stream()
            .limit(2)
            .reduce(Integer::sum);
        optionalSum.ifPresent(System.out::println);

        System.out.println("===================================================");

        Optional<Integer> optionalSum1 = integerList.stream()
            .skip(3)
            .reduce(Integer::sum);
        optionalSum1.ifPresent(System.out::println);
    }
}
