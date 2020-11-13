package edu.rseymour.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Examples {

    public static void main(String[] args) {

        /**
         * 4.3.1 Traversable only once
         */
        List<String> title = Arrays.asList("Modern", "Java", "In", "Action");

        Stream<String> s = title.stream();
        s.forEach(System.out::println);
        // you can only stream once, it is not a collection
        // s.forEach(System.out::println);

    }
}
