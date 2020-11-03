package com.example.mqtt_message.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/subscribe")
public class SubscribeTopic {

    @PostMapping("/messsage")
    public String publish(@RequestParam final String topic){
        return "Published Successfully";
    }
}
