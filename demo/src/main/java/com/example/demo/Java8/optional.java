package com.example.demo.Java8;

import java.util.Optional;

public class optional {
    public static void main(String[] args){
        String str="Lakshmi";
        String str1=null;
       // below does not allow null. If str is null, it throws a NullPointerException immediately
      //  Optional<String> op=Optional.of(str);
        //this will allow null
        Optional<String> opn=Optional.ofNullable(str);

        // Example 2: Checking if value is present
        if (opn.isPresent()) {
            System.out.println("Name is: " + str);
        }
        opn.ifPresent(System.out::println);

        Optional<String> emptyName=Optional.ofNullable(str1);

        try {
            emptyName.ifPresent(System.out::println);
            emptyName.orElseThrow(() -> new IllegalArgumentException("Name not found for"));
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }


}
