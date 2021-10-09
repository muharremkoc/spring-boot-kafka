package com.project.springbootkafka.service;

import com.project.springbootkafka.common.AppConstants;
import com.project.springbootkafka.model.User;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class KafkaConsumerService {

    @KafkaListener(topics = AppConstants.TOPIC_NAME_USER, groupId = AppConstants.GROUP_ID)
    public void consume(User user){
        System.out.println(user);
    }
}
