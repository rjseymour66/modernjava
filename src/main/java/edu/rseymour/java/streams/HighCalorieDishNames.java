package edu.rseymour.java;


import java.util.List;
import static edu.rseymour.java.Dish.menu;
import static java.util.stream.Collectors.toList;

public class HighCalorieDishNames {

    public static void main(String[] args) {

        List<String> threeHighCalorieDishNames =
                menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(toList());
        System.out.println(threeHighCalorieDishNames);

    }
}
