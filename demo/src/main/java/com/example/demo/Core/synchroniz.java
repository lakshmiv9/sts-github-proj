package com.example.demo.Core;

//thread safe
/*we have a shared variable count.
Two threads (t1 and t2) each call syncmethod() 10 times.
The method syncmethod() is synchronized, so only one thread at a time can execute it on the same object.*/
public class synchroniz {

    private int count=0;

    public int getCount() {
        return count;
    }

    //if we remove the synchronized key word we might get inconsistent results, such as:
    //Missing numbers  //Duplicated values   //Less than 20 total outputs
    synchronized void  syncmethod(){
    System.out.println(count++);
    }
    //if its a non synchronized method we can add a synchronized block inside this method
void normalMethod(){
        synchronized(this) {
            System.out.println(count++);
        }

    }

    public static void main(String[] args){
        synchroniz sync=new synchroniz();

        Thread t1=new Thread(()->{
            for (int i = 0; i < 10; i++)
                sync.syncmethod();
            sync.normalMethod();
        });
        t1.start();

Thread t2=new Thread(()->{
    for (int i = 0; i < 10; i++)
        sync.syncmethod();
    sync.normalMethod();
});
        t2.start();

        // creating task in runnable and to execute the task creating 2 threads
Runnable task2=()->{
    System.out.println("Running in TASK2 thread: " + Thread.currentThread().getName());
};
        new Thread(task2, "A").start(); //.start will run a new thread Always use .start() if you want true multithreading
        new Thread(task2,"B").start();
task2.run(); //.run will run in main thread

    }
}
