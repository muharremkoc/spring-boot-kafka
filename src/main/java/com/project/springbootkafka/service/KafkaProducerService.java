package com.project.springbootkafka.service;

import com.project.springbootkafka.common.AppConstants;
import com.project.springbootkafka.model.User;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class KafkaProducerService {

    final KafkaTemplate<String,User> kafkaTemplate;

    public void saveCreateUser(User user){
        System.out.println(String.format("#### -> Producing user -> %s", user));
        this.kafkaTemplate.send(AppConstants.TOPIC_NAME_USER, user);
    }

}
