package com.aleksandr0412.chain;

import com.aleksandr0412.chain.banknote.BanknoteHandler;
import com.aleksandr0412.chain.dollar.FiftyDollarHandler;
import com.aleksandr0412.chain.dollar.HundredDollarHandler;
import com.aleksandr0412.chain.dollar.TenDollarHandler;
import com.aleksandr0412.chain.ruble.TenRubleHandler;

public class Bancomat {
    private BanknoteHandler handler;

    public Bancomat() {
        handler = new TenRubleHandler(null);
        handler = new TenDollarHandler(handler);
        handler = new FiftyDollarHandler(handler);
        handler = new HundredDollarHandler(handler);
    }

    public boolean validate(String banknote) {
        return handler.validate(banknote);
    }

}
