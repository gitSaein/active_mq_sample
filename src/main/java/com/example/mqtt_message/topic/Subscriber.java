package com.example.mqtt_message.topic;

import com.example.mqtt_message.dto.Email;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class Subscriber {

    @JmsListener(destination = "${jsa.activemq.topic}")
    public void receiveEmailTopic(Email email) {
        log.info("success Received: " + email.toString());
    }
}


