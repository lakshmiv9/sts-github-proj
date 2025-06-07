package com.example.demo.async;

import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.concurrent.CompletableFuture;

public class KafkaConsumeAsync {
   @KafkaListener(topics = "test",groupId = "testId")
    public CompletableFuture<Void> receiveMessage(String message){

        return CompletableFuture.runAsync(()->{ //using run async as we are not returning anything
            System.out.println("result "+message);
        });
    }
}
