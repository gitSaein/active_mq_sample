package com.example.mqtt_message.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/publish")
public class ProducerResource {

    @Autowired
    JmsTemplate jmsTemplate;

    @GetMapping("/{message}")
    public String publish(@PathVariable("message") final String message){
        return "Published Successfully";
    }

}
