package com.example.mqtt_message;

import com.example.mqtt_message.dto.Email;
import com.example.mqtt_message.queue.EmailProducer;
import com.example.mqtt_message.queue.Receiver;
import com.example.mqtt_message.topic.Consumer;
import com.example.mqtt_message.topic.Producer;
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

    @Autowired
    private Receiver receiver;

    @Test
    public void testSendMsg() {
        emailProducer.sendMsg("saeinin@kakao.com", "Hello");
        receiver.receiveMessage(new Email("saeinin@kakao.com", "Hello"));
    }
    @Test
    public void testSendTopic() throws InterruptedException {
        thread(new Producer(), false);
        thread(new Producer(), false);
        thread(new Consumer(), false);
        Thread.sleep(1000);
        thread(new Consumer(), false);
        thread(new Producer(), false);
        thread(new Consumer(), false);
        thread(new Producer(), false);
        Thread.sleep(1000);
        thread(new Consumer(), false);
        thread(new Producer(), false);
        thread(new Consumer(), false);
        thread(new Consumer(), false);
        thread(new Producer(), false);
        thread(new Producer(), false);
        Thread.sleep(1000);
        thread(new Producer(), false);
        thread(new Consumer(), false);
        thread(new Consumer(), false);
        thread(new Producer(), false);
        thread(new Consumer(), false);
        thread(new Producer(), false);
        thread(new Consumer(), false);
        thread(new Producer(), false);
        thread(new Consumer(), false);
        thread(new Consumer(), false);
        thread(new Producer(), false);
    }

    public static void thread(Runnable runnable, boolean deamon){
        Thread brokerThread = new Thread(runnable);
        brokerThread.setDaemon(deamon);
        brokerThread.start();
    }

}
