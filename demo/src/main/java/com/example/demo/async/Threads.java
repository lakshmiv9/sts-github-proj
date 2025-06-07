package com.example.demo.async;

public class Threads extends Thread {
    public void run() {
        System.out.println("Thread started"+currentThread());
    }

    public static void main(String args[]) {
        Threads t1 = new Threads();
        t1.start();  // Now this will call  run() in a new thread
        t1.run();
    }
}