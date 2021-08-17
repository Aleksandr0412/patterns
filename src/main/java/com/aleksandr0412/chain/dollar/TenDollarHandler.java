package com.aleksandr0412.chain.dollar;

import com.aleksandr0412.chain.banknote.BanknoteHandler;

public class TenDollarHandler extends DollarHandlerBase {

    protected int value = 10;

    public TenDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
