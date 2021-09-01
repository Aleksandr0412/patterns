package com.aleksandr0412.chain.ruble;

import com.aleksandr0412.chain.banknote.BanknoteHandler;

public class FiveThousandRubleHandler extends RubleHandlerBase {

    private final int value = 5000;

    public FiveThousandRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }

}