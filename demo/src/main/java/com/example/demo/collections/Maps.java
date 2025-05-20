package com.example.demo.collections;

import com.example.demo.Person;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Maps {
    public static void main(String[] args){
        Map<String,String> m=new HashMap<>();
        m.put("1","yankiee");
        m.put("2","harlot");
        m.put("3","zebra");
        m.put("4","bob");
        m.remove("3");
        m.replace("2","harlot","charlot");
        System.out.println("plain display"+m);
        //iterate
           for(Map.Entry map:m.entrySet()){
            System.out.println("key:"+map.getKey()+" Val: "+map.getValue());
           }
        //java 8
        m.forEach((key,value)->  System.out.println(key+value));

           m.containsKey("3");//returns boolean value

        //Sort Map by Key
         Map<String,String> keysortmap=new TreeMap<>(m);
         System.out.println(" key sorted map: "+keysortmap);

        //sort map by value
        m.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(e->System.out.println(e.getKey()+e.getValue()));

        //sort map by value
        m.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(e->System.out.println(e.getKey()+e.getValue()));

        //merge maps
        Map<String, String> map1 = Map.of("a", "test", "b", "merge");
        Map<String, String> map2 = Map.of("a", "map", "c", "concept");
        Map<String,String> res=new HashMap<>(map1);
        //as 2 maps have a same key we need mapping technique
        //String::concat is mapping technique as value is string we used concat or join ,
        //if value is Integer then Integer::sum or max etc
        map2.forEach((key,val)->res.merge(key,val,String::concat)); //
        for(Map.Entry nm:res.entrySet()){
        System.out.println("new merge: "+nm.getKey()+nm.getValue());
        }

    //Group Objects by Field in a class Using Streams
        Map<Integer, List<Person>> listMap=new HashMap<>();
        List<Person> list=new ArrayList<>();
        list.stream().collect(Collectors.groupingBy(Person::getAge));

        //  Find Max Entry by Value

        Map<String,Integer> mx=Map.of("one",23,"two",23435,"three",22222);
        mx.entrySet().stream().max(Map.Entry.comparingByValue());

        // Filter Map by Value
        mx.entrySet().stream().filter(e->e.getValue()>2000).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

                //find duplicate chars in string
        String str = "programming";
        Map<Character, Long> charFreq = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
System.out.println("char freq:"+charFreq);
        charFreq.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .forEach(System.out::println);




    }
}
