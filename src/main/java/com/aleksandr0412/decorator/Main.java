package com.aleksandr0412.decorator;

import com.aleksandr0412.decorator.chat.Chat;
import com.aleksandr0412.decorator.chat.ChatImpl;

public class Main {


    public static void main(String[] args) {
        Message message = new Message("qwe", "qwe", "qwe");
        Chat chat = new ChatImpl();
        chat.sendMessage(message);
        System.out.println(chat.receiveMessage());

        chat = new ChatDecoratorHideName(new ChatImpl());
        chat.sendMessage(message);
        System.out.println(chat.receiveMessage());

        chat = new ChatDecoratorHideBody(new ChatImpl());
        chat.sendMessage(message);
        System.out.println(chat.receiveMessage());
    }
}
