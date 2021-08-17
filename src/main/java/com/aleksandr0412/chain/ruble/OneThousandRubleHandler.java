package com.aleksandr0412.chain.ruble;

import com.aleksandr0412.chain.banknote.BanknoteHandler;

public class OneThousandRubleHandler extends RubleHandlerBase {
    private final int value = 1000;

    public OneThousandRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }

}