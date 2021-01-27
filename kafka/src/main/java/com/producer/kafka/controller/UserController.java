package com.producer.kafka.controller;

import com.producer.kafka.service.ConsumerService;
import com.producer.kafka.service.ProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/message")
public class UserController {
    private final ProducerService producerService;
    private final ConsumerService consumerService;

    public UserController(ProducerService producerService, ConsumerService consumerService) {
        this.producerService = producerService;
        this.consumerService = consumerService;
    }

    @PostMapping(value = "/publish")
    public String sendMessageToKafkaTopic(@RequestParam String message) {

        producerService.sendMessage(message);
        return "Successfully Send Message!"+"-->"+message;
    }



}
