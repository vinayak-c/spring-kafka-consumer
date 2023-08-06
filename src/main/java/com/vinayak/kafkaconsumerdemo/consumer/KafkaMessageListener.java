package com.vinayak.kafkaconsumerdemo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class KafkaMessageListener {

    @KafkaListener(topics = "kafka-auto-topic", groupId = "kafka-auto-group")
    public void consumer1(String message){
        log.info("Consumer1 consume the message {} ",message);
    }

    @KafkaListener(topics = "kafka-auto-topic", groupId = "kafka-auto-group")
    public void consumer2(String message){
        log.info("Consumer2 consume the message {} ",message);
    }

    @KafkaListener(topics = "kafka-auto-topic", groupId = "kafka-auto-group")
    public void consumer3(String message){
        log.info("Consumer3 consume the message {} ",message);
    }

    @KafkaListener(topics = "kafka-auto-topic", groupId = "kafka-auto-group")
    public void consumer4(String message){
        log.info("Consumer4 consume the message {} ",message);
    }
}
