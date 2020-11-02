package com.example.mqtt_message.topic;

import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

@Slf4j
public class Consumer implements Runnable, ExceptionListener {
    public void run(){
        try{
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost");

            Connection connection = connectionFactory.createConnection();
            connection.start();

            connection.setExceptionListener(this);

            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            Destination destination = session.createQueue("TEST.FOO");

            MessageConsumer messageConsumer = session.createConsumer(destination);

            Message message = messageConsumer.receive(1000);

            if(message instanceof TextMessage){
                TextMessage textMessage = (TextMessage) message;
                String text = textMessage.getText();
                log.info("Received: " + text);
            }else{
                log.info("Received"  + message);
            }

            messageConsumer.close();
            session.close();
            connection.close();
        }
        catch (Exception exception){
            log.error(exception.getLocalizedMessage());
            exception.printStackTrace();
        }
    }

    @Override
    public void onException(JMSException exception) {
        log.error("JMS exception occurred. Shutting down client");
    }
}
