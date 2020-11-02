package com.example.mqtt_message.topic;

import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

@Slf4j
public class Producer implements Runnable{
    public void run() {
        try {
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost");

            Connection connection = connectionFactory.createConnection();
            connection.start();

            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            Destination destination = session.createQueue("TEST.FOO");

            MessageProducer messageProducer = session.createProducer(destination);
            messageProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

            String text = "Hello world! from: " + Thread.currentThread().getName() + " : " +this.hashCode();
            TextMessage message = session.createTextMessage(text);

            log.info("Sent message: " + message.hashCode() + " : " + Thread.currentThread().getName());
            messageProducer.send(message);

            session.close();
            connection.close();

        } catch (Exception exception) {
            log.error(exception.getLocalizedMessage());
        }
    }
}
