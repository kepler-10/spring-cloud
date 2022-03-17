package com.kepler.controller;

import com.kepler.dto.Book;
import com.kepler.message.Producer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author kepler
 * @Date 2022/3/17 17:43
 * @Version 1.0
 */

@RestController
@RequestMapping("/book")
@Slf4j
public class BookController {

    @Value("${kafka.topic.topic-test-transaction}")
    String topicTestTransaction;

    @Autowired
    private Producer producer;

    private AtomicLong atomicLong = new AtomicLong();

    @PostMapping("/sendMessage/{name}")
    public void sendMessageToKafkaTopic(@PathVariable("name") String name){
        log.info("send book message");
        producer.sendMessage(topicTestTransaction, new Book(atomicLong.addAndGet(1), name));
    }

}
