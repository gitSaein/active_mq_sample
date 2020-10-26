package com.example.mqtt_message.dto;

import lombok.*;

@Setter
@Getter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class Email {

    String to;
    String body;

    @Override
    public String toString(){
        return String.format("Email{to=%s, body=%s}", getTo(), getBody());
    }

}
