package com.aleksandr0412.decorator;

public class Message {
    public String from;
    public String to;
    public String body;

    public Message(String from, String to, String body) {
        this.from = from;
        this.to = to;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", body='" + body + '\'' +
                '}' + "\n";
    }
}
