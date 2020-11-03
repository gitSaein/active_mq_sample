package com.example.mqtt_message.topic;

import com.example.mqtt_message.dto.Email;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Publisher {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${jsa.activemq.topic}")
    private String topic;

    public void sendEmailTopic(Email email) {
        jmsTemplate.convertAndSend(topic, email);
        log.info("success send : " + email.getTo() + ": " + email.getBody());
    }
}

