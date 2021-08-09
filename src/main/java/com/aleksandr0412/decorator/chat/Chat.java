package com.aleksandr0412.decorator.chat;

import com.aleksandr0412.decorator.Message;

public interface Chat {
    void sendMessage(Message message);
    Message receiveMessage();
}
