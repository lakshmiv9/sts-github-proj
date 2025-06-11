package com.example.demo.DataStrctureExmpl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImpl {
    public static void main(String[] args){
       // Being an interface the queue needs a concrete class for the declaration and the most common
        // classes are the PriorityQueue and LinkedList in Jav
        //neither of these implementations is thread-safe. PriorityBlockingQueue is only thread safe

        //Linked list -Queue follows the FIFO (First-In-First-Out)
        Queue<String> queue=new LinkedList<>();
        queue.add("violet");
        queue.add("indigo");
        queue.add("blue");
        queue.add("green");
        queue.add("yellow");
        queue.add("orange");
        queue.add("red");
        System.out.println("Queue: " + queue);

        // remove the element at the front of the queue
        queue.poll();//Removes and returns the element at the front of the queue. If the queue is empty, it returns null.
        queue.remove();//Removes and returns the element at the front of the queue. If the queue is empty, throws exception

        System.out.println("After remove Queue: " + queue);
        // // return at the element at the front of the queue
       String pos= queue.peek();//return and returns the element at the front of the queue. If the queue is empty, it returns null.
        String pos1=queue.element();//return and returns the element at the front of the queue. If the queue is empty, throws exception

        System.out.println("After Return Queue: " + pos +" "+pos1);
        System.out.println("Queue Size: " + queue.size());
        //using iterator
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // Implementing PriorityQueue -elements are dequeued based on their priority
        // String based on alphabetically and numbers based on ascending
        System.out.println("\n");
        Queue<String> pqueue=new PriorityQueue<>();
        pqueue.add("strawberry");
        pqueue.add("apple");
        pqueue.add("mango");
        pqueue.add("lychee");

        System.out.println("P Queue: " + pqueue);

        // remove the element at the front of the queue
        pqueue.poll();//Removes and returns the element at the front of the queue. If the queue is empty, it returns null.
        pqueue.remove();//Removes and returns the element at the front of the queue. If the queue is empty, throws exception

        System.out.println("After remove P Queue: " + pqueue);
        // // return at the element at the front of the queue
        String pos2= pqueue.peek();//return and returns the element at the front of the queue. If the queue is empty, it returns null.
        String pos3=pqueue.element();//return and returns the element at the front of the queue. If the queue is empty, throws exception

        System.out.println("After Return P Queue: " + pos2 +" "+pos3);
        System.out.println("P Queue Size: " + pqueue.size());
        //using iterator
        Iterator iterator1 = pqueue.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }





    }
}
