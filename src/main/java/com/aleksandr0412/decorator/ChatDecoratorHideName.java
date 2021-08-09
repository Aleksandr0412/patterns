package com.aleksandr0412.decorator;

import com.aleksandr0412.decorator.chat.Chat;

public final class ChatDecoratorHideName extends ChatDecorator{
    public ChatDecoratorHideName(Chat chat) {
        super(chat);
    }
    private String from;

    @Override
    public void sendMessage(Message message) {
        this.from = message.from;
        message.from = message.from.replaceAll(".", "*");
        super.sendMessage(message);
    }

    @Override
    public Message receiveMessage() {
        var message = super.receiveMessage();
        message.from = from;
        return message;
    }
}
