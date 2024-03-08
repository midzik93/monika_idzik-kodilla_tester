package com.kodilla.spring.basic.dependency_injection;

import javax.sound.midi.MetaMessage;

public class TextMessageSerive implements MessageService {
    @Override
    public void send(String message, String receiver) {
        System.out.println("Sending text [" + message + "] to: " + receiver);
    }
}
