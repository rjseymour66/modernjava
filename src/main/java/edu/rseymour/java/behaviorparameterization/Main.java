package edu.rseymour.java.behaviorparameterization;

import edu.rseymour.java.behaviorparameterization.predicates.AppleFancyFormatter;
import edu.rseymour.java.behaviorparameterization.predicates.AppleRedAndHeavyPredicate;
import edu.rseymour.java.behaviorparameterization.predicates.AppleSimpleFormatter;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED));


        List<Apple> redAndHeavyApples = Filters.filterApples(inventory, new AppleRedAndHeavyPredicate());

        Filters.prettyPrintApple(inventory, new AppleFancyFormatter());
        Filters.prettyPrintApple(inventory, new AppleSimpleFormatter());
    }


}
