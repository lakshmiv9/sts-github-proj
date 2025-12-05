package com.example.demo.collections;

import com.example.demo.Person;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Arraylists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List<String> list1 =List.of("d"); //Create an immutable List (Java 9+) before that its Arrays.asList(mutable)
        List<String> list2=Arrays.asList("1");
                list.add("as");
        list.add(String.valueOf(123));
        list.add("arry");
        list.add("apple");
        list.add("");
        list.add("grapes");
        list.add("chikoo");
        list.add("chikoo");
        list.remove(2);
        list.set(1, "list"); // pos 1 will always be list
        System.out.println("plain display"+list);
        Iterator itr = list.iterator();
        //traditional way to iterate
        System.out.println("****************while loop iterate****************");
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        System.out.println("****************for loop iterate****************");
        for (String str : list) {
            System.out.println(str.toString());
        }
        //java 8 iteration
        System.out.println("**************** java 8 iterate****************");
        list.stream().forEach(System.out::println);
        //check if element exists
        if(list.contains("list")){

        }
        System.out.println("****************sorting****************");
        //Sort ArrayList Alphabetically
        Collections.sort(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        System.out.println("****************Convert ArrayList to Array****************");
        //Convert ArrayList to Array
        System.out.println( list.toArray().toString());
        System.out.println("****************Find Frequency of Each Element****************");
        // Find Frequency of Each Element

        Map<String,Long> count=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(count);


        System.out.println("****************find duplicates list****************");
        //Find Duplicates in ArrayList
        Set<String> seen=new HashSet<>();
        Set<String> dup=list.stream().filter(s -> !seen.add(s)).collect(Collectors.toSet());
        System.out.println("dups "+dup.toString());
        System.out.println("****************distinct list****************");
        // Remove Duplicates from ArrayList
        list.stream().distinct().forEach(System.out::println);

        System.out.println("****************reverse list****************");
        //reverse an arraylist
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("****************remove nulls****************");
        //Remove Nulls from ArrayList
        list.removeIf(Objects::isNull);
        System.out.println(list);

        //grouping
        List<Person> listg=new ArrayList<>();
        listg.stream().collect(Collectors.groupingBy(Person::getAge));














    }
}
