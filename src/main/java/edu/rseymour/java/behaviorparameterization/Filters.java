package edu.rseymour.java.behaviorparameterization;

import edu.rseymour.java.behaviorparameterization.predicates.AppleFormatter;
import edu.rseymour.java.behaviorparameterization.predicates.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

public class Filters {

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for (Apple apple : inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }
}
