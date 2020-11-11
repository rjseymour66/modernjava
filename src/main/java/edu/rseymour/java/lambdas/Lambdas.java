package edu.rseymour.java.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static edu.rseymour.java.behaviorparameterization.Filters.filterApples;

public class Lambdas {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("This is a lambda!");
        r.run();

        // Filtering with lambdas
        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED)
        );
        
    }
}
