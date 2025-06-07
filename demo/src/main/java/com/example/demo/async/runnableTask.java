package com.example.demo.async;

public class runnableTask {
    public static void main(String args[]){

        //create a task using runnable
        Runnable task=()->{
            for(int i=0;i<5;i++){
                System.out.println(i+" "+Thread.currentThread());
            }
        };
        // run those task on threads
        new Thread(task,"A").start();
        new Thread(task,"A").run();
    }
    }

