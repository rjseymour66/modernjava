package edu.rseymour.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static edu.rseymour.java.streams.Dish.menu;


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

        // filter()
        List<Dish> vegetarianMenu = menu.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());

        // distinct()
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        // takeWhile()
        List<Dish> specialMenu = Arrays.asList(
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER)
        );

        specialMenu.stream()
                .takeWhile(dish -> dish.getCalories() > 320)
                .collect(Collectors.toList());

        // dropWhile()
        specialMenu.stream()
                .dropWhile(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());

        // limit()
        List<Dish> dishes = specialMenu.stream()
                .filter(dish -> dish.getCalories() > 320)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(dishes);

        // skip()
        List<Dish> skipDishes = specialMenu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2)
                .collect(Collectors.toList());

        // limit()
        List<Dish> firstMeats = menu.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .limit(2)
                .collect(Collectors.toList());

        // mapping()
        List<String> dishNames = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());

        // mappint() string length
        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("Word lengths: " + wordLengths);

        List<Integer> dishNameLengths = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(dishNameLengths);


    }
}
