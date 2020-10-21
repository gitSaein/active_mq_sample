package com.example.mqtt_message.jms;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JmsListener {

    @Autowired
    JmsTemplate jmsTemplate;

    public void send() {
        jmsTemplate.convertAndSend("msg", "startMsg: 1");
    }
}
