package com.example.demo.Core;

public class Singleton {
    //private final static Singleton INSTANCE = new Singleton();//eager initialization while loading class
    private Singleton INSTANCE; //lazy initialization

   private Singleton(){

   }
   public synchronized Singleton getInstance(){// BY ADDING synchronized we can make it thread safe
       if(INSTANCE==null){
           INSTANCE=new Singleton();
       }
       return INSTANCE;
   }
}
