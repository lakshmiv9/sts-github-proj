package com.example.demo.Java8;
/*
public class Comparator {
}*/import java.util.*;
import java.lang.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Person {
    private String name;
    private Integer age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    @Override
    public String toString() {
        return "Person(name=" + name + ", age=" + age + ")";
    }

    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        // Create a modifiable ArrayList from Arrays.asList
        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Kar", Integer.valueOf(30)),
                new Person("LAK", Integer.valueOf(35))
        ));

        System.out.println(list);
        list.sort(Comparator.comparing(Person::getAge).reversed());
        System.out.println("new list: " + list);
    }
}