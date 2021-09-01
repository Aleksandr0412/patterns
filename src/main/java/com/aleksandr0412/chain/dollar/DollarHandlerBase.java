package com.aleksandr0412.chain.dollar;

import com.aleksandr0412.chain.banknote.BanknoteHandler;
import com.aleksandr0412.chain.banknote.CurrencyType;

public abstract class DollarHandlerBase extends BanknoteHandler {

    protected CurrencyType type = CurrencyType.USD;

    protected DollarHandlerBase(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected CurrencyType getCurrencyType() {
        return type;
    }

}