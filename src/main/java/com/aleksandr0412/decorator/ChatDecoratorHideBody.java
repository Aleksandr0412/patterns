package com.aleksandr0412.decorator;

import com.aleksandr0412.decorator.chat.Chat;

public final class ChatDecoratorHideBody extends ChatDecorator{
    public ChatDecoratorHideBody(Chat chat) {
        super(chat);
    }

    @Override
    public void sendMessage(Message message) {
        message.body = new StringBuilder("secret").append(message.body).append("secret").toString();
        super.sendMessage(message);
    }

    @Override
    public Message receiveMessage() {
        var message = super.receiveMessage();
        message.body = message.body.replaceAll("secret", "");
        return message;
    }
}
