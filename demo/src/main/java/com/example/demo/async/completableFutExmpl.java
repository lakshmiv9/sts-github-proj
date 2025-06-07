package com.example.demo.async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class completableFutExmpl {
    public static void main(String args[]){
        //completableFuture is future object
        CompletableFuture<String> completableFuture= CompletableFuture.supplyAsync(()->{
          return "accept";
        }).thenApplyAsync(res->{  //execute the result of future object using applyAsync-tranforms result to an new value
            System.out.println(res + " ");
            return res.toUpperCase();
        }).exceptionally(ex->{
            System.out.println(ex.getMessage() + " " );
            return null;
        });

        //execute the result of future object using acceptAsync-just returns value
        completableFuture
                .thenAcceptAsync(result -> {
                    System.out.println(result + " ");  // Output: accept accept
                })
                .exceptionally(ex -> {
                    System.out.println("Exception: " + ex.getMessage());
                    return null;
                });
        try {
            TimeUnit.SECONDS.sleep(1); //Give time for async tasks to complete else main thread with exit before completing the task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
