package edu.rseymour.java.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import static edu.rseymour.java.lambdas.FunctionalInterfaces.map;

/**
 * Three kinds of method references:
 * 1. MR to a static method, e.g. Integer::parseInt
 * 2. MR to an instance method of an arbitrary type, e.g. String::length
 * 3. MR to an instance method of an existing object or expression, e.g. myInstance::instanceMethod
 *
 * Take a lambda, remove the (arg1, arg2) -> ... and replace it with the method reference:
 */
public class MethodReferences {

    private int i;
    private int j;
    private int k;

    /**
     * ToIntFunction<String> stringToInt = (String s) -> Integer.parseInt(s);
     * ToIntFunction<String> stringToInt = Integer::parseInt;
     */

    /**
     * BiPredicate<List<String>, String> contains = (list, element) -> list.contains(element);
     * BiPredicate<List<String>, String> contains = List::contains;
     */

    /**
     * Predicate<String> startsWithNumber = (String string) -> this.startsWithNumber(string);
     * Predicate<String> startsWithNumber = this::startsWithNumber;
     */

    @FunctionalInterface
    public interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }

    // pretend constructor
    public MethodReferences(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public static void main(String[] args) {

        // Constructor references using Supplier<Apple>. Suppliers create objects
        Supplier<Apple> c1 = Apple::new;
        Apple a1 = c1.get();

        Function<Integer, Apple> c2 = Apple::new;
        Apple a2 = c2.apply(110);

        List<Integer> weights = Arrays.asList(7, 3, 4, 10);
        List<Apple> apples = map(weights, Apple::new);
//        public List<Apple> map(List<Integer> list, Function<Integer, Apple> f) {
//            List<Apple> result = new ArrayList<>();
//            for (Integer i : list) {
//                result.add(f.apply(i));
//            }
//            return result;
//        }
        BiFunction<Integer, Color, Apple> c3 = Apple::new;
        Apple a3 = c3.apply(110, Color.GREEN);

        // personalized functional interface
        TriFunction<Integer, Integer, Integer, MethodReferences> methodReferencesFactory = MethodReferences::new;
    }
}
