package com.example.demo.collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class concurrenthashmap {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<>();
        map.put("one",1);
        map.put("three",3);
        map.put("A", 1);
        map.put("B", 2);
       // map.put("",0);

//Multi-threaded Put & Get Example
        Runnable writer = () -> {
            for (int i = 0; i < 10; i++) {
                map.put("Key-" + i, i);
                System.out.println(Thread.currentThread().getName() + " put: Key-" + i + " -> " + i);
                try {
                    Thread.sleep(50); // Simulate some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Thread to GET values
        Runnable reader = () -> {
            for (int i = 0; i < 10; i++) {
                Integer val = map.get("Key-" + i);
                System.out.println(Thread.currentThread().getName() + " get: Key-" + i + " -> " + val);
                try {
                    Thread.sleep(50); // Simulate some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

      Thread t1= new Thread(writer, "Writer-1");
        new Thread(reader, "Reader-1").start(); // new thread is created
         new Thread(reader, "Reader-2").start(); // new thread is created


        t1.start(); //new thread is created
        t1.join(); // this method is used to Wait for t1 thread to finish execution before main thread
        //t2.join();
        //t3.join();
        reader.run(); //runs task in main thread
        writer.run();
        System.out.println(map);


        //Iterate ConcurrentHashMap Safely While Updating
        map.forEach((key,val)->{
            System.out.println(key+"-->"+val);
            map.put("ten",10);
            if(val<5){
                map.put(key,val+2);
            }
            System.out.println(map);
        })

        ;

    }
}
