package com.example.demo.Core;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyonwrtieex {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> cplist=new CopyOnWriteArrayList<>();
        cplist.add(100);
        cplist.add(1000);
        cplist.add(10000);

        cplist.removeIf(s->s.equals(1000));
        System.out.println(cplist);

        //mulyithreading acess

        Runnable add=()->{
            for(int i=0;i<5;i++){
                cplist.add(i);
                System.out.println(cplist);
            }
        };

        Runnable read=()->{
            for(int i=0;i<5;i++){
                System.out.println(cplist);
            }
        };


        Thread t1=new Thread(add,"add-1");
        Thread t2=new Thread(read,"read-2");
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        //iterate while modify
        cplist.forEach(e->{
            cplist.add(23);
            System.out.println("i will not print 23: "+e); //Output will only show original elements because iteration uses a snapshot.
        });
//or below
        /*for (Integer s : cplist) {
            System.out.println(s);
            cplist.add(24); // Safe, no exception
        }*/
        System.out.println(cplist);
    }
}
