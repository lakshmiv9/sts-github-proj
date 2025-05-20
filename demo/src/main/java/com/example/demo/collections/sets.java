package com.example.demo.collections;

import java.util.*;

public class sets {
    public static void main(String [] args){
        Set<Integer> s=new HashSet<>();
        s.add(123);
        s.add(3423);
        s.add(422222);
        s.add(422222);//duplicate not added
        s.add(1);
        s.remove(2);
        s.contains(2);

            System.out.println("plain display value: "+s.toString());
            //iterate
        Iterator itr=s.iterator();
        while ((itr.hasNext())){
           System.out.println( itr.next());
        }

        //Check if two Sets are equal
        Set<String> s1 = Set.of("z", "y", "x");
        Set<String> s2 = new HashSet<>(Arrays.asList("z", "y", "x"));

        System.out.println(s1.equals(s2));

        // Using TreeSet for sorting
        Set<String> sort=new TreeSet<>(s1);
        System.out.println("Sorted"+s1);

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

// Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2); // [1, 2, 3, 4, 5, 6]

// Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // [3, 4]

// Difference
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2); // [1, 2]


    }
}
