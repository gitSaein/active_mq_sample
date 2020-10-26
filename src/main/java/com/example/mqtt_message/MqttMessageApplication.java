package com.example.mqtt_message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;

@SpringBootApplication
@EnableJms
public class MqttMessageApplication {

//    public JmsListenerContainerFactory<?> myFactory(ConnectionFactory connectionFactory,
//                                                    DefaultJmsListenerContainerFactoryConfigurer configurer){
//        DefaultJmsListenerContainerFactory defaultJmsListenerContainerFactory =
//                new DefaultJmsListenerContainerFactory();
//        configurer.
//    }

    public static void main(String[] args) {
        SpringApplication.run(MqttMessageApplication.class, args);
    }

}
