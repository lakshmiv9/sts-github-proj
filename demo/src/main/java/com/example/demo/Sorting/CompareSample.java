package com.example.demo.Sorting;

import com.example.demo.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareSample {
    public static void main(String [] args){
        List<Person> personList= Arrays.asList(new Person("lice",35,123,"m","Data"),
                new Person("bob",36,12,"m","Network"),
                new Person("ary",34,1234,"f","IT"));
        //below is for comparator for this the Person should be implementing comparable
        Collections.sort(personList, Comparator.comparing(Person::getName));
        personList.forEach(System.out::println);
        personList.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        personList.forEach(System.out::println);
        //below is for comprable for this the Person should be implementing comparable
        Collections.sort(personList);
        System.out.println("Comparable: "+personList);
    }
}
