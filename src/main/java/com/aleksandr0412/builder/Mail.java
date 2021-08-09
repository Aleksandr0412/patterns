package com.aleksandr0412.builder;

import java.util.Set;

public class Mail {

    private final String subject;

    private final String from;

    private final Set<String> to;

    private final Set<String> copy;

    private final Content content;

    public Mail(String subject, String from, Set<String> to, Set<String> copy, Content content) {
        this.subject = subject;
        this.from = from;
        this.to = to;
        this.copy = copy;
        this.content = content;
    }

    @Override
    public String toString() {
        return "subject='" + subject + '\'' +
                ", from='" + from + '\'' +
                ", to=" + to +
                ", copy=" + copy +
                content;
    }
}