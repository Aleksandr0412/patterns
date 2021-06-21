package com.aleksandr0412.builder;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmailBuilder {

    public SubjectBuilder subject(String subject) {
        return new SubjectBuilderImpl(subject);
    }

    private class SubjectBuilderImpl implements SubjectBuilder {

        private final String subject;
        private String from;

        private SubjectBuilderImpl(String subject) {
            this.subject = subject;
            this.from = "Nameless";
        }

        @Override
        public SubjectBuilder from(String from) {
            this.from = from;
            return this;
        }

        @Override
        public ToBuilder to(String to) {
            return new ToBuilderImpl(subject, from, Set.of(to));
        }

        @Override
        public ToBuilder toAll(Collection<String> toAll) {
            return new ToBuilderImpl(subject, from, toAll);
        }

    }

    private class ToBuilderImpl implements ToBuilder {

        private final String subject;
        private final String from;
        private final Set<String> allAddresses = new LinkedHashSet<>();

        private ToBuilderImpl(String subject, String from, Collection<String> addresses) {
            this.subject = subject;
            this.from = from;
            this.allAddresses.addAll(addresses);
        }

        @Override
        public ToBuilder to(String to) {
            this.allAddresses.add(to);
            return this;
        }

        @Override
        public ToBuilder toAll(Collection<String> toAll) {
            this.allAddresses.addAll(toAll);
            return this;
        }

        @Override
        public CopyToBuilder copyTo(String copyTo) {
            return new CopyToBuilderImpl(subject, from, allAddresses, Set.of(copyTo));
        }

        @Override
        public CopyToBuilder copyToAll(Collection<String> copyToAll) {
            return new CopyToBuilderImpl(subject, from, allAddresses, copyToAll);
        }

        @Override
        public ContentBuilder content(Content content) {
            return new ContentBuilderImpl(subject, from, allAddresses, null, content);
        }

    }

    private class CopyToBuilderImpl implements CopyToBuilder {

        private final String subject;
        private final String from;
        private final Set<String> allAddresses;
        private final Set<String> allCopies = new LinkedHashSet<>();

        private CopyToBuilderImpl(String subject, String from, Set<String> addresses, Collection<String> copies) {
            this.subject = subject;
            this.from = from;
            this.allAddresses = addresses;
            this.allCopies.addAll(copies);
        }

        @Override
        public CopyToBuilder copyTo(String copyTo) {
            this.allCopies.add(copyTo);
            return this;
        }

        @Override
        public CopyToBuilder copyToAll(Collection<String> copyToAll) {
            this.allCopies.addAll(copyToAll);
            return this;
        }

        @Override
        public ContentBuilder content(Content content) {
            return new ContentBuilderImpl(subject, from, allAddresses, allCopies, content);
        }

    }

    private class ContentBuilderImpl implements ContentBuilder {

        private final String subject;
        private final String from;
        private final Set<String> allAddresses;
        private final Set<String> allCopies;
        private final Content content;

        private ContentBuilderImpl(String subject, String from, Set<String> toAll, Set<String> copyToAll, Content content) {
            this.subject = subject;
            this.from = from;
            this.allAddresses = toAll;
            this.allCopies = copyToAll;
            this.content = content;
        }

        @Override
        public Mail build() {
            return new Mail(subject, from, allAddresses, allCopies, content);
        }
    }

    public interface SubjectBuilder {
        SubjectBuilder from(String from);

        ToBuilder to(String to);

        ToBuilder toAll(Collection<String> toAll);

    }

    public interface ToBuilder {

        ToBuilder to(String to);

        ToBuilder toAll(Collection<String> toAll);

        CopyToBuilder copyTo(String copyTo);

        CopyToBuilder copyToAll(Collection<String> copyToAll);

        ContentBuilder content(Content content);

    }

    public interface CopyToBuilder {

        CopyToBuilder copyTo(String copyTo);

        CopyToBuilder copyToAll(Collection<String> copyToAll);

        ContentBuilder content(Content content);

    }

    public interface ContentBuilder {
        Mail build();
    }

}