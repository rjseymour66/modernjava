package edu.rseymour.java.behaviorparameterization.predicates;

import edu.rseymour.java.behaviorparameterization.Apple;

public class AppleFancyFormatter implements AppleFormatter {
    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + characteristic + " " + apple.getColor() + " apple";
    }
}
