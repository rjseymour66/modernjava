package edu.rseymour.java.behaviorparameterization.predicates;

import edu.rseymour.java.behaviorparameterization.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
