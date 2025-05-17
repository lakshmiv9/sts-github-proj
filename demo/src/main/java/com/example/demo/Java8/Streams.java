package com.example.demo.Java8;

import com.example.demo.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args){
        List<Person> personList= Arrays.asList(new Person("anvesh",35,123,"m","Data"),
                new Person("midhiles",36,12,"m","Network"),
                new Person("lakshmi",35,1234,"f","IT"));
       List<Person> newList= personList.stream().
               filter(age->age.getAge()>35).
               collect(Collectors.toList());
       System.out.println(newList);
        personList.stream().filter(age->age.getAge()<35).
               map(n->n.getName().toUpperCase())
                .forEach(System.out::println);

        List<Integer> square=Arrays.asList(2,3,4,4,3,5);
        square.stream().distinct().map(i->i*i).forEach(System.out::println);

        List<String> emptyStr=Arrays.asList("adc","");
        long count=emptyStr.stream().filter(str->str!=null).count();
        System.out.println(count);

        //2nd highest salary
        personList.stream().distinct()
                .sorted(Comparator.comparing(Person::getSalary).reversed())
                .skip(1).findFirst().ifPresent(System.out::println);

        //Find duplicate elements in a list


       // Groupby employees by department
       Map<Integer,List<Person>> groupAge= personList.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println("key:"+groupAge.toString());

        //partionby
        List<Integer> numbers=Arrays.asList(2,3,4,5,6);
        Map<Boolean, List<Integer>> evenOddMap = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("key:"+evenOddMap.toString());

        //Check if all employees are older than 34
boolean check=personList.stream().allMatch(age->age.getAge()>34);
        System.out.println("check age:"+check);

        //Join all names into a single comma-separated string



    }
}
