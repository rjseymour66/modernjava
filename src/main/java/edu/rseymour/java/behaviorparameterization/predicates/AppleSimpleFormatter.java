package edu.rseymour.java.behaviorparameterization.predicates;

import edu.rseymour.java.behaviorparameterization.Apple;

public class AppleSimpleFormatter implements AppleFormatter {
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
