package com.aleksandr0412.chain.ruble;

import com.aleksandr0412.chain.banknote.BanknoteHandler;
import com.aleksandr0412.chain.banknote.CurrencyType;

public abstract class RubleHandlerBase extends BanknoteHandler {

    protected CurrencyType type = CurrencyType.RUB;

    protected RubleHandlerBase(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected CurrencyType getCurrencyType() {
        return type;
    }
}


