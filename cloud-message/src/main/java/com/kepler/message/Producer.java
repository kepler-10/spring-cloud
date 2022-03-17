package com.kepler.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Author kepler
 * @Date 2022/3/17 17:22
 * @Version 1.0
 */

@Component
@Slf4j
public class Producer {
    private List<Object> sendBooks = new ArrayList<>();

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Transactional(rollbackFor = Exception.class)
    public void sendMessage(String topic, Object o){
        // 发送消息
        kafkaTemplate.send(topic, o);
        // 异常
        int a = 1/0;
        // 模拟业务
        sendBooks.add(o);
    }

}
