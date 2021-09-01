package com.aleksandr0412.state.state;

import com.aleksandr0412.state.Context;
import com.aleksandr0412.state.Document;

public class InitState implements State {

    @Override
    public void insertMoney(Context context, int money) {
        context.setMoney(money);
        context.setState(new SelectDeviceState());
    }

    @Override
    public void selectDevice(Context context, String device) {
        throw new UnsupportedOperationException("Deposit money");
    }

    @Override
    public void selectDocument(Context context, Document document) {
        throw new UnsupportedOperationException("Deposit money");
    }

    @Override
    public void print(Context context) {
        throw new UnsupportedOperationException("Deposit money");
    }

    @Override
    public void returnMoney(Context context) {
        System.out.println("Take your Nickelback =)" + context.getMoney());
        context.setMoney(0);
    }
}
