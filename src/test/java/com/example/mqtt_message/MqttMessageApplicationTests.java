package com.example.mqtt_message;

import com.example.mqtt_message.dto.Email;
import com.example.mqtt_message.queue.Producer;
import com.example.mqtt_message.topic.Publisher;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class MqttMessageApplicationTests {

    @Autowired
    private Producer emailProducer;

    @Autowired
    private Publisher publisher;

    @Test
    public void testSendMsg() {
        emailProducer.sendMsg("saeinin@kakao.com", "Hello");
    }

    @Test
    public void runSubscribe() {
        publisher.sendEmailTopic(new Email("saeinin@kakao.com", "hi hello bye"));
    }
}
