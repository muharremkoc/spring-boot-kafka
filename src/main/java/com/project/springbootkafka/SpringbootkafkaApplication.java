package com.project.springbootkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication

public class SpringbootkafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootkafkaApplication.class, args);
    }

}
