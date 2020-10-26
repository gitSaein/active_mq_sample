package com.example.mqtt_message.jms;

import com.example.mqtt_message.dto.Email;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Receiver {

    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiveMessage(Email email){
        log.info("Received < " + email + " >");
    }
}
