package com.aleksandr0412.chain.dollar;

import com.aleksandr0412.chain.banknote.BanknoteHandler;

public class FiftyDollarHandler extends DollarHandlerBase {

    protected int value = 50;

    public FiftyDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
