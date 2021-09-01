package com.aleksandr0412.state;

import com.aleksandr0412.state.state.InitState;
import com.aleksandr0412.state.state.State;

public class Context {
    private int price = 3;

    private State state;

    private int money;

    private String device;

    private Document document;

    public Context() {
        state = new InitState();
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public void insertMoney(int money) {
        state.insertMoney(this, money);
    }

    public void selectDevice(String device) {
        state.selectDevice(this, device);
    }

    public void selectDocument(Document document) {
        state.selectDocument(this, document);
    }

    public void print() {
        state.print(this);
    }

    public void getChange() {
        state.returnMoney(this);
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void withdrawMoney(int money) {
        this.money -= money;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Document getDocument() {
        return document;
    }
}
