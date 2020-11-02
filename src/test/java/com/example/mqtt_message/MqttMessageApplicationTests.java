package com.example.mqtt_message;

import com.example.mqtt_message.dto.Email;
import com.example.mqtt_message.queue.EmailProducer;
import com.example.mqtt_message.queue.Receiver;
import com.example.mqtt_message.topic.Publisher;
import com.example.mqtt_message.topic.Subscriber;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.JMSException;
import javax.naming.NamingException;

@RunWith(SpringRunner.class)
@SpringBootTest
class MqttMessageApplicationTests {

    @Autowired
    private EmailProducer emailProducer;

    @Autowired
    private Receiver receiver;

    @Autowired
    private Publisher publisher;

    @Autowired
    private Subscriber subscriber;

    @Test
    public void testSendMsg() {
        emailProducer.sendMsg("saeinin@kakao.com", "Hello");
        receiver.receiveMessage(new Email("saeinin@kakao.com", "Hello"));
    }

    @Test
    public void runSubscribe() {
        publisher.sendEmailTopic("saeinin@kakao.com", "hi hello bye");
        //subscriber.subscribe();
    }

}
