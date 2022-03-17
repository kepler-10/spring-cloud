package com.kepler.message;

import com.kepler.dto.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author kepler
 * @Date 2022/3/17 16:35
 * @Version 1.0
 */

@Component
@Slf4j
public class Consumer {

    @Value("${kafka.topic.topic-test-transaction}")
    String topicTestTransaction;

    @KafkaListener(topics = {"${kafka.topic.topic-test-transaction}"}, id = "bookGroup")
    public void consumerMessage(Book book){
        log.info("消费者消费{}的消息 -> {}", topicTestTransaction, book.toString());
        throw new RuntimeException("dlt");
    }

    @KafkaListener(topics = {"${kafka.topic.topic-test-transaction}"}, id = "dltGroup")
    public void dltConsumeMessage(Book book){
        log.info("消费者消费{}的消息 -> {}", topicTestTransaction, book.toString());
    }
}
