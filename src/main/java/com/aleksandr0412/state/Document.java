package com.aleksandr0412.state;

public class Document {

    private String name;
    private int pageCount;

    public Document(String name, int pageCount) {
        this.name = name;
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

}