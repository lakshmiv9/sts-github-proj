package com.example.demo.Java8;
/*
public class Comparator {
}*/

import com.example.demo.Person;

import java.util.*;
import java.lang.*;

class StreamsComparator {
    public static void main(String[] args) {
        // Create a modifiable ArrayList from Arrays.asList
        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Kar", Integer.valueOf(30),123,"f","Network"),
                new Person("LAK", Integer.valueOf(35),12,"f","IT")
        ));

        System.out.println(list);
        list.sort(Comparator.comparing(Person::getAge).reversed());
        System.out.println("new list: " + list);
    }
}