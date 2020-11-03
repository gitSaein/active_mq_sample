package com.example.mqtt_message.controller;

import com.example.mqtt_message.dto.Email;
import com.example.mqtt_message.topic.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/publish")
public class PublishController {

    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Publisher publisher;

    @PostMapping("/{message}")
    public String publish(@RequestParam Email email){
        publisher.sendEmailTopic(email);
        return "Published Successfully";
    }

}
