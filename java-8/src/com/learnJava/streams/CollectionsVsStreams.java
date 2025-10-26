package com.learnJava.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Jenny");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("===================================================");

        names.remove(0);
        System.out.println(names);

        System.out.println("===================================================");

        Stream<String> streamOfNames = names.stream();
        streamOfNames.forEach(System.out::println);
    }
}
