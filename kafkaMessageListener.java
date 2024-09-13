package com.javatechie.consumer;

import com.javatechie.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class kafkaMessageListener {
    Logger log= LoggerFactory.getLogger(kafkaMessageListener.class);

//    @KafkaListener(topics ="newdemo1",groupId = "ddemo1")
//    public void consumeEvents(Customer customer){
//        log.info("Consumer0 consumes the events {} ",customer.toString());
//    }
    @KafkaListener(topics ="newdemo2",groupId = "ddemo2",topicPartitions = {@TopicPartition(topic = "newdemo2", partitions = {"2"})})
     public void consume0(String message){
         log.info("Consumer0 consumes the message {} ",message);
     }

//    @KafkaListener(topics ="newdemo",groupId = "ddemo")
//    public void consume1(String message){
//        log.info("Consumer1 consumes the message {} ",message);
//    }
//
//    @KafkaListener(topics ="newdemo",groupId = "ddemo")
//    public void consume2(String message){
//        log.info("Consumer2 consumes the message {} ",message);
//    }

}
