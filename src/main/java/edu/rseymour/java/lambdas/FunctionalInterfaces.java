package edu.rseymour.java.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalInterfaces {

    /**
     * Predicates test whether a condition is true or not.
     */
    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }

    /**
     * Consumers defines an abstract method that accepts type T and performs some operations on it.
     */
    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T t : list) {
            c.accept(t);
        }
        forEach(
                Arrays.asList(1, 2, 3, 4, 5),
                (Integer i) -> System.out.println(i)
        );
    }

    /**
     * Takes and Object of type T and returns an object of type R. You might use this interface when
     * you need to define a lambda that maps information from an input object to an output object.
     */
    @FunctionalInterface
    public interface Function<T, R> {
        R apply(T t);
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }


    public static void main(String[] args) {

        String name = "Ryan Seymour";

        Runnable r = () -> System.out.println(name);

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("This is");
        listOfStrings.add("a list of");
        listOfStrings.add("");
        listOfStrings.add("Strings.");

        System.out.println(map(listOfStrings, s -> s.length()));

        // Predicate test
        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);

        System.out.println(nonEmpty);

        List<Integer> l = map(
                Arrays.asList("Lambdas", "in", "action"),
                (String s) -> s.length()
        );

        System.out.println(l);
    }
}
