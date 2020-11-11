package edu.rseymour.java.behaviorparameterization.predicates;

import edu.rseymour.java.behaviorparameterization.Apple;
import edu.rseymour.java.behaviorparameterization.Color;

public class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return Color.GREEN.equals(apple.getColor());
    }
}
