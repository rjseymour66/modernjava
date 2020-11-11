package edu.rseymour.java.behaviorparameterization.predicates;

import edu.rseymour.java.behaviorparameterization.Apple;
import edu.rseymour.java.behaviorparameterization.Color;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return Color.RED.equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}
