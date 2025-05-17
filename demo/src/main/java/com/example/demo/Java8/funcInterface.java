package com.example.demo.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class funcInterface {
    public static void main(String[] args){
        // Predicate to filter a list of integers.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Predicate<Integer> isEven = n -> n % 2 == 0;

        list.stream()
                .filter(isEven)
                .forEach(System.out::println);

        //Function<T, R> to convert a list of strings to uppercase.
        List<String> names = Arrays.asList("alice", "bob");
        Function<String, String> toUpper = s -> s.toUpperCase();

        List<String> result = names.stream()
                .map(toUpper)
                .collect(Collectors.toList());

        System.out.println(result);
        //Use Consumer to print values with a message.
        Consumer<String> printer = name -> System.out.println("Hello, " + name);
        printer.accept("ABC");
        Random random=new Random();

        //Generate a random number using Supplier
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(10);
        System.out.println(randomSupplier.get());

    }
}
