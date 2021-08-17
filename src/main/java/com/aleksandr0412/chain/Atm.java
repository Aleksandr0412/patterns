package com.aleksandr0412.chain;

import com.aleksandr0412.chain.banknote.BanknoteHandler;
import com.aleksandr0412.chain.banknote.CurrencyType;
import com.aleksandr0412.chain.dollar.FiftyDollarHandler;
import com.aleksandr0412.chain.dollar.HundredDollarHandler;
import com.aleksandr0412.chain.dollar.TenDollarHandler;
import com.aleksandr0412.chain.ruble.FiveHundredRubleHandler;
import com.aleksandr0412.chain.ruble.FiveThousandRubleHandler;
import com.aleksandr0412.chain.ruble.OneHundredRubleHandler;
import com.aleksandr0412.chain.ruble.OneThousandRubleHandler;

public class Atm {

    private BanknoteHandler handler;

    public Atm() {
        handler = new OneHundredRubleHandler(null);
        handler = new FiveHundredRubleHandler(handler);
        handler = new OneThousandRubleHandler(handler);
        handler = new FiveThousandRubleHandler(handler);
        handler = new TenDollarHandler(handler);
        handler = new FiftyDollarHandler(handler);
        handler = new HundredDollarHandler(handler);
    }

    public String getCash(CurrencyType type, int money) {
        if (money <= 0) {
            throw new RuntimeException("Sum less then zero");
        }
        var result = handler.validate(type, money).substring(3);

        return String.format("%s %s = %s", money, type, result);
    }
}