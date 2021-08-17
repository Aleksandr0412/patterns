package com.aleksandr0412.chain.ruble;

import com.aleksandr0412.chain.banknote.BanknoteHandler;

public class FiveHundredRubleHandler extends RubleHandlerBase {

    private final int value = 500;

    public FiveHundredRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }

}