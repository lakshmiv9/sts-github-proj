package com.example.demo.async;

import java.util.concurrent.*;

public class executorExmpl {

    public static void main(String args[]){
        //create thread pool using executor service
        ExecutorService executorService= Executors.newFixedThreadPool(1);
        //create task using Callable- returns value
        Callable<String> task=()->{
          return "testing future obj";
        };
        // Submit the task to the executor and obtain a Future
        Future<String> future=executorService.submit(task);
        //access the future object
        try{
           String futureValue= future.get(); //.get is a blocking call
            System.out.println("Result from future: " + futureValue);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

// important to close the executor service
        executorService.shutdown();

    }
}
