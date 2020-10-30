package com.example.mqtt_message;

import com.example.mqtt_message.jms.EmailProducer;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MqttMessageApplicationTests {

    @Autowired
    private EmailProducer emailProducer;

    @Test
    public void testSendMsg() {
        emailProducer.sendMsg("saeinin@kakao.com", "Hello");
    }

}
