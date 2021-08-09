package com.aleksandr0412.decorator;

import com.aleksandr0412.decorator.chat.Chat;

public abstract class ChatDecorator implements Chat {
    private Chat chat;

    public ChatDecorator(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(Message message) {
        chat.sendMessage(message);
    }

    @Override
    public Message receiveMessage() {
        return chat.receiveMessage();
    }
}
