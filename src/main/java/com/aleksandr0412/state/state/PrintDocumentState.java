package com.aleksandr0412.state.state;

import com.aleksandr0412.state.Context;
import com.aleksandr0412.state.Document;

public class PrintDocumentState implements State {
    @Override
    public void insertMoney(Context context, int money) {
        context.addMoney(money);
    }

    @Override
    public void selectDevice(Context context, String device) {
        throw new UnsupportedOperationException("Firstly, print this document");
    }

    @Override
    public void selectDocument(Context context, Document document) {
        throw new UnsupportedOperationException("Firstly, print this document");
    }

    @Override
    public void print(Context context) {
        if (context.getMoney() < context.getPrice() * context.getDocument().getPageCount()) {
                throw new RuntimeException("Add money");
        }
        context.withdrawMoney(context.getPrice() * context.getDocument().getPageCount());
        System.out.println("Done");
        context.setState(new FinishState());
    }

    @Override
    public void returnMoney(Context context) {
        System.out.println("Take your Nickelback =)" + context.getMoney());
        context.setMoney(0);
        context.setState(new InitState());
    }
}
