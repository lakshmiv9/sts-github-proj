package com.example.demo.async;


import java.util.concurrent.Executors;

public class ListenableFutureExmpl {
    public static void main(String args[]){
       //add guava library to proceed with this else use javs SettableFuture which provide similar approach

        //submit task

        //add callback

        //Onsuccess fetch result & Onfailure fetch exception


   /*     ListeningExecutorService executor = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());

        // Submit a task that returns a string after 1 second delay
        ListenableFuture<String> future = executor.submit(() -> {
            TimeUnit.SECONDS.sleep(1);  // simulate delay
            return "accept";
        });

        // Add callback to handle success and failure
        Futures.addCallback(future, new FutureCallback<String>() {
            @Override
            public void onSuccess(String result) {
                System.out.println("Result: " + result.toLowerCase());
            }

            @Override
            public void onFailure(Throwable t) {
                System.out.println("Error: " + t.getMessage());
            }
        }, executor);

        // Wait for the task to complete before exiting
        future.get();

        executor.shutdown();*/

    }
}
