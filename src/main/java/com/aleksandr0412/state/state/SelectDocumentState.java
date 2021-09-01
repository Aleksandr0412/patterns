package com.aleksandr0412.state.state;

import com.aleksandr0412.state.Context;
import com.aleksandr0412.state.Document;

public class SelectDocumentState implements State {

    @Override
    public void insertMoney(Context context, int money) {
        context.addMoney(money);
    }

    @Override
    public void selectDevice(Context context, String device) {
        throw new UnsupportedOperationException("Select document");
    }

    @Override
    public void selectDocument(Context context, Document document) {
        context.setDocument(document);
        context.setState(new PrintDocumentState());
    }

    @Override
    public void print(Context context) {
        throw new UnsupportedOperationException("Select document");
    }

    @Override
    public void returnMoney(Context context) {
        System.out.println("Take your Nickelback =)" + context.getMoney());
        context.setMoney(0);
        context.setState(new InitState());
    }
}
