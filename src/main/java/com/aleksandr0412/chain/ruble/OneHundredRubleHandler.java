package com.aleksandr0412.chain.ruble;

import com.aleksandr0412.chain.banknote.BanknoteHandler;

public class OneHundredRubleHandler extends RubleHandlerBase {

    private final int value = 100;

    public OneHundredRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }

}