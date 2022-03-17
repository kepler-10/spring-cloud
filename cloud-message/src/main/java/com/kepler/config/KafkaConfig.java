package com.kepler.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.RecordMessageConverter;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

/**
 * @Author kepler
 * @Date 2022/3/17 17:28
 * @Version 1.0
 */

@Configuration
public class KafkaConfig {
    @Value("${kafka.topic.topic-test-transaction}")
    String topicTestTransaction;

    @Value("${kafka.topic.topic-test-transaction2}")
    String topicTestTransaction2;

    @Bean
    public RecordMessageConverter jsonConverter(){
        return new StringJsonMessageConverter();
    }

    /**
     * 通过注入一个 NewTopic 类型的 Bean 来创建 topic，如果 topic 已存在，则会忽略。
     */
    @Bean
    public NewTopic myTopic(){
        return new NewTopic(topicTestTransaction, 2, (short)3);
    }
}
