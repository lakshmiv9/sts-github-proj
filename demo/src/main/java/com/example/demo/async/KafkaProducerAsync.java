package com.example.demo.async;

import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;

import java.util.concurrent.CompletableFuture;

public class KafkaProducerAsync {
    @Autowired
     KafkaTemplate<String,String> kafkaTemplate;
public void sendMessage(String topic, String key, String message) {
    CompletableFuture<SendResult<String, String>> resultCompletableFuture = kafkaTemplate.send(topic, key, message).completable();
    resultCompletableFuture
            .thenAcceptAsync(res->{
             System.out.println("Result"+res.getRecordMetadata());
                })
            .exceptionally(ex->{
                System.out.println("Exception "+ex.getMessage());
                return null;
            });

}
}

