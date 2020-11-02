package com.example.mqtt_message.topic;

import com.example.mqtt_message.dto.Email;
import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.ActiveMQTopic;
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

    public void sendEmailTopic(String email, String msg) {
        // jmsTemplate.setPubSubDomain(true); // pubsub 설정시 ...
        jmsTemplate.convertAndSend(topic, new Email(email, msg));
    }
}

