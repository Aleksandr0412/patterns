package com.aleksandr0412.state.state;

import com.aleksandr0412.state.Context;
import com.aleksandr0412.state.Document;

public class SelectDeviceState implements State{

    @Override
    public void insertMoney(Context context, int money) {
        context.addMoney(money);
    }

    @Override
    public void selectDevice(Context context, String device) {
        context.setDevice(device);
        context.setState(new SelectDocumentState());
    }

    @Override
    public void selectDocument(Context context, Document document) {
        throw new UnsupportedOperationException("Select device");
    }

    @Override
    public void print(Context context) {
        throw new UnsupportedOperationException("Select device");
    }

    @Override
    public void returnMoney(Context context) {
        System.out.println("Take your Nickelback =)" + context.getMoney());
        context.setMoney(0);
        context.setState(new InitState());
    }
}
