package com.kodilla.spring.basic.dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class EmailMessageSerive implements MessageService{
    @Override
    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " via Email";
    }
}
