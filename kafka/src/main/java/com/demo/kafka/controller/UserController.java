package com.demo.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserController {

    public static final String TOPIC = "test";
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    @GetMapping("/public/{message}")
    public String post(@PathVariable("message") final String message){

        kafkaTemplate.send(TOPIC,message);
        return "Push Successfully"+" "+message;
    }


}
