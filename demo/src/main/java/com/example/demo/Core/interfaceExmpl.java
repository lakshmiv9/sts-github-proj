package com.example.demo.Core;

public interface interfaceExmpl {
    String bankName(String bank);
    default void defaltmethod(){
        System.out.println("default method");

    }
    static void statMethod(){
        System.out.println("static method");
    }

}
