package com.aleksandr0412.state.state;

import com.aleksandr0412.state.Context;
import com.aleksandr0412.state.Document;

public class FinishState implements State {
    @Override
    public void insertMoney(Context context, int money) {
        throw new UnsupportedOperationException("Give your money");
    }

    @Override
    public void selectDevice(Context context, String device) {
        throw new UnsupportedOperationException("Give your money");
    }

    @Override
    public void selectDocument(Context context, Document document) {
        context.setDocument(document);
        context.setState(new PrintDocumentState());
    }

    @Override
    public void print(Context context) {
        throw new UnsupportedOperationException("Give your money");
    }

    @Override
    public void returnMoney(Context context) {
        System.out.println("Take your Nickelback =)" + context.getMoney());
        context.setState(new InitState());
    }
}
