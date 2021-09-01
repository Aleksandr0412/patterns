package com.aleksandr0412.chain.dollar;

import com.aleksandr0412.chain.banknote.BanknoteHandler;

public class HundredDollarHandler extends DollarHandlerBase {

    private final int value = 100;

    public HundredDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
