package com.aleksandr0412.builder;

public class Content {

    private final String body;

    private final String signature;

    public Content(String body, String signature) {
        this.body = body;
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "body='" + body + '\'' +
                ", signature='" + signature + '\'';

    }
}