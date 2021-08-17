package com.aleksandr0412.chain.banknote;

import java.util.ArrayList;
import java.util.List;

public abstract class BanknoteHandler {

    private final BanknoteHandler nextHandler;

    protected BanknoteHandler(BanknoteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public String validate(CurrencyType type, int money) {

        List<Integer> data;
        String result = "";
        if (money == 0) {
            return result;
        }

        if ((type.equals(getCurrencyType())) && (money >= getValue())) {
            data = cash(money);
            result = String.format("%s + %sx%s", result, getValue(), data.get(0));
            money = data.get(1);
        }

        if (nextHandler == null) {
            return String.format("%s + %s You can't get this sum, try another", result, money);
        }

        return result + nextHandler.validate(type, money);
    }

    private List<Integer> cash(int value) {
        List<Integer> data = new ArrayList<>();
        data.add(value / getValue());
        data.add(value % getValue());
        return data;
    }

    protected abstract int getValue();

    protected abstract CurrencyType getCurrencyType();

}
