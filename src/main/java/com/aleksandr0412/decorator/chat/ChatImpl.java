package com.aleksandr0412.decorator.chat;

import com.aleksandr0412.decorator.Message;

public class ChatImpl implements Chat {
    private Message message;

    @Override
    public void sendMessage(Message message) {
        this.message = message;
        System.out.println("Отправка сообщения " + message.toString());
    }

    @Override
    public Message receiveMessage() {
        return message;

    }
}
